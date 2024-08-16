// src/homeAutomationSys/ScheduledTask.java
package homeAutomationSys;

public class ScheduledTask {
    private String taskName;
    private long scheduledTime; // Time in milliseconds

    public ScheduledTask(String taskName, long scheduledTime) {
        this.taskName = taskName;
        this.scheduledTime = scheduledTime;
    }

    public String getTaskName() {
        return taskName;
    }

    public long getScheduledTime() {
        return scheduledTime;
    }
}