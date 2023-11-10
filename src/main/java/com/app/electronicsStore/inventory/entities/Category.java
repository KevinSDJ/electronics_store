package com.app.electronicsStore.inventory.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("category")
public class Category {

    @Id
    private long id;
    private String name;

    
}
