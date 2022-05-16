package com.gocycle.entity;

import org.locationtech.jts.geom.Geometry;

import javax.persistence.*;

@Entity
@Table(name = "kaunas")
public class Kaunas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "geom")
    private Geometry geom;

    @Column(name = "osm_id")
    private Long osmId;

    @Column(name = "name", length = 48)
    private String name;

    @Column(name = "ref", length = 16)
    private String ref;

    @Column(name = "type", length = 16)
    private String type;

    @Column(name = "oneway")
    private Integer oneway;

    @Column(name = "bridge")
    private Integer bridge;

    @Column(name = "maxspeed")
    private Integer maxspeed;

    public Integer getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(Integer maxspeed) {
        this.maxspeed = maxspeed;
    }

    public Integer getBridge() {
        return bridge;
    }

    public void setBridge(Integer bridge) {
        this.bridge = bridge;
    }

    public Integer getOneway() {
        return oneway;
    }

    public void setOneway(Integer oneway) {
        this.oneway = oneway;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOsmId() {
        return osmId;
    }

    public void setOsmId(Long osmId) {
        this.osmId = osmId;
    }

    public Geometry getGeom() {
        return geom;
    }

    public void setGeom(Geometry geom) {
        this.geom = geom;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}