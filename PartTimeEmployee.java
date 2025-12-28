package EmployeeManagementSystem;

public class PartTimeEmployee extends Employee {
    private final int hours;
    private final double ratePerHour;

    public PartTimeEmployee(int id, String name, int hours, double ratePerHour) {
        super(id, name);
        this.hours = hours;
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculateSalary() {
        return hours * ratePerHour;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Part Time, Salary: " + calculateSalary());
    }
}

