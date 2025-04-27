package com.designpattern.structural.adapter;

public class Client {

    public static void main(String[] args) {
        IAdaptee iAdaptee = new Adaptee();
        IAdapter adapter = new Adapter(iAdaptee);
        System.out.print(adapter.getInKillo());
    }

}
