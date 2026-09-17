package studentplanner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileManager {

    public static void save(String data) {

        try {

            File folder = new File("data");

            if (!folder.exists()) {
                folder.mkdir();
            }

            FileWriter writer = new FileWriter("data/planner.txt");

            writer.write(data);

            writer.close();

            System.out.println("Planner saved successfully.");

        } catch (IOException e) {

            System.out.println("Error saving planner.");
        }
    }

    public static void load(Planner planner) {

        File file = new File("data/planner.txt");

        if (!file.exists()) {
            System.out.println("No saved planner found.");
            return;
        }

        try {

            BufferedReader reader =
                    new BufferedReader(new FileReader(file));

            String line;

            planner.clearPlanner();

            while ((line = reader.readLine()) != null) {

                String[] parts = line.split("\\|");

                if (parts[0].equals("SUBJECT")) {

                    String name = parts[1];
                    int credits = Integer.parseInt(parts[2]);

                    planner.addSubject(
                            new Subject(name, credits)
                    );
                }

                else if (parts[0].equals("ASSIGNMENT")) {

                    String title = parts[1];
                    String subject = parts[2];
                    String deadline = parts[3];
                    boolean completed = Boolean.parseBoolean(parts[4]);

                    Assignment assignment =
                            new Assignment(title, subject, deadline);

                    if (completed) {
                        assignment.complete();
                    }

                    planner.addAssignment(assignment);
                }

                else if (parts[0].equals("TASK")) {

                    String title = parts[1];
                    String date = parts[2];
                    String priority = parts[3];
                    boolean completed = Boolean.parseBoolean(parts[4]);

                    Task task =
                            new Task(title, date, priority);

                    if (completed) {
                        task.complete();
                    }

                    planner.addTask(task);
                }
            }

            reader.close();

            System.out.println("Planner loaded successfully.");

        } catch (IOException | NumberFormatException e) {

            System.out.println("Error loading planner.");
        }
    }
}