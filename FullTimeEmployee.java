package EmployeeManagementSystem;

public class FullTimeEmployee extends Employee {
    private final double monthlySalary;

    public FullTimeEmployee(int id, String name, double monthlySalary) {
        super(id, name);
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Full Time, Salary: " + calculateSalary());
    }
}