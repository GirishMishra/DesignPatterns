package com.designpattern.structural.bridge;

public class Radio implements IDevice{
    private boolean on;
    @Override
    public boolean powerOn() {
        on =true;
        System.out.println("Radio poweron: "+on);
        return on;
    }

    @Override
    public boolean powerOff() {
        on=false;
        System.out.println("Radio powerOff: "+on);
        return on;
    }

    @Override
    public boolean isOn() {
        return on;
    }
}
