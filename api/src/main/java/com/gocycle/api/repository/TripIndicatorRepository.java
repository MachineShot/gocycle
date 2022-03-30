package com.gocycle.api.repository;

import com.gocycle.api.entity.TripIndicator;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripIndicatorRepository extends JpaRepository<TripIndicator, Integer> {
}