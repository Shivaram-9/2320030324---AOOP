// src/homeAutomationSys/Device.java
package homeAutomationSys;

public abstract class Device {
    protected String name;
    protected boolean isOn;

    public Device(String name) {
        this.name = name;
        this.isOn = false;
    }

    public String getName() {
        return name;
    }

    public boolean isOn() {
        return isOn;
    }

    public abstract void turnOn();
    public abstract void turnOff();
}