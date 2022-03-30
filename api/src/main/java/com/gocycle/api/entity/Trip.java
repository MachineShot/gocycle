package com.gocycle.api.entity;

import javax.persistence.*;
import java.time.Instant;
import java.time.LocalTime;

@Entity
@Table(name = "trip")
public class Trip {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private TripIndicator tripIndicator;

    @Column(name = "\"timestamp\"", nullable = false)
    private Instant timestamp;

    @Column(name = "duration", nullable = false)
    private LocalTime duration;

    @Column(name = "\"avgSpeed\"", nullable = false)
    private Double avgSpeed;

    @Column(name = "\"maxSpeed\"", nullable = false)
    private Double maxSpeed;

    @Column(name = "calories", nullable = false)
    private Integer calories;

    @Column(name = "altitude", nullable = false)
    private Double altitude;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "trip")
    private User user;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    private TripRoad tripRoad;

    public TripRoad getTripRoad() {
        return tripRoad;
    }

    public void setTripRoad(TripRoad tripRoad) {
        this.tripRoad = tripRoad;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Double getAltitude() {
        return altitude;
    }

    public void setAltitude(Double altitude) {
        this.altitude = altitude;
    }

    public Integer getCalories() {
        return calories;
    }

    public void setCalories(Integer calories) {
        this.calories = calories;
    }

    public Double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Double getAvgSpeed() {
        return avgSpeed;
    }

    public void setAvgSpeed(Double avgSpeed) {
        this.avgSpeed = avgSpeed;
    }

    public LocalTime getDuration() {
        return duration;
    }

    public void setDuration(LocalTime duration) {
        this.duration = duration;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public TripIndicator getTripIndicator() {
        return tripIndicator;
    }

    public void setTripIndicator(TripIndicator tripIndicator) {
        this.tripIndicator = tripIndicator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}