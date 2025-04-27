package com.designpattern.creational.builder;

public class Main {

    public static void main(String[] args) {

        BuilderExample builderExample = new BuilderExample.BuilderPattern().setAge(5).build();
        System.out.print(builderExample.getAge());

        IglooHouseBuilder houseBuilder = new IglooHouseBuilder();
        houseBuilder.buildBasement();
        houseBuilder.buildStructure();
        System.out.println(houseBuilder.getHouse().getStructure());
    }
}
