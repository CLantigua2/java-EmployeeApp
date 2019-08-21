package employeeApp;

public class Employee {
    // fields - state - information
    private int id;
    private String fname;
    private String lname;
    private double salary; // real numbers
    private boolean has401K;
    private int companyId;
    private int healthPlanId;

    // methods - behaviors

    // getters (read fields)
    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public String setFname(String fname) {
        this.fname = fname;
        return "first name set";
    }

    public String setLname(String lname) {
        this.lname = lname;
        return "last name set";
    }

    // getter doesn't need the this keyword
    public String getLname() {
        return lname;
    }
}