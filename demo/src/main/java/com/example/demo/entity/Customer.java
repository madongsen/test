package com.example.demo.entity;

import org.springframework.core.serializer.Serializer;

import java.io.Serializable;

public class Customer implements Serializable {
    private int id;
   private String name;
   private String home;
   private Long id1;
   private int number;
   private String new1;

    public int getNumber() {
        return number;
    }

    public Customer(int number) {
        this.number = number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

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
