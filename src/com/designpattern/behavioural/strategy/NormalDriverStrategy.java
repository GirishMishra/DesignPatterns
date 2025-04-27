package com.designpattern.behavioural.strategy;

public class NormalDriverStrategy implements Drive {
    @Override
    public void drive() {
        System.out.println("Normal");
    }
}
