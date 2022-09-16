package com.maz.learnhexagonalarchitecture.domain;

import java.util.UUID;

public class Player {

    private UUID id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String address;

    public Player() {
    }

    public Player(UUID id, String firstName, String lastName, String phoneNumber, String address) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getAddress() {
        return address;
    }
}
