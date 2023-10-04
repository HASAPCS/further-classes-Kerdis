package com.example;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String name;
    private List<Employee> employeesList;

    public Department(String name) {
        // TODO: Initialize the attributes
        this.name = name;
        this.employeesList = new ArrayList<Employee>();

    }

    // TODO: Implement methods to add an employee, remove an employee, and calculate the average salary for the department
    public void addEmployee(Employee employee) {
        employeesList.add(employee);
    }

    public void removeEmployee(Employee employee) {
        employeesList.remove(employee);
    }

    public String getName() {
        return name;
    }
    
    public List<Employee> getEmployees() {
        return employeesList; 
    }


}
    