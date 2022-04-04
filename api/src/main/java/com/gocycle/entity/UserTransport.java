package com.gocycle.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_transport")
public class UserTransport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_transport_id", nullable = false)
    private Integer id;

    @MapsId
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_transport_id", nullable = false)
    private Transport transport;

    public Transport getTransport() {
        return transport;
    }

    public void setTransport(Transport transport) {
        this.transport = transport;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}