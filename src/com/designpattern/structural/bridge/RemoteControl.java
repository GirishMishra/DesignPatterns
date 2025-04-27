package com.designpattern.structural.bridge;

public class RemoteControl {
   IDevice device;
   RemoteControl(IDevice device) {
      this.device = device;
   }
   public void towggelPower() {
      if (device.isOn()) {
         device.powerOff();
      } else {
         device.powerOn();
      }
   }
}
