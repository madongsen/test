package com.example.demo.entity;

import org.springframework.core.serializer.Serializer;

import java.io.Serializable;

public class Customer implements Serializable {
    private int id;
   private String name;
   private String home;
   private Long id1;
   private int number;

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", home='" + home + '\'' +
                ", id1=" + id1 +
                '}';
    }

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
