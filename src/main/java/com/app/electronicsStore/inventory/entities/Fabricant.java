package com.app.electronicsStore.inventory.entities;

import java.util.Arrays;

import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("Fabricants")
public class Fabricant {

    @Id
    private long id;
    private String company_name;
    private byte[] logo;
    public Fabricant(String company_name, byte[] logo) {
        this.company_name = company_name;
        this.logo = logo;
    }
    public Fabricant() {
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getCompany_name() {
        return company_name;
    }
    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
    public byte[] getLogo() {
        return logo;
    }
    public void setLogo(byte[] logo) {
        this.logo = logo;
    }
    @Override
    public String toString() {
        return "Fabricant [id=" + id + ", company_name=" + company_name + ", logo=" + Arrays.toString(logo) + "]";
    }
 
}
