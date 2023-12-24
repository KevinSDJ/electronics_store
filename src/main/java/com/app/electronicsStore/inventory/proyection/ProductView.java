package com.app.electronicsStore.inventory.proyection;

import java.util.UUID;

public interface ProductView {
    UUID getCode();
    String getTitle();
    float getPrice();
}
