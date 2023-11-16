package com.app.electronicsStore.inventory.service;

import java.util.Collection;
import java.util.UUID;
import org.springframework.stereotype.Service;
import com.app.electronicsStore.inventory.entities.Product;
import com.app.electronicsStore.inventory.repository.ProductRepo;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class InventoryService  implements com.app.electronicsStore.contracts.Service<Product,UUID>{

    private final ProductRepo productRepo;
    
    public InventoryService(ProductRepo repo){
        this.productRepo=repo;
    }

    @Override
    public Flux<Product> getAll() {
        return productRepo.findAll();
    }

    @Override
    public Mono<Product> getById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getById'");
    }

    @Override
    public Mono<Void> deleteById(UUID id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

    @Override
    public Mono<Void> delete(Product obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public Mono<Product> persist(Product obj) {
        return productRepo.save(obj);
    }

    @Override
    public Mono<Void> persistAll(Collection<Product> objs) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'persistAll'");
    }

    @Override
    public Mono<Product> getOrPersist(Product obj) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getOrPersist'");
    }
    
}
