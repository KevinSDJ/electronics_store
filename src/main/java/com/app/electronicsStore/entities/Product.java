package com.app.electronicsStore.entities;

import java.util.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("products")
public class Product {

    @Id
    private UUID code;
    private String title;
    private float price;
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
    public float getPrice() {
        return price;
    }
    public void setPrice(float price) {
        this.price = price;
    }
    @Override
    public String toString() {
        return "Product [code=" + code + ", title=" + title + ", price=" + price + "]";
    }
}
