package com.gocycle.repository;

import com.gocycle.entity.UsCity;
import org.locationtech.jts.geom.Point;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UsCityRepository extends JpaRepository<UsCity, Long> {
    @Query(value="SELECT * from us_cities where ST_DistanceSphere(geom, :p) < :distanceM", nativeQuery = true)
    List<UsCity> findNearWithinDistance(Point p, double distanceM);
}