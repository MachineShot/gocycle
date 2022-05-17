package com.gocycle.entity;

import javax.persistence.*;

@Entity
@Table(name = "node")
public class Node {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @Column(name = "from_osm_id", nullable = false)
    private Integer fromOsmId;

    @Column(name = "to_osm_id", nullable = false)
    private Integer toOsmId;

    @Column(name = "speed", nullable = false)
    private Double speed;

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Integer getToOsmId() {
        return toOsmId;
    }

    public void setToOsmId(Integer toOsmId) {
        this.toOsmId = toOsmId;
    }

    public Integer getFromOsmId() {
        return fromOsmId;
    }

    public void setFromOsmId(Integer fromOsmId) {
        this.fromOsmId = fromOsmId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}