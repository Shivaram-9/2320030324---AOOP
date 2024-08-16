// src/homeAutomationSys/NotificationService.java
package homeAutomationSys;

import java.util.ArrayList;
import java.util.List;

public class NotificationService {
    private final List<UserNotification> notifications;

    public NotificationService() {
        this.notifications = new ArrayList<>();
    }

    public void addNotification(UserNotification notification) {
        notifications.add(notification);
        System.out.println("Notification added: " + notification.getMessage());
    }

    public List<UserNotification> getNotifications() {
        return notifications;
    }
}