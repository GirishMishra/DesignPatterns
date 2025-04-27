package com.designpattern.structural.decorator;

public class PapayPanner extends VegPizza {
    BasePiza basePiza;
    PapayPanner(BasePiza basePiza) {
        this.basePiza = basePiza;
    }
    @Override
    int cost() {
        return basePiza.cost() + 100;
    }
}
