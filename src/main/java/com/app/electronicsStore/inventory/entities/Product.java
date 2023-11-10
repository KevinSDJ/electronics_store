package com.app.electronicsStore.inventory.entities;

import java.util.UUID;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("Product")
public class Product {

    @Id
    private UUID code;
    private String title;
}
