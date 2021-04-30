package springreact.day3.model;

public class Instructor extends User {
    private String[] branches;

    public Instructor(int id, String firstName, String lastName, String[] branches) {
        super(id, firstName, lastName);
        this.branches = branches;
    }

    public String[] getBranches() {
        return branches;
    }

    public void setBranches(String[] branches) {
        this.branches = branches;
    }

}
