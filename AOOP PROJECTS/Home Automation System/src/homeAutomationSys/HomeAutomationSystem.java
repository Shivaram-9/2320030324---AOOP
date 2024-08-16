// src/homeAutomationSys/HomeAutomationSystem.java
package homeAutomationSys;

public class HomeAutomationSystem {
    private final Scheduler scheduler;
    private final NotificationService notificationService;

    public HomeAutomationSystem() {
        this.scheduler = new Scheduler();
        this.notificationService = new NotificationService();
    }

    public Scheduler getScheduler() {
        return scheduler;
    }

    public NotificationService getNotificationService() {
        return notificationService;
    }

    public void controlDevice(String deviceType, String deviceName, boolean turnOn) {
        Device device = DeviceFactory.createDevice(deviceType, deviceName);
        if (turnOn) {
            device.turnOn();
        } else {
            device.turnOff();
        }
    }
}