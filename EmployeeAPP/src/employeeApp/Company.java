package employeeApp;

public class Company {
    private static int maxId = 0;

    // poor practice because then you lose control as anything can reference it from
    // outside
    public int id;
    public String name;
    public int debt;

    public Company(String name, int debt) {
        maxId++;
        this.id = maxId;
        this.name = name;
        this.debt = debt;
    }
}