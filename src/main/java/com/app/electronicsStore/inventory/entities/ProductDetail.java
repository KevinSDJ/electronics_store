package com.app.electronicsStore.inventory.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("ProductDetails")
public class ProductDetail{


    @Id
    private Integer id;
    private String model;
    private String description;
    private String technical_data;
    public ProductDetail(String model, String description, String technical_data) {
        this.model = model;
        this.description = description;
        this.technical_data = technical_data;
    }
    public ProductDetail() {
    }
    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getTechnical_data() {
        return technical_data;
    }
    public void setTechnical_data(String technical_data) {
        this.technical_data = technical_data;
    }
    @Override
    public String toString() {
        return "ProductDetail [id=" + id + ", model=" + model + ", description=" + description + ", technical_data="
                + technical_data + "]";
    }

}