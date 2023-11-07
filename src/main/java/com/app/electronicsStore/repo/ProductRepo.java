package com.app.electronicsStore.repo;

import java.util.UUID;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import com.app.electronicsStore.entities.Product;

public interface ProductRepo extends ReactiveCrudRepository<Product,UUID> {
    
}
