package com.gocycle.repository;

import com.gocycle.entity.Road;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoadRepository extends JpaRepository<Road, Integer> {
}