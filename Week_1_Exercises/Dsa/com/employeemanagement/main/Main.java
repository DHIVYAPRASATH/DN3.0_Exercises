package com.employeemanagement.main;

import com.employeemanagement.model.Employee;

import java.util.Arrays;

public class Main {
    private static Employee[] employees = new Employee[10]; // Fixed size array
    private static int count = 0; // Keeps track of the number of employees added

    public static void main(String[] args) {
        // Adding employees
        addEmployee(new Employee("E001", "Alice", "Manager", 75000));
        addEmployee(new Employee("E002", "Bob", "Developer", 55000));
        addEmployee(new Employee("E003", "Charlie", "Designer", 60000));

        // Display all employees
        System.out.println("Employee List:");
        traverseEmployees();

        // Search for an employee
        Employee emp = searchEmployee("E002");
        System.out.println("Search Result: " + (emp != null ? emp : "Employee not found"));

        // Delete an employee
        deleteEmployee("E002");

        // Display all employees after deletion
        System.out.println("Employee List After Deletion:");
        traverseEmployees();
    }

    public static void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Array is full. Cannot add more employees.");
        }
    }

    public static Employee searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    public static void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    public static void deleteEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                // Shift elements to the left to fill the gap
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null;
                count--;
                System.out.println("Employee " + employeeId + " deleted.");
                return;
            }
        }
        System.out.println("Employee " + employeeId + " not found.");
    }
}
