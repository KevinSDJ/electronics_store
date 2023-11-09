package com.app.electronicsStore.api.endpoint;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.electronicsStore.inventory.entities.Product;
import com.app.electronicsStore.inventory.repository.ProductRepo;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api/")
public class Demo {

    private final ProductRepo productRepo;
    
    public Demo(ProductRepo repo){
        this.productRepo=repo;
    }

    @GetMapping
    public Flux<Product> getApi(){

        return productRepo.findAll();
    }
    
}
