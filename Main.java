package EmployeeManagementSystem;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        EmployeeManager manager = new EmployeeManager();

        int choice;

        do {
            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Full Time Employee");
            System.out.println("2. Add Part Time Employee");
            System.out.println("3. Show All Employees");
            System.out.println("4. Search Employee by ID");
            System.out.println("5. Delete Employee");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    System.out.print("Enter ID: ");
                    int ftId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String ftName = sc.nextLine();

                    System.out.print("Enter Monthly Salary: ");
                    double salary = sc.nextDouble();

                    manager.addEmployee(
                            new FullTimeEmployee(ftId, ftName, salary)
                    );
                    break;

                case 2:
                    System.out.print("Enter ID: ");
                    int ptId = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Name: ");
                    String ptName = sc.nextLine();

                    System.out.print("Enter Working Hours: ");
                    int hours = sc.nextInt();

                    System.out.print("Enter Rate Per Hour: ");
                    double rate = sc.nextDouble();

                    manager.addEmployee(
                            new PartTimeEmployee(ptId, ptName, hours, rate)
                    );
                    break;

                case 3:
                    manager.showAllEmployees();
                    break;

                case 4:
                    System.out.print("Enter Employee ID: ");
                    int searchId = sc.nextInt();
                    manager.searchById(searchId);
                    break;

                case 5:
                    System.out.print("Enter Employee ID to delete: ");
                    int deleteId = sc.nextInt();
                    manager.deleteEmployee(deleteId);
                    break;

                case 6:
                    System.out.println("Good Bye.....");
                    break;

                default:
                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}
