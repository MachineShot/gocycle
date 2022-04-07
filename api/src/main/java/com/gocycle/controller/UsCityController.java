package com.gocycle.controller;

import com.gocycle.entity.UsCity;
import com.gocycle.service.UsCityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("uscity")
public class UsCityController {
    @Autowired
    private UsCityService service;

    @GetMapping
    public Page<UsCity> getCityPage(Pageable pageable){
        return service.findAll(pageable);
    }

    @GetMapping("{lat}/{lon}/{distanceM}")
    public List<UsCity> getCityNear(
            @PathVariable double lat,
            @PathVariable double lon,
            @PathVariable double distanceM){
        return service.findAround(lat, lon, distanceM);
    }
}
