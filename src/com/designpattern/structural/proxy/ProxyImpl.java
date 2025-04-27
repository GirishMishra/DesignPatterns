package com.designpattern.structural.proxy;

public class ProxyImpl implements IProxy{

    IProxy original;
    ProxyImpl( IProxy original) {
        this.original = original;
    }
    @Override
    public String name() {
        return "Mishra," + original.name();
    }
}
