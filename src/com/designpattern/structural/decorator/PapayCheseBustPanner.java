package com.designpattern.structural.decorator;

public class PapayCheseBustPanner extends BasePiza {
    BasePiza basePiza;
    PapayCheseBustPanner(BasePiza basePiza) {
        this.basePiza = basePiza;
    }
    @Override
    int cost() {
        return basePiza.cost() + 50;
    }
}
