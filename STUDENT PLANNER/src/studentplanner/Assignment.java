package studentplanner;
public class Assignment {
    private String title;
    private String subject;
    private String deadline;
    private boolean completed;
    public Assignment(String title, String subject, String deadline) {
        this.title = title;
        this.subject = subject;
        this.deadline = deadline;
        this.completed = false;
    }
    public String getTitle() {
        return title;
    }
    public String getSubject() {
        return subject;
    }
    public String getDeadline() {
        return deadline;
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
               subject + " | Deadline: " +
               deadline + " | " + status;
    }
}