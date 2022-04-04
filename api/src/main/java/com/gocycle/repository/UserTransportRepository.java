package com.gocycle.repository;

import com.gocycle.entity.UserTransport;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserTransportRepository extends JpaRepository<UserTransport, Integer> {
}