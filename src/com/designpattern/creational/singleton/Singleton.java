package com.designpattern.creational.singleton;

/**
 * Singleton Pattern - Ensures only one instance of a class exists.
 * Uses double-checked locking for thread safety.
 */
public class Singleton {

    private static volatile Singleton instance;

    private Singleton() {}

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

    public void showMessage() {
        System.out.println("Hello from Singleton instance: " + this.hashCode());
    }
}
