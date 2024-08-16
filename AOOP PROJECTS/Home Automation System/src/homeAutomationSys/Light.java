// src/homeAutomationSys/Light.java
package homeAutomationSys;

public class Light extends Device {
    public Light(String name) {
        super(name);
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " is turned on.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " is turned off.");
    }
}