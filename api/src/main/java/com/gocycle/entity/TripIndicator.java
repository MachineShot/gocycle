package com.gocycle.entity;

import javax.persistence.*;
import java.time.Instant;

@Entity
@Table(name = "trip_indicator")
public class TripIndicator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_indicator_id", nullable = false)
    private Integer id;

    @MapsId
    @OneToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "trip_indicator_id", nullable = false)
    private Indicator indicator;

    @Column(name = "\"timestamp\"")
    private Instant timestamp;

    @Column(name = "point")
    private String point;

    public String getPoint() {
        return point;
    }

    public void setPoint(String point) {
        this.point = point;
    }

    public Instant getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Instant timestamp) {
        this.timestamp = timestamp;
    }

    public Indicator getIndicator() {
        return indicator;
    }

    public void setIndicator(Indicator indicator) {
        this.indicator = indicator;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}