package com.maz.learnhexagonalarchitecture.domain;

import java.util.UUID;

public class Arena {

    private UUID id;
    private String name;
    private String address;
    private Integer capacity;

    public Arena() {
    }

    public Arena(UUID id, String name, String address, Integer capacity) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.capacity = capacity;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public Integer getCapacity() {
        return capacity;
    }
}
