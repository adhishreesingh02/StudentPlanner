package studentplanner;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Planner planner = new Planner();
        System.out.println("================================");
        System.out.println("       STUDENT PLANNER");
        System.out.println("================================");
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your course: ");
        String course = sc.nextLine();
        System.out.print("Enter your semester: ");
        int semester = sc.nextInt();
        sc.nextLine();
        Student student = new Student(name, course, semester);
        int choice;

        do {
            System.out.println("\n========== MENU ==========");
            System.out.println("1. View Student Profile");
            System.out.println("2. Add Subject");
            System.out.println("3. View Subjects");
            System.out.println("4. Add Assignment");
            System.out.println("5. View Assignments");
            System.out.println("6. Complete Assignment");
            System.out.println("7. Add Task");
            System.out.println("8. View Tasks");
            System.out.println("9. Complete Task");
            System.out.println("10. Productivity Summary");
            System.out.println("11. Save Planner");
            System.out.println("12. Load Planner");
            System.out.println("13. Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\n--- STUDENT PROFILE ---");
                    System.out.println(student);
                    break;
                case 2:
                    System.out.print("Enter subject name: ");
                    String subjectName = sc.nextLine();
                    System.out.print("Enter credits: ");
                    int credits = sc.nextInt();
                    sc.nextLine();
                    planner.addSubject(
                            new Subject(subjectName, credits)
                    );
                    System.out.println("Subject added.");
                    break;
                case 3:
                    planner.showSubjects();
                    break;
                case 4:
                    System.out.print("Enter assignment title: ");
                    String assignmentTitle = sc.nextLine();
                    System.out.print("Enter subject: ");
                    String assignmentSubject = sc.nextLine();
                    System.out.print("Enter deadline: ");
                    String deadline = sc.nextLine();
                    planner.addAssignment(
                            new Assignment(
                                    assignmentTitle,
                                    assignmentSubject,
                                    deadline
                            )
                    );
                    System.out.println("Assignment added.");
                    break;
                case 5:
                    planner.showAssignments();
                    break;
                case 6:
                    planner.showAssignments();
                    System.out.print("Enter assignment number: ");
                    int assignmentNumber = sc.nextInt();
                    sc.nextLine();
                    planner.completeAssignment(
                            assignmentNumber - 1
                    );
                    break;
                case 7:
                    System.out.print("Enter task title: ");
                    String taskTitle = sc.nextLine();
                    System.out.print("Enter date: ");
                    String date = sc.nextLine();
                    System.out.print("Enter priority (High/Medium/Low): ");
                    String priority = sc.nextLine();
                    planner.addTask(
                            new Task(
                                    taskTitle,
                                    date,
                                    priority
                            )
                    );
                    System.out.println("Task added.");
                    break;
                case 8:
                    planner.showTasks();
                    break;
                case 9:
                    planner.showTasks();
                    System.out.print("Enter task number: ");
                    int taskNumber = sc.nextInt();
                    sc.nextLine();
                    planner.completeTask(
                            taskNumber - 1
                    );
                    break;
                case 10:
                    planner.showSummary();
                    break;
                case 11:
                    FileManager.save(planner.getData());
                    break;
                case 12:
                    FileManager.load(planner);
                    break;
                case 13:
                    System.out.println("Thank you for using Student Planner.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
        } while (choice != 12);
        sc.close();
    }
}