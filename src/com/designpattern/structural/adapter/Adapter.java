package com.designpattern.structural.adapter;

public class Adapter implements IAdapter {

    IAdaptee iAdaptee;
    Adapter(IAdaptee iAdaptee) {
        this.iAdaptee = iAdaptee;
    }

    @Override
    public double getInKillo() {
        return iAdaptee.getInPound() * .35;
    }
}
