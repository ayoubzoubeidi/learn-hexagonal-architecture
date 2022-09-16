package com.maz.learnhexagonalarchitecture.domain;

import java.time.Instant;
import java.util.UUID;

public class Match {

    private UUID id;
    private Instant startTIme;
    private Squad homeSquad;
    private Squad awaySquad;
    private Integer homeGoals;
    private Integer awayGoals;
    private Arena venue;

    public Match() {
    }

    public Match(UUID id, Instant startTIme, Squad homeSquad, Squad awaySquad, Integer homeGoals, Integer awayGoals, Arena venue) {
        this.id = id;
        this.startTIme = startTIme;
        this.homeSquad = homeSquad;
        this.awaySquad = awaySquad;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.venue = venue;
    }

    public Match(UUID id, Instant startTIme, Squad homeSquad, Squad awaySquad, Integer homeGoals, Integer awayGoals) {
        this.id = id;
        this.startTIme = startTIme;
        this.homeSquad = homeSquad;
        this.awaySquad = awaySquad;
        this.homeGoals = homeGoals;
        this.awayGoals = awayGoals;
        this.venue = homeSquad.getHomeArena();
    }

    public UUID getId() {
        return id;
    }

    public Instant getStartTIme() {
        return startTIme;
    }

    public Squad getHomeSquad() {
        return homeSquad;
    }

    public Squad getAwaySquad() {
        return awaySquad;
    }

    public Arena getVenue() {
        return venue;
    }
}
