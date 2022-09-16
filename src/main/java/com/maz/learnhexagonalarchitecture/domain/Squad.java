package com.maz.learnhexagonalarchitecture.domain;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Squad {

    private UUID id;
    private String name;
    private Set<Player> players = new HashSet<>();
    private Arena homeArena;

    public Squad() {
    }

    public Squad(UUID id, String name, Set<Player> players, Arena homeArena) {
        this.id = id;
        this.name = name;
        this.players = players;
        this.homeArena = homeArena;
    }

    public void addPlayer(Player player) {
        this.players.add(player);
    }

    public void removePlayer(Player player) {
        this.players.remove(player);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Player> getPlayers() {
        return players;
    }

    public Arena getHomeArena() {
        return homeArena;
    }
}
