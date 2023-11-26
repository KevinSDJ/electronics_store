package com.app.electronicsStore.inventory.use_case;

import com.app.electronicsStore.inventory.dto.ProductFullDto;
import reactor.core.publisher.Mono;

public interface InventoryCaseUse<T,S> {

    Mono<T> persistProduct(ProductFullDto t);
}
