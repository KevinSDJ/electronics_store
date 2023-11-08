package com.app.electronicsStore.repo;

import java.util.UUID;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import com.app.electronicsStore.entities.Product;

@Repository
public interface ProductRepo extends ReactiveCrudRepository<Product,UUID> {
}
