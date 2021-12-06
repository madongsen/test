package com.example.demo.entity;

import org.springframework.core.serializer.Serializer;

public class Customer {
    private int id;
   private String name;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
