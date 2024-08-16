// src/homeAutomationSys/NotificationServiceTest.java
package homeAutomationSys;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NotificationServiceTest {
    @Test
    void testAddNotification() {
        NotificationService service = new NotificationService();
        UserNotification notification = new UserNotification("Test Notification");
        service.addNotification(notification);
        assertEquals(1, service.getNotifications().size());
        assertEquals("Test Notification", service.getNotifications().get(0).getMessage());
    }
}