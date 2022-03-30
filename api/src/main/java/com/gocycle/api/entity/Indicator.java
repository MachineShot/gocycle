package com.gocycle.api.entity;

import javax.persistence.*;

@Entity
@Table(name = "indicator")
public class Indicator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "name", nullable = false)
    private String name;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "indicator")
    private TripIndicator tripIndicator;

    public Indicator() {

    }

    public Indicator(String name) {
        this.name = name;
    }

    public TripIndicator getTripIndicator() {
        return tripIndicator;
    }

    public void setTripIndicator(TripIndicator tripIndicator) {
        this.tripIndicator = tripIndicator;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}