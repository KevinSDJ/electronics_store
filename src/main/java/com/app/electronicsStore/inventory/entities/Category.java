package com.app.electronicsStore.inventory.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table("categories")
@Getter
@Setter
@NoArgsConstructor
public class Category {

    @Id
    private long id;
    private String name;
}
