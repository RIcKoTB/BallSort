package com.example.ballsort.da.entity;


public class User {
    public int id;
    public String name;
    public String password;

    public int getId() {
        return id;
    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public User(String name, String password) {
        this.name = name;
        this.password = password;
    }
}
