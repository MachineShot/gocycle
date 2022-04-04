package com.gocycle.entity;

import javax.persistence.*;

@Entity
@Table(name = "road")
public class Road {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "road_id", nullable = false)
    private Integer id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "road_id", nullable = false)
    private TripRoad tripRoad;

    @Column(name = "line")
    private String line;

    @Lob
    @Column(name = "quality")
    private String quality;

    @Column(name = "speed")
    private Double speed;

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getLine() {
        return line;
    }

    public void setLine(String line) {
        this.line = line;
    }

    public TripRoad getTripRoad() {
        return tripRoad;
    }

    public void setTripRoad(TripRoad tripRoad) {
        this.tripRoad = tripRoad;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}