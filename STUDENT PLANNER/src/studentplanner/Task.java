package studentplanner;
public class Task {
    private String title;
    private String date;
    private String priority;
    private boolean completed;
    public Task(String title, String date, String priority) {
        this.title = title;
        this.date = date;
        this.priority = priority;
        this.completed = false;
    }
    public String getTitle() {
        return title;
    }
    public String getDate() {
        return date;
    }
    public String getPriority() {
        return priority;
    }
    public boolean isCompleted() {
        return completed;
    }
    public void complete() {
        completed = true;
    }
    @Override
    public String toString() {
        String status = completed ? "Completed" : "Pending";
        return title + " | " +
               date + " | Priority: " +
               priority + " | " + status;
    }
}