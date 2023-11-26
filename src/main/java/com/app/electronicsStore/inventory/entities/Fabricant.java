package com.app.electronicsStore.inventory.entities;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Table("Fabricants")
@Getter
@Setter
@NoArgsConstructor
public class Fabricant {

    @Id
    private int id;
    private String company_name;
    private byte[] logo;
}
