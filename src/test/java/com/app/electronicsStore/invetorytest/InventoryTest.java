package com.app.electronicsStore.invetorytest;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.app.electronicsStore.inventory.entities.Fabricant;
import com.app.electronicsStore.inventory.entities.Product;
import com.app.electronicsStore.inventory.entities.ProductDetail;
import com.app.electronicsStore.inventory.repository.ProductRepo;
import reactor.test.StepVerifier;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class InventoryTest {

    @Autowired
    ProductRepo productRepo;

    @Test
    @Order(1)
    void testSave(){
        Product product = new Product();
        product.setTitle("computadora");
        product.setFabricant(new Fabricant("asus", null));
        product.setDetails(new ProductDetail("tuf 15", null, null));
        product.setPrice(340000);
        StepVerifier.create(productRepo.save(product))
        .expectComplete()
        .verify();
    }
    
}
