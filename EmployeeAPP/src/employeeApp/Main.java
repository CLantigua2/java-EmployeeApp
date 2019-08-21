package employeeApp;

public class Main {

    public static void workWithData() {
        Healthplan h1 = new Healthplan("My Health Plan 1");
        // Healthplan h2 = new Healthplan("My Health Plan h2");
        Company c1 = new Company("SingleStone", 100);
        // Company fields are public so you have to access by c1.id
        // when using setters and getters you have to access the id by the method
        Employee emp1 = new Employee("Carlos", "Lantigua", 80000, true, c1.id, h1.getId());
        // Employee emp2 = new Employee("Jennifer", "Lantigua", 55000, true, c1.id,
        // h2.getId());

        System.out.println("*** Query Data ***");
        System.out.println(emp1.toString());
        emp1.giveRaise(3);
        System.out.println(emp1.getSalary());
        // System.out.println(emp2.toString());

    }

    public static void main(String[] args) {
        workWithData();
    }
}