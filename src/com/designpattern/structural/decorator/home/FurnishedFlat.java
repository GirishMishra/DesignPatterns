package com.designpattern.structural.decorator.home;

public class FurnishedFlat implements BaseFlat {
    private BaseFlat baseFlat;
    FurnishedFlat(BaseFlat baseFlat) {
        this .baseFlat = baseFlat;
    }

    @Override
    public double cost() {
        return this.baseFlat.cost()  + 20*100000;
    }
}
