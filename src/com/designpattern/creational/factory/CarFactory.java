package com.designpattern.creational.factory;

public class CarFactory implements ICarFactory {
    @Override
    public Car getCar(CarEnum carEnum) {
        switch (carEnum) {
            case FORD -> {
                return new FordCar();
            }
            case TATA -> {
                return new TataCar();
            }
            case MAHINDRA ->{
                return new MahindraCar();
            }
            case MARUTI -> {
                return new MarutiCar();
            }
            default -> {
                return null;
            }
        }
    }
}
