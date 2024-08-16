// src/homeAutomationSys/Thermostat.java
package homeAutomationSys;

public class Thermostat extends Device {
    private int temperature;

    public Thermostat(String name) {
        super(name);
        this.temperature = 22; // Default temperature
    }

    @Override
    public void turnOn() {
        isOn = true;
        System.out.println(name + " is turned on. Temperature set to " + temperature + "°C.");
    }

    @Override
    public void turnOff() {
        isOn = false;
        System.out.println(name + " is turned off.");
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
        System.out.println(name + " temperature set to " + temperature + "°C.");
    }
}