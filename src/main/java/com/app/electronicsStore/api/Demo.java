package com.app.electronicsStore.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.electronicsStore.entities.Product;
import com.app.electronicsStore.repo.ProductRepo;
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
