package com.app.electronicsStore.inventory.service;

import java.util.UUID;
import org.springframework.stereotype.Service;
import com.app.electronicsStore.inventory.entities.Product;
import com.app.electronicsStore.inventory.entities.ProductDetail;
import com.app.electronicsStore.inventory.repository.ProductDetailsRepo;
import com.app.electronicsStore.inventory.repository.ProductRepo;
import com.app.electronicsStore.usecase_service.InventoryCaseUse;
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
    public Mono<Product> persistProduct(Product t) {
        
        return detailsRepo.save(t.getDetails())
        .doOnSuccess(e-> Mono.just(e))
        .flatMap(f-> updateDetails(t,f))
        .flatMap(e-> productRepo.save(e).log())
        .flatMap(e->{
                try {
                    if(e==null){
                        throw new Exception("Error save product");
                    }
                    return Mono.just(e);
                } catch (Exception e1) {
                    return Mono.empty();
                }
            
        });
        
    }

    private Mono<Product> updateDetails(Product p, ProductDetail pd){
        p.setDetails(pd);
        return Mono.just(p);
    }
}
