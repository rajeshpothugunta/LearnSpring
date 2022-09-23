package com.learnspring.example.impl;

import com.learnspring.example.interfaces.Tyres;
import org.springframework.stereotype.Component;

@Component
public class BridgeStoneTyres implements Tyres {
    @Override
    public String rotate(){
        return "Vehicle moving with BridgeStone tyres";
    }
}
