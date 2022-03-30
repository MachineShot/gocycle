package com.gocycle.api.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "user_transport")
public class UserTransport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Integer id;

    @OneToMany(mappedBy = "userTransport")
    private List<Transport> transport;

    @OneToOne(fetch = FetchType.LAZY, mappedBy = "userTransport")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Transport> getTransport() {
        return transport;
    }

    public void setTransport(List<Transport> transport) {
        this.transport = transport;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}