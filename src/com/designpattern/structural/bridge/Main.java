package com.designpattern.structural.bridge;

public class Main {
    public static void main(String[] args) {
      RemoteControl tvRemoteControl = new RemoteControl(new TV());
      tvRemoteControl.towggelPower();
        tvRemoteControl.towggelPower();

        RemoteControl radioRemoteControl = new RemoteControl(new Radio());
        radioRemoteControl.towggelPower();
        radioRemoteControl.towggelPower();
    }
}
