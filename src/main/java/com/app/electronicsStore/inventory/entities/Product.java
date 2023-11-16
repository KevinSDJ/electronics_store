package com.app.electronicsStore.inventory.entities;

import java.util.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.relational.core.mapping.Table;

@Table("Products")
public class Product {

    @Id
    private UUID code;
    private String title;
    @Transient
    private ProductDetail details;
    @Transient
    private Fabricant fabricant;
    private float price;
    public Product(String title, ProductDetail details, Fabricant fabricant, float price) {
        this.title = title;
        this.details = details;
        this.fabricant = fabricant;
        this.price = price;
    }
    public Product() {
    }
    public UUID getCode() {
        return code;
    }
    public void setCode(UUID code) {
        this.code = code;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public ProductDetail getDetails() {
        return details;
    }
    public void setDetails(ProductDetail details) {
        this.details = details;
    }
    public Fabricant getFabricant() {
        return fabricant;
    }
    public void setFabricant(Fabricant fabricant) {
        this.fabricant = fabricant;
    }
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [code=" + code + ", title=" + title + ", details=" + details + ", fabricant=" + fabricant
                + ", price=" + price + "]";
    }

    
}
