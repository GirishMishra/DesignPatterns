package com.designpattern.structural.decorator.home;

public class SemiFurnishedFlat implements BaseFlat {
    private BaseFlat baseFlat;
    SemiFurnishedFlat(BaseFlat baseFlat) {
        this .baseFlat = baseFlat;
    }
    @Override
    public double cost() {
        return baseFlat.cost()+ 20*100000;
    }
}
