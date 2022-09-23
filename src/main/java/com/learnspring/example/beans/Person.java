package com.learnspring.example.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component(value="personBean")
public class Person {
    private String name="Lucy";
    private final Vehicle vehicle;

    //inject beans with constructor
    @Autowired
    public Person(Vehicle vehicle){
        this.vehicle = vehicle;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }
}
