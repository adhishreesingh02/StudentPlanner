# Student Planner

## Overview

Student Planner is a Java-based command-line application designed to help students organize and manage their academic activities and daily tasks in one place.

The application allows students to manage their profile, subjects, assignments, and daily tasks. Users can set task priorities, mark assignments and tasks as completed, and view a basic productivity summary.

The application also provides file-based storage, allowing planner data to be saved and loaded for future use.

## Features

* Student profile management
* Add and view subjects
* Add and view assignments
* Mark assignments as completed
* Add and view daily tasks
* Set task priority as High, Medium, or Low
* Mark tasks as completed
* View productivity summary
* Save planner data to a text file
* Load previously saved planner data
* Input validation and error handling

## Technologies and Tools

* Java
* Java Collections Framework
* Java File I/O
* Command Line Interface
* Exception Handling
* Visual Studio Code
* GitHub

## Project Structure

The project is divided into separate Java files so that each part of the Student Planner can be managed easily.

* **Main.java** – Starts the application and handles the main menu and user input.
* **Student.java** – Stores the student's name, course, and semester.
* **Subject.java** – Stores subject names and credit information.
* **Assignment.java** – Stores assignment details such as title, subject, deadline, and completion status.
* **Task.java** – Stores daily task details such as title, date, priority, and completion status.
* **Planner.java** – Manages subjects, assignments, and tasks and provides the main planner operations.
* **FileManager.java** – Handles saving and loading planner data using a text file.
* **planner.txt** – Stores the planner data when the user saves the planner.
* **README.md** – Contains information about the project and instructions for running it.
* **statement.md** – Contains the problem statement, scope, target users, and main features of the project.

## Description of Classes

### Main.java

The entry point of the application. It displays the menu, accepts user input, and connects the different features of the Student Planner.

### Student.java

Stores student profile information such as name, course, and semester.

### Subject.java

Represents a subject and stores its name and credit information.

### Assignment.java

Stores assignment information including title, subject, deadline, and completion status.

### Task.java

Stores daily task information including title, date, priority, and completion status.

### Planner.java

Manages the subjects, assignments, and daily tasks. It provides operations for adding, viewing, completing, and summarizing planner information.

### FileManager.java

Handles saving and loading planner data using Java File I/O operations.

## How to Run

### Prerequisites

* Java JDK installed
* Visual Studio Code or any Java-supported IDE
* Command Prompt or Terminal

### Step 1: Clone the Repository

git clone https://github.com/adhishreesingh02/StudentPlanner.git


### Step 2: Open the Project

Open the `StudentPlanner` folder in Visual Studio Code.

### Step 3: Compile the Program

Open the terminal in the project folder and run:

javac -d out src\studentplanner\*.java


### Step 4: Run the Program

java -cp out studentplanner.Main


## How to Use

When the application starts, the user enters:

* Name
* Course
* Semester

The main menu then provides the following options:

1. View Student Profile
2. Add Subject
3. View Subjects
4. Add Assignment
5. View Assignments
6. Complete Assignment
7. Add Task
8. View Tasks
9. Complete Task
10. Productivity Summary
11. Save Planner
12. Load Planner
13. Exit

The user can select an option by entering its corresponding number.

## Data Storage

The application uses a simple text file for storing planner information.

The saved data is stored in:

data/planner.txt

The `FileManager.java` class is responsible for saving and loading the planner data.

The application uses a simple structured text format to store subjects, assignments, and tasks.

## Input Validation and Error Handling

The application includes basic input validation and error handling to improve reliability.

It handles:

* Invalid menu choices
* Invalid numeric input
* Invalid assignment numbers
* Invalid task numbers
* Invalid task priorities
* Missing saved planner files
* File input/output errors

## Testing

The application was tested for the following major functionalities:

* Student profile creation
* Adding and viewing subjects
* Adding and viewing assignments
* Completing assignments
* Adding and viewing tasks
* Completing tasks
* Productivity summary calculation
* Saving planner data
* Loading planner data
* Invalid input handling
* File error handling

## Functional Modules

The major functional modules of the project are:

### 1. Student Profile Module

Manages basic student information such as name, course, and semester.

### 2. Subject Management Module

Allows users to add and view subjects and their credit information.

### 3. Assignment Management Module

Allows users to add assignments, view assignment details, and mark assignments as completed.

### 4. Task Management Module

Allows users to create daily tasks, set priorities, view tasks, and mark tasks as completed.

### 5. Productivity Module

Provides a basic summary of the student's subjects, assignments, tasks, completed tasks, and productivity percentage.

### 6. File Storage Module

Allows planner information to be saved to and loaded from a text file.

## Non-Functional Requirements

### Usability

The application provides a simple menu-driven command-line interface that is easy to understand and operate.

### Reliability

Input validation and error handling are used to prevent common runtime errors and handle invalid inputs.

### Performance

The application performs operations using in-memory collections and is suitable for managing a normal student's planner data efficiently.

### Maintainability

The project is divided into separate Java classes, with each class responsible for a specific part of the application.

### Resource Efficiency

The application uses lightweight Java collections and text-file storage without requiring a database or external server.

## Project Objective

The main objective of Student Planner is to provide students with a simple and lightweight system for organizing academic activities and daily tasks while demonstrating Java programming concepts such as:

* Classes and objects
* Encapsulation
* Constructors
* Methods
* ArrayList collections
* File handling
* Exception handling
* Input validation
* Modular programming

## Future Enhancements

Possible future improvements include:

* Graphical user interface
* Calendar integration
* Reminder notifications
* Search and filtering
* Detailed productivity analytics
* Database-based storage
* Web or mobile version

## Conclusion

Student Planner provides a simple command-line solution for managing student academic activities and daily tasks. The project demonstrates practical implementation of Java programming concepts while providing useful functionality such as task management, assignment tracking, productivity calculation, and file-based data storage.
