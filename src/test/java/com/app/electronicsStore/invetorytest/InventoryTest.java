package com.app.electronicsStore.invetorytest;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import com.app.electronicsStore.inventory.dto.ProductFullDto;
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
        ProductDetail pd= new ProductDetail();
        pd.setTechnical_data("blablabla lenguaje");
        ProductFullDto product= new ProductFullDto(null,
         "Asus Rog", pd, null, 3000000);
        StepVerifier.create(productsService.persistProduct(product).log())
        .expectNextCount(1)
        .verifyComplete();
    }
    @Test
    @Order(2)
    @DisplayName("Test reject duplicate")
    void testSave2(){

    }
    
}
