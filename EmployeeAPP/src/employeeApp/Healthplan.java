package employeeApp;

public class Healthplan {
    private static int maxId = 0;
    private int id;
    private String name;

    public Healthplan(String name) {
        maxId++;
        id = maxId;
        this.name = name;
    }

    // get id but can't set
    public int getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}