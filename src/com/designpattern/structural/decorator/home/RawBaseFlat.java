package com.designpattern.structural.decorator.home;

public class RawBaseFlat implements BaseFlat {
    private BaseFlat baseFlat;
    RawBaseFlat(BaseFlat baseFlat) {
        this .baseFlat = baseFlat;
    }

    @Override
    public double cost() {
        return this.baseFlat.cost() + 1000000;
    }
}
