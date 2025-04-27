package com.designpattern.behavioural.strategy;

public class Main {

    public static void main(String[] args) {
        NormalDriverStrategy normalDriverStrategy = new NormalDriverStrategy();
        SportVehicle sportVehicle = new SportVehicle(normalDriverStrategy);
        sportVehicle.drive();
    }
}
