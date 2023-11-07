package com.app.electronicsStore.entities;

import java.util.UUID;
import org.springframework.data.annotation.Id;

public class Product {

    @Id
    private UUID id;
    private String title;
    private float price;
    public Product(UUID id, String title, float price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }
    public Product() {
    }
    public UUID getId() {
        return id;
    }
    public void setId(UUID id) {
        this.id = id;
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
        return "Product [id=" + id + ", title=" + title + ", price=" + price + "]";
    }
}
