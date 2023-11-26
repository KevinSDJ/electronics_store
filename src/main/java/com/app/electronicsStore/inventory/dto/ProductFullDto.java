package com.app.electronicsStore.inventory.dto;

import java.util.UUID;
import com.app.electronicsStore.inventory.entities.Fabricant;
import com.app.electronicsStore.inventory.entities.Product;
import com.app.electronicsStore.inventory.entities.ProductDetail;

public record ProductFullDto(
    UUID code,
    String title,
    ProductDetail details,
    Fabricant fabricant,
    float price) {

    public Product toEntity(){
        
        return Product.builder().code(code)
        .title(title)
        .details_id((details==null? null: details.getId()))
        .fabricant_id((fabricant==null? null: fabricant.getId()))
        .build();
    }
}
