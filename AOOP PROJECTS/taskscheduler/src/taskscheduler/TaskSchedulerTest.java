// File: src/taskscheduler/TaskSchedulerTest.java
package taskscheduler;

//TaskSchedulerTest.java
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskSchedulerTest {
 private TaskScheduler scheduler;

 @BeforeEach
 void setUp() {
     scheduler = new TaskScheduler();
 }

 @AfterEach
 void tearDown() {
     // Optionally, you can shut down the executor service here if needed
     scheduler.shutdown();
 }

 @Test
 void testScheduleTask() {
     String result = scheduler.scheduleTask("Task1", 2000);
     assertTrue(result.contains("Task 'Task1' scheduled to run at"));
     assertNotNull(scheduler.getTaskMap().get("Task1"));
 }

 @Test
 void testCancelTask() {
     scheduler.scheduleTask("Task2", 2000);
     String result = scheduler.cancelTask("Task2");
     assertEquals("Task 'Task2' has been canceled.", result);
     assertNull(scheduler.getTaskMap().get("Task2"));
 }

 @Test
 void testRescheduleTask() {
     scheduler.scheduleTask("Task3", 2000);
     String result = scheduler.rescheduleTask("Task3", 5000);
     assertTrue(result.contains("Task 'Task3' scheduled to run at"));
     assertNotNull(scheduler.getTaskMap().get("Task3"));
 }

 @Test
 void testRunTasks() throws InterruptedException {
     scheduler.scheduleTask("Task4", 1000);
     Thread.sleep(1100); // Wait a bit longer than the task's delay
     assertNull(scheduler.getTaskMap().get("Task4")); // Task should have been executed
 }
}