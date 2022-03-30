package com.gocycle.api.entity;

import javax.persistence.*;
import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "trip_road")
public class TripRoad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "\"startTimestamp\"", nullable = false)
    private Instant startTimestamp;

    @Column(name = "\"endTimestamp\"", nullable = false)
    private Instant endTimestamp;

    @Column(name = "\"startPoint\"", nullable = false)
    private String startPoint;

    @Column(name = "\"endPoint\"", nullable = false)
    private String endPoint;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "tripRoad")
    private Trip trip;

    @OneToMany(mappedBy = "tripRoad")
    private List<Road> road;

    public List<Road> getRoad() {
        return road;
    }

    public void setRoad(List<Road> road) {
        this.road = road;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public Instant getEndTimestamp() {
        return endTimestamp;
    }

    public void setEndTimestamp(Instant endTimestamp) {
        this.endTimestamp = endTimestamp;
    }

    public Instant getStartTimestamp() {
        return startTimestamp;
    }

    public void setStartTimestamp(Instant startTimestamp) {
        this.startTimestamp = startTimestamp;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}