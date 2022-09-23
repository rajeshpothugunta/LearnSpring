package com.learnspring.main;

import com.learnspring.example.beans.Person;
import com.learnspring.example.beans.Vehicle;
import com.learnspring.example.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ExampleDemo {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        String[] persons = context.getBeanNamesForType(Person.class);
        Person person = context.getBean(Person.class);
        String[] names = context.getBeanNamesForType(Vehicle.class);
        /*Vehicle vehicle = context.getBean(Vehicle.class);
        vehicle.getVehicleServices().playMusic();
        vehicle.getVehicleServices().moveVehicle();*/
        person.getVehicle().getVehicleServices().playMusic();
        person.getVehicle().getVehicleServices().moveVehicle();
    }
}
