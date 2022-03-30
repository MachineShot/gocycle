package com.gocycle.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "road")
public class Road {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "id", nullable = false)
    private TripRoad tripRoad;

    @Column(name = "quality")
    private Double quality;

    @Column(name = "speed")
    private Double speed;

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getQuality() {
        return quality;
    }

    public void setQuality(Double quality) {
        this.quality = quality;
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