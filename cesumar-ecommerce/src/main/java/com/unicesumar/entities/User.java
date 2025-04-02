package com.unicesumar.entities;

import java.util.UUID;

public class User extends Entity{
    private UUID uuid;
    private String name;
    private String email;
    private String password;

    public User(UUID uuid, String name, String email, String password) {
        this.uuid = uuid;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
