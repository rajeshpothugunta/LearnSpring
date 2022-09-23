package com.learnspring.example.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/*
Spring @Configuration annotation is part of the spring core framework.
Spring Configuration annotation indicates that the class has @Bean definition
methods. So Spring container can process the class and generate Spring Beans
to be used in the application.
To tell Spring it needs to search for classes annotated
with stereotype annotations, we use the @ComponentScan annotation over the
configuration class.
* */
@Configuration
@ComponentScan(basePackages = {"com.learnspring.example.impl",
        "com.learnspring.example.services"})
@ComponentScan(basePackageClasses = {com.learnspring.example.beans.Vehicle.class,
        com.learnspring.example.beans.Person.class})
public class ProjectConfig {
}
