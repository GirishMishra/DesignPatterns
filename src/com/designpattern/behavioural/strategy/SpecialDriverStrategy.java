package com.designpattern.behavioural.strategy;

public class SpecialDriverStrategy implements Drive {
    @Override
    public void drive() {
        System.out.println("Special");
    }
}
