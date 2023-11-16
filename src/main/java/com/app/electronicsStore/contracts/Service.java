package com.app.electronicsStore.contracts;

import java.util.Collection;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface Service<T,S> {
    Flux<T> getAll();
    Mono<T> getById(S id);
    Mono<Void> deleteById(S id);
    Mono<Void> delete(T obj);
    Mono<T> persist(T obj);
    Mono<T> getOrPersist( T obj);
    Mono<Void> persistAll(Collection<T> objs);
}
