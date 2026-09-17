package studentplanner;
public class Subject {
    private String name;
    private int credits;
    public Subject(String name, int credits) {
        this.name = name;
        this.credits = credits;
    }
    public String getName() {
        return name;
    }
    public int getCredits() {
        return credits;
    }
    @Override
    public String toString() {
        return name + " (" + credits + " credits)";
    }
}