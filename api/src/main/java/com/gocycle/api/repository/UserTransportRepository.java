package com.gocycle.api.repository;

import com.gocycle.api.entity.UserTransport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTransportRepository extends JpaRepository<UserTransport, Integer> {
}