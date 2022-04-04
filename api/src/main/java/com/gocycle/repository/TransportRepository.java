package com.gocycle.repository;

import com.gocycle.entity.Transport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportRepository extends JpaRepository<Transport, Integer> {
}