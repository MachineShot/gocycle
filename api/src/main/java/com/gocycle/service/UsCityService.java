package com.gocycle.service;

import com.gocycle.entity.UsCity;
import com.gocycle.repository.UsCityRepository;
import lombok.extern.slf4j.Slf4j;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.PrecisionModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
public class UsCityService {
    @Autowired
    private UsCityRepository repo;

    // WGS-84 SRID
    private GeometryFactory factory = new GeometryFactory(new PrecisionModel(), 4326);

    public Page<UsCity> findAll(Pageable page){
        return repo.findAll(page);
    }

    public List<UsCity> findAround(double lat, double lon, double distanceM){
        log.info("Looking for city around ({},{}) withing {} meters", lat, lon, distanceM);
        Point p = factory.createPoint(new Coordinate(lon, lat));
        return repo.findNearWithinDistance(p, distanceM);
    }
}
