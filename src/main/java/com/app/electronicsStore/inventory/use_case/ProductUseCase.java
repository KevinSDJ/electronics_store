package com.app.electronicsStore.inventory.use_case;

import com.app.electronicsStore.inventory.dto.out.ProductFullDto;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ProductUseCase {

    Mono<?> persistProduct(ProductFullDto t);
    Flux<?> getProducts();
}
