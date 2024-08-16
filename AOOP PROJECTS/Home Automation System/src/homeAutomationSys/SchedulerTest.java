// src/homeAutomationSys/SchedulerTest.java
package homeAutomationSys;

import org.junit.jupiter.api.Test;

class SchedulerTest {
    @Test
    void testScheduleTask() {
        Scheduler scheduler = new Scheduler();
        ScheduledTask task = new ScheduledTask("Test Task", 1000);
        scheduler.scheduleTask(task);
        // Verify that the task is scheduled
        // (This test would need to be more sophisticated in a real scenario)
    }
}