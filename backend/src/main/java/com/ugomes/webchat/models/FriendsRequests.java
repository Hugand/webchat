package com.ugomes.webchat.models;

import javax.persistence.*;
import java.sql.Date;
import java.time.Instant;

@Entity
public class FriendsRequests {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private Instant requestDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private User requestOriginUser;

    @ManyToOne(fetch = FetchType.LAZY)
    private User requestDestinyUser;

    public FriendsRequests(User requestOriginUser, User requestDestinyUser) {
        this.requestOriginUser = requestOriginUser;
        this.requestDestinyUser = requestDestinyUser;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Instant getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Instant requestDate) {
        this.requestDate = requestDate;
    }

    public User getRequestOriginUser() {
        return requestOriginUser;
    }

    public void setRequestOriginUser(User requestOriginUser) {
        this.requestOriginUser = requestOriginUser;
    }

    public User getRequestDestinyUser() {
        return requestDestinyUser;
    }

    public void setRequestDestinyUser(User requestDestinyUser) {
        this.requestDestinyUser = requestDestinyUser;
    }
}
