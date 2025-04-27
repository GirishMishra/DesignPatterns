package com.designpattern.structural.proxy;

public class Client {

    public static void main(String[] args) {
        ProxyImpl proxy = new ProxyImpl(new OriginalImpl());
        System.out.println(proxy.name());
    }
}
