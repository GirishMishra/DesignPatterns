package com.designpattern.creational.builder;

public class IglooHouseBuilder implements IHouseBuilder{
    House house;
    IglooHouseBuilder() {
        house = new House();
    }
    @Override
    public void buildBasement() {
     house.setBasement("A");
    }

    @Override
    public void buildRoof() {
     house.setRoof("B");
    }

    @Override
    public void buildStructure() {
     house.setStructure("C");
    }

    @Override
    public void buildInterior() {
     house.setInterior("D");
    }

    @Override
    public House getHouse() {
     return house;
    }
}
