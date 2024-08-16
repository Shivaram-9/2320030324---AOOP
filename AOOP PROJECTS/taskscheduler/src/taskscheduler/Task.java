// File: src/taskscheduler/Task.java
package taskscheduler;

//Task.java
public class Task implements Comparable<Task> {
 private final String name;
 private final long runAt;

 public Task(String name, long runAt) {
     this.name = name;
     this.runAt = runAt;
 }

 public String getName() {
     return name;
 }

 public long getRunAt() {
     return runAt;
 }

 @Override
 public int compareTo(Task other) {
     return Long.compare(this.runAt, other.runAt);
 }
}