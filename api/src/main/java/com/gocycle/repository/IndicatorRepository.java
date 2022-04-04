package com.gocycle.repository;

import com.gocycle.entity.Indicator;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IndicatorRepository extends JpaRepository<Indicator, Integer> {
    List<Indicator> findByNameContaining(String name);
}