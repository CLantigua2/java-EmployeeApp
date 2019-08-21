package employeeApp;

public class Employee {
    // fields - state - information
    private static int maxId = 0; // static shared across all objects, private limits it to just Employee classes
    private int id;
    private String fname;
    private String lname;
    private double salary; // real numbers
    private boolean has401K;
    private int companyId;
    private int healthPlanId;

    // constructor
    public Employee(String fname, String lname, double salary, boolean has401K, int companyId, int healthPlanId) {
        maxId++;
        this.id = maxId;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401K = has401K;
        this.companyId = companyId;
        this.healthPlanId = healthPlanId;
    }

    // getters and setters
    public int getId() {
        return this.id;
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

    // lets me override built in methods
    // in this case, I'm overriding the toString() method with my own
    @Override
    public String toString() {
        String rtnStr = "id: " + this.id + "\n" + "fname: " + this.fname + "\n" + "lname: " + this.lname + "\n"
                + "salary: " + this.salary + "\n" + "has401K: " + this.has401K + "\n" + "companyId: " + this.companyId
                + "\n" + "healthPlanId: " + this.healthPlanId + "\n";
        return rtnStr;
    }
}