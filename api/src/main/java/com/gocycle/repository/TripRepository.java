package com.gocycle.repository;

import com.gocycle.entity.Trip;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TripRepository extends JpaRepository<Trip, Integer> {
}