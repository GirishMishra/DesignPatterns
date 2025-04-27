package com.designpattern.behavioural.strategy;

public class Test {
    public static void printName(String name) {
        System.out.println("Printing name (String): " + name);
    }

    public static void printName(Object obj) {
        System.out.println("Printing name (Object): " + obj);
    }

    public static void main(String[] args) {

        printName(null);    // Calls printName(String)
        printName((Object) null);  // Calls printName(Object)
    }
}

