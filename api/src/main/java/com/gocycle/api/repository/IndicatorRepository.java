package com.gocycle.api.repository;

import com.gocycle.api.entity.Indicator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IndicatorRepository extends JpaRepository<Indicator, Integer> {
    List<Indicator> findByNameContaining(String name);
}