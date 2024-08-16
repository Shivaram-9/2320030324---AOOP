// src/homeAutomationSys/Scheduler.java
package homeAutomationSys;

import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

public class Scheduler {
    private final List<ScheduledTask> tasks;

    public Scheduler() {
        this.tasks = new ArrayList<>();
    }

    public void scheduleTask(ScheduledTask task) {
        tasks.add(task);
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                System.out.println("Executing task: " + task.getTaskName());
                tasks.remove(task);
            }
        }, task.getScheduledTime());
    }
}