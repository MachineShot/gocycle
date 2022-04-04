package com.gocycle.entity;

import javax.persistence.*;

@Entity
@Table(name = "indicator")
public class Indicator {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "indicator_id", nullable = false)
    private Integer id;

    @Lob
    @Column(name = "name")
    private String name;

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