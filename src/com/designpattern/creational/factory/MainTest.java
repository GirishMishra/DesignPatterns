package com.designpattern.creational.factory;

public class MainTest {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car tataCar =  carFactory.getCar(CarEnum.TATA);
        System.out.println(tataCar.enginePower());
        Car mahindraCar = carFactory.getCar(CarEnum.MAHINDRA);
        System.out.println(mahindraCar.enginePower());

    }
}
