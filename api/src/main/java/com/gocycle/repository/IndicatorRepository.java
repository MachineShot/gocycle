package com.gocycle.repository;

import com.gocycle.entity.Indicator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(collectionResourceRel = "indicators", path = "indicators")
public interface IndicatorRepository extends JpaRepository<Indicator, Integer> {
    List<Indicator> findByNameContaining(String name);
}