package com.example.demo.Model;

import java.util.UUID;

public class Person { // Our model we will be working with

    private final UUID id;
    private final String name;

    public Person(UUID id, String name) {
        this.id = id;
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
