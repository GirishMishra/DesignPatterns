package com.designpattern.structural.decorator.home;

public class Client {

    public static void main(String[] args) {
        RawBaseFlat rawBaseFlat = new RawBaseFlat(new BaseFlat() {
            @Override
            public double cost() {
                return 3500000;
            }
        });
        SemiFurnishedFlat semiFurnishedFlat = new SemiFurnishedFlat(rawBaseFlat);
        FurnishedFlat furnishedFlat = new FurnishedFlat(semiFurnishedFlat);

        System.out.println("Raw Flat price" + rawBaseFlat.cost());
        System.out.println("Semi Flat price" + semiFurnishedFlat.cost());
        System.out.println("Fu Flat price" + furnishedFlat.cost());
    }
}
