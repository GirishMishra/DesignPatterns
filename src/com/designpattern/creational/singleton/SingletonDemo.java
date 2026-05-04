package com.designpattern.creational.singleton;

public class SingletonDemo {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();

        s1.showMessage();
        s2.showMessage();

        // Both should print the same hash code
        System.out.println("Same instance? " + (s1 == s2));
    }
}
