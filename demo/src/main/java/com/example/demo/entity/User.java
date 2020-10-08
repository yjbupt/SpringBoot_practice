package com.example.demo.entity;

public class User {
    private float id;
    private String username;
    private String password;

    public User() {
    }

    public User(float id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public float getId() {
        return id;
    }

    public void setId(float id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
