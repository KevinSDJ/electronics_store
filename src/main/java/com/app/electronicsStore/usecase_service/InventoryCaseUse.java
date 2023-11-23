package com.app.electronicsStore.usecase_service;

import reactor.core.publisher.Mono;

public interface InventoryCaseUse<T,S> {

    Mono<T> persistProduct(T t);
}
