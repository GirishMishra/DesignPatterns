package com.designpattern.behavioural.strategy;

public class Vehicle {

    Drive drive;
    Vehicle(Drive drive) {
        this.drive = drive;
    }
    void drive() {
        drive.drive();
    }
}
