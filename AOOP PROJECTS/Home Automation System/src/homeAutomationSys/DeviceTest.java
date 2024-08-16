// src/homeAutomationSys/DeviceTest.java
package homeAutomationSys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeviceTest {
    @Test
    void testLightDevice() {
        Device light = DeviceFactory.createDevice("light", "Test Light");
        light.turnOn();
        assertTrue(light.isOn());
        light.turnOff();
        assertFalse(light.isOn());
    }

    @Test
    void testThermostatDevice() {
        Device thermostat = DeviceFactory.createDevice("thermostat", "Test Thermostat");
        thermostat.turnOn();
        assertTrue(thermostat.isOn());
        thermostat.turnOff();
        assertFalse(thermostat.isOn());
    }
}