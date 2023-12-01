package com.app.electronicsStore.inventory.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table("Products_detail")
@Getter
@Setter
@NoArgsConstructor
@ToString
public class ProductDetail{

    @Id
    private Integer id;
    private String model;
    private String description;
    private String technical_data;

}