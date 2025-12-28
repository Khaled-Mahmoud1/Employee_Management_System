# === Employee_Management_System ===
---
## Project Description

This is a simple Employee Management System built using Java and Object-Oriented Programming (OOP) concepts.
The system allows managing employees through a menu-driven console application using Scanner.

### The project demonstrates proper usage of:

Classes & Objects

Encapsulation

Inheritance

Polymorphism

Abstraction (conceptually)

---

## Features

Add Full-Time Employee

Add Part-Time Employee

Display All Employees

Search Employee by ID

Delete Employee by ID

Interactive Menu using Scanner

---

## Technologies Used

Java

OOP Principles

ArrayList

Scanner (Console Input)

---

## Classes Overview
### 1- Employee (Base Class)

Attributes: id, name

Methods:

calculateSalary()

displayInfo()

getId()

### 2- FullTimeEmployee

Inherits from Employee

Attribute: monthlySalary

Overrides calculateSalary()

### 3- PartTimeEmployee

Inherits from Employee

Attributes: hours, ratePerHour

Overrides calculateSalary()

### 4- EmployeeManager

Manages all employees using ArrayList<Employee>

Methods:

addEmployee()

showAllEmployees()

searchById()

deleteEmployee()

### 5- Main

Contains the menu system

Handles user input using Scanner

Interacts with EmployeeManager

---

## OOP Concepts Applied
Concept	: Implementation

Encapsulation	: Private/Protected fields + methods

Inheritance :	FullTimeEmployee & PartTimeEmployee extend Employee

Polymorphism :	Overridden calculateSalary()

Abstraction :	Handling objects using Employee reference

---

## How to Run the Project

1- Open the project in any Java IDE (IntelliJ, Eclipse, NetBeans)
2- Compile all .java files
3- Run Main.java
4- Use the menu to interact with the system

---
## Sample Menu

===== Employee Management System =====
1. Add Full Time Employee
2. Add Part Time Employee
3. Show All Employees
4. Search Employee by ID
5. Delete Employee
6. Exit

---

## Author
### == Khaled Mahmoud ==
