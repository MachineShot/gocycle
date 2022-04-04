package com.gocycle.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "trip_road")
public class TripRoad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_road_id", nullable = false)
    private Integer id;

    @Column(name = "\"startTimestamp\"")
    private Instant startTimestamp;

    @Column(name = "\"endTimestamp\"")
    private Instant endTimestamp;

    @Column(name = "\"startPoint\"")
    private String startPoint;

    @Column(name = "\"endPoint\"")
    private String endPoint;

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