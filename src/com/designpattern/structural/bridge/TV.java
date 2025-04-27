package com.designpattern.structural.bridge;

public class TV implements IDevice{
    private boolean on;
    @Override
    public boolean powerOn() {
        on =true;
        System.out.println("Tv powerOn: "+on);
        return on;
    }

    @Override
    public boolean powerOff() {
        on=false;
        System.out.println("Tv powerOff "+on);
        return on;
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
