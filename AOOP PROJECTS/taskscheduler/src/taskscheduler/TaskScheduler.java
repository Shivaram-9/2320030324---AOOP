
package taskscheduler;

//TaskScheduler.java
import java.util.PriorityQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskScheduler {
 private final PriorityQueue<Task> taskQueue;
 private final ConcurrentHashMap<String, Task> taskMap;
 private final ScheduledExecutorService executor;

 public TaskScheduler() {
     taskQueue = new PriorityQueue<>();
     taskMap = new ConcurrentHashMap<>();
     executor = Executors.newSingleThreadScheduledExecutor();
     startTaskRunner();
 }

 private void startTaskRunner() {
     executor.execute(() -> {
         while (true) {
             try {
                 Task task = taskQueue.poll();
                 if (task != null) {
                     long delay = task.getRunAt() - System.currentTimeMillis();
                     if (delay > 0) {
                         taskQueue.add(task); // Re-add if it's not time yet
                         Thread.sleep(delay);
                     }
                     System.out.println("Running task: " + task.getName());
                     getTaskMap().remove(task.getName());
                 }
             } catch (InterruptedException e) {
                 Thread.currentThread().interrupt();
                 break;
             }
         }
     });
 }

 public String scheduleTask(String name, long delay) {
     long runAt = System.currentTimeMillis() + delay;
     Task task = new Task(name, runAt);
     taskQueue.add(task);
     getTaskMap().put(name, task);
     return "Task '" + name + "' scheduled to run at " + runAt + ".";
 }

 public String cancelTask(String name) {
     Task task = getTaskMap().remove(name);
     if (task != null) {
         taskQueue.remove(task);
         return "Task '" + name + "' has been canceled.";
     }
     return "Task '" + name + "' not found.";
 }

 public String rescheduleTask(String name, long newDelay) {
     if (cancelTask(name).contains("not found")) {
         return "Task '" + name + "' not found.";
     }
     return scheduleTask(name, newDelay);
 }

 public void shutdown() {
     executor.shutdown();
     try {
         if (!executor.awaitTermination(10, TimeUnit.SECONDS)) {
             executor.shutdownNow();
         }
     } catch (InterruptedException e) {
         executor.shutdownNow();
     }
 }

 public static void main(String[] args) {
     TaskScheduler scheduler = new TaskScheduler();

     // Schedule some tasks
     System.out.println(scheduler.scheduleTask("Task1", 2000));
     System.out.println(scheduler.scheduleTask("Task2", 5000));
     System.out.println(scheduler.scheduleTask("Task3", 3000));

     // Cancel a task
     System.out.println(scheduler.cancelTask("Task2"));

     // Reschedule a task
     System.out.println(scheduler.rescheduleTask("Task3", 7000));

     // Wait for a while to see the tasks running
     try {
         Thread.sleep(10000);
     } catch (InterruptedException e) {
         e.printStackTrace();
     }

     // Shut down the executor service
     scheduler.shutdown();
 }

public ConcurrentHashMap<String, Task> getTaskMap() {
	return taskMap;
}
}