package springreact.day3.model;

public class Student extends User {
    private String[] registeredCourses;

    public Student(int id, String firstName, String lastName, String[] registeredCourses) {
        super(id, firstName, lastName);
        this.registeredCourses = registeredCourses;
    }

    public String[] getRegisteredCourses() {
        return registeredCourses;
    }

    public void setRegisteredCourses(String[] registeredCourses) {
        this.registeredCourses = registeredCourses;
    }
}
