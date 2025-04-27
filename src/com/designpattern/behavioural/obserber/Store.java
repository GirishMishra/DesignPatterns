package com.designpattern.behavioural.obserber;

public class Store {

    public static void main(String[] args) {
        IphoneObservable iphoneObservable = new IphoneObservable();
        iphoneObservable.add(new NotifyOverEmail("ab@c.co", iphoneObservable));
        iphoneObservable.add(new NotifyOverEmail("abs@c.co", iphoneObservable));
        iphoneObservable.add(new NotifyOverEmail("abs1@c.co", iphoneObservable));
        iphoneObservable.setStockCount(10);
        //iphoneObservable.notifySubscriber();
    }
}
