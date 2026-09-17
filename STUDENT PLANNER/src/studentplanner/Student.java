package studentplanner;
public class Student {
    private String name;
    private String course;
    private int semester;
    public Student(String name, String course, int semester) {
        this.name = name;
        this.course = course;
        this.semester = semester;
    }
    public String getName() {
        return name;
    }
    public String getCourse() {
        return course;
    }
    public int getSemester() {
        return semester;
    }
    @Override
    public String toString() {
        return "Name: " + name +
               "\nCourse: " + course +
               "\nSemester: " + semester;
    }
}