// src/homeAutomationSys/HomeAutomationApp.java
package homeAutomationSys;

public class HomeAutomationApp {
    public static void main(String[] args) {
        HomeAutomationSystem homeAutomation = new HomeAutomationSystem();

        // Control devices
        homeAutomation.controlDevice("light", "Living Room Light", true);
        homeAutomation.controlDevice("thermostat", "Home Thermostat", true);

        // Schedule a task
        ScheduledTask scheduledTask = new ScheduledTask("Turn off Living Room Light", 5000);
        homeAutomation.getScheduler().scheduleTask(scheduledTask);

        // Add a notification
        UserNotification notification = new UserNotification("Living Room Light will be turned off in 5 seconds.");
        homeAutomation.getNotificationService().addNotification(notification);
    }
}