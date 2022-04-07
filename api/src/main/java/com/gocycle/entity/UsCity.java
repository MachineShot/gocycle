package com.gocycle.entity;

import org.locationtech.jts.geom.Point;

import javax.persistence.*;

@Entity
@Table(name = "us_cities")
public class UsCity {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "geom", columnDefinition = "geography")
    private Point geom;

    @Column(name = "\"POP_2010\"")
    private Double pop2010;

    @Column(name = "\"ELEV_IN_FT\"")
    private Double elevInFt;

    @Column(name = "\"STATE\"")
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Double getElevInFt() {
        return elevInFt;
    }

    public void setElevInFt(Double elevInFt) {
        this.elevInFt = elevInFt;
    }

    public Double getPop2010() {
        return pop2010;
    }

    public void setPop2010(Double pop2010) {
        this.pop2010 = pop2010;
    }

    public Point getGeom() {
        return geom;
    }

    public void setGeom(Point geom) {
        this.geom = geom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}