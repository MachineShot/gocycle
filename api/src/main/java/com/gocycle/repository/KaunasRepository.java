package com.gocycle.repository;

import com.gocycle.entity.Kaunas;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "kaunas", path = "kaunas")
public interface KaunasRepository extends JpaRepository<Kaunas, Integer> {
}
