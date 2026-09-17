package studentplanner;

import java.util.ArrayList;

public class Planner {

    private ArrayList<Subject> subjects = new ArrayList<>();
    private ArrayList<Assignment> assignments = new ArrayList<>();
    private ArrayList<Task> tasks = new ArrayList<>();

    public void addSubject(Subject subject) {
        subjects.add(subject);
    }

    public void addAssignment(Assignment assignment) {
        assignments.add(assignment);
    }

    public void addTask(Task task) {
        tasks.add(task);
    }

    public void showSubjects() {
        System.out.println("\n--- SUBJECTS ---");

        if (subjects.isEmpty()) {
            System.out.println("No subjects added.");
            return;
        }

        for (Subject subject : subjects) {
            System.out.println(subject);
        }
    }

    public void showAssignments() {
        System.out.println("\n--- ASSIGNMENTS ---");

        if (assignments.isEmpty()) {
            System.out.println("No assignments added.");
            return;
        }

        for (int i = 0; i < assignments.size(); i++) {
            System.out.println((i + 1) + ". " + assignments.get(i));
        }
    }

    public void showTasks() {
        System.out.println("\n--- TASKS ---");

        if (tasks.isEmpty()) {
            System.out.println("No tasks added.");
            return;
        }

        for (int i = 0; i < tasks.size(); i++) {
            System.out.println((i + 1) + ". " + tasks.get(i));
        }
    }

    public void completeAssignment(int index) {
        if (index >= 0 && index < assignments.size()) {
            assignments.get(index).complete();
            System.out.println("Assignment completed.");
        } else {
            System.out.println("Invalid assignment number.");
        }
    }

    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).complete();
            System.out.println("Task completed.");
        } else {
            System.out.println("Invalid task number.");
        }
    }

    public void showSummary() {

        int completedTasks = 0;

        for (Task task : tasks) {
            if (task.isCompleted()) {
                completedTasks++;
            }
        }

        double productivity = 0;

        if (!tasks.isEmpty()) {
            productivity = completedTasks * 100.0 / tasks.size();
        }

        System.out.println("\n--- PRODUCTIVITY SUMMARY ---");
        System.out.println("Subjects: " + subjects.size());
        System.out.println("Assignments: " + assignments.size());
        System.out.println("Tasks: " + tasks.size());
        System.out.println("Completed Tasks: " + completedTasks);
        System.out.printf("Productivity: %.2f%%%n", productivity);
    }

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

    public ArrayList<Assignment> getAssignments() {
        return assignments;
    }

    public ArrayList<Task> getTasks() {
        return tasks;
    }

    public void clearPlanner() {
        subjects.clear();
        assignments.clear();
        tasks.clear();
    }

    public String getData() {

        StringBuilder data = new StringBuilder();

        for (Subject subject : subjects) {
            data.append("SUBJECT|")
                .append(subject.getName())
                .append("|")
                .append(subject.getCredits())
                .append("\n");
        }

        for (Assignment assignment : assignments) {
            data.append("ASSIGNMENT|")
                .append(assignment.getTitle())
                .append("|")
                .append(assignment.getSubject())
                .append("|")
                .append(assignment.getDeadline())
                .append("|")
                .append(assignment.isCompleted())
                .append("\n");
        }

        for (Task task : tasks) {
            data.append("TASK|")
                .append(task.getTitle())
                .append("|")
                .append(task.getDate())
                .append("|")
                .append(task.getPriority())
                .append("|")
                .append(task.isCompleted())
                .append("\n");
        }

        return data.toString();
    }
}