package com.designpattern.creational.builder;

public interface IHouseBuilder {
    void buildBasement();
    void buildRoof();
    void buildStructure();
    void buildInterior();
    House getHouse();
}
