package com.example.demo.entity;

import org.springframework.core.serializer.Serializer;

public class Customer {
    private int id;
   private String name;
   private String school;
   private Long id1;

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
