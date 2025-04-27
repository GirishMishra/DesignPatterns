package com.designpattern.structural.decorator;

public class Client {
    public static void main(String[] args) {
        PapayPanner papayPanner = new PapayPanner(new VegPizza());
        PapayCheseBustPanner papayCheseBustPanner = new PapayCheseBustPanner(papayPanner);
        System.out.println(papayPanner.cost());
        System.out.println(papayCheseBustPanner.cost());
    }
}
