package com.gocycle.api.controller;

import com.gocycle.api.entity.Indicator;
import com.gocycle.api.repository.IndicatorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class IndicatorController {
    @Autowired
    IndicatorRepository indicatorRepository;
    @GetMapping("/indicators")
    public ResponseEntity<List<Indicator>> getAllIndicators(@RequestParam(required = false) String name) {
        try {
            List<Indicator> indicators = new ArrayList<Indicator>();
            if (name == null)
                indicatorRepository.findAll().forEach(indicators::add);
            else
                indicatorRepository.findByNameContaining(name).forEach(indicators::add);
            if (indicators.isEmpty()) {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }
            return new ResponseEntity<>(indicators, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/indicators/{id}")
    public ResponseEntity<Indicator> getIndicatorById(@PathVariable("id") Integer id) {
        Optional<Indicator> indicatorData = indicatorRepository.findById(id);
        if (indicatorData.isPresent()) {
            return new ResponseEntity<>(indicatorData.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("/indicators")
    public ResponseEntity<Indicator> createIndicator(@RequestBody Indicator indicator) {
        try {
            Indicator _indicator = indicatorRepository
                    .save(new Indicator(indicator.getName()));
            return new ResponseEntity<>(_indicator, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PutMapping("/indicators/{id}")
    public ResponseEntity<Indicator> updateIndicator(@PathVariable("id") Integer id, @RequestBody Indicator indicator) {
        Optional<Indicator> indicatorData = indicatorRepository.findById(id);
        if (indicatorData.isPresent()) {
            Indicator _indicator = indicatorData.get();
            _indicator.setName(indicator.getName());
            _indicator.setTripIndicator(indicator.getTripIndicator());
            return new ResponseEntity<>(indicatorRepository.save(_indicator), HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
    @DeleteMapping("/indicators/{id}")
    public ResponseEntity<HttpStatus> deleteIndicator(@PathVariable("id") Integer id) {
        try {
            indicatorRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/indicators")
    public ResponseEntity<HttpStatus> deleteAllIndicators() {
        try {
            indicatorRepository.deleteAll();
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
