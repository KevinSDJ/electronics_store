package com.app.electronicsStore.inventory.service;

import java.util.UUID;
import org.springframework.stereotype.Service;
import com.app.electronicsStore.inventory.dto.ProductFullDto;
import com.app.electronicsStore.inventory.entities.Product;
import com.app.electronicsStore.inventory.entities.ProductDetail;
import com.app.electronicsStore.inventory.repository.ProductDetailsRepo;
import com.app.electronicsStore.inventory.repository.ProductRepo;
import com.app.electronicsStore.inventory.use_case.InventoryCaseUse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class ProductsService implements InventoryCaseUse<Product,UUID>{

    private final ProductRepo productRepo;
    private final ProductDetailsRepo detailsRepo;

    public ProductsService(ProductRepo repo, ProductDetailsRepo detRepo){
        this.productRepo=repo;
        this.detailsRepo=detRepo;
    }

    
    @Override
    public Mono<Product> persistProduct(ProductFullDto t) {
        Product pr= t.toEntity();
        return t.details()==null?
        productRepo.save(pr)
        : 
        detailsRepo.save(t.details())
        .flatMap(e-> Mono.just(updateDetails(pr, e)))
        .flatMap(productRepo::save);
    }

    private Product updateDetails(Product p, ProductDetail pd){
        p.setDetails_id(pd.getId());
        return p;
    }


    @Override
    public Flux<Product> getProducts() {
        return productRepo.findAll();
    }
}
