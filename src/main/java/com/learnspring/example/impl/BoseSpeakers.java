package com.learnspring.example.impl;

import com.learnspring.example.interfaces.Speakers;
import org.springframework.stereotype.Component;

@Component
public class BoseSpeakers implements Speakers {
    @Override
    public String makeSound() {
        return "Playing music with Bose speakers";
    }
}
