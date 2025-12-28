package EmployeeManagementSystem;

import java.util.ArrayList;

public class EmployeeManager {

    private final ArrayList<Employee> employees = new ArrayList<>();

    public void addEmployee(Employee e) {
        employees.add(e);
        System.out.println("Employee added successfully.");
    }

    public void showAllEmployees() {
        if (employees.isEmpty()) {
            System.out.println("No employees found!");
            return;
        }

        for (Employee e : employees) {
            e.displayInfo();
            System.out.println("==========================");
        }
    }

    public void searchById(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                System.out.println("Employee Found.");
                e.displayInfo();
                return;
            }
        }
        System.out.println("Employee Not Found!");
    }

    public void deleteEmployee(int id) {
        for (Employee e : employees) {
            if (e.getId() == id) {
                employees.remove(e);
                System.out.println("Employee deleted successfully.");
                return;
            }
        }
        System.out.println("Employee Not Found!");
    }
}

