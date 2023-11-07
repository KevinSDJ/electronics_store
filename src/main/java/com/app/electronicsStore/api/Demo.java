package com.app.electronicsStore.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.app.electronicsStore.entities.Product;
import com.app.electronicsStore.repo.ProductRepo;
import reactor.core.publisher.Flux;
//import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/api/")
public class Demo {

    @Autowired
    private ProductRepo productRepo;

    @GetMapping("/")
    public Flux<Product> getApi(){

        return productRepo.findAll();
    }
    
}
