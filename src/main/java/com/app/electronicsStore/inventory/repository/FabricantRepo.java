package com.app.electronicsStore.inventory.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import com.app.electronicsStore.inventory.entities.Fabricant;

@Repository
public interface FabricantRepo extends ReactiveCrudRepository<Fabricant,Long>{
}
