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

    // constructor

    // getters and setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isHas401K() {
        return this.has401K;
    }

    public boolean getHas401K() {
        return this.has401K;
    }

    public void setHas401K(boolean has401K) {
        this.has401K = has401K;
    }

    public int getCompanyId() {
        return this.companyId;
    }

    public void setCompanyId(int companyId) {
        this.companyId = companyId;
    }

    public int getHealthPlanId() {
        return this.healthPlanId;
    }

    public void setHealthPlanId(int healthPlanId) {
        this.healthPlanId = healthPlanId;
    }

    // regular methods
    public String getName() {
        return fname + " " + lname;
    }

    public void giveRaise(double raise) {
        this.salary += (salary * raise);
    }
}