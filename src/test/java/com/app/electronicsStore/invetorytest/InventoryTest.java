package com.app.electronicsStore.invetorytest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.app.electronicsStore.inventory.entities.Product;
import com.app.electronicsStore.inventory.entities.ProductDetail;
import com.app.electronicsStore.inventory.service.ProductsService;
import reactor.test.StepVerifier;

@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class InventoryTest {

    @Autowired
    ProductsService productsService;


    @Test
    @Order(1)
    @DisplayName("Test save base product")
    void testSave1(){
        Product product = new Product();
        product.setTitle("computadora");
        product.setDetails(new ProductDetail("tuf 15", null, null));
        product.setPrice(340000);
        StepVerifier.create(productsService.persistProduct(product).log())
        .expectComplete()
        .verify();
    }
    @Test
    @Order(2)
    @DisplayName("Test reject duplicate")
    void testSave2(){

    }
    
}
