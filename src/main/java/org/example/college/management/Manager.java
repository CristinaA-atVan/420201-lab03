package org.example.college.management;

import org.example.college.hr.Employee;

public class Manager extends Employee {

    public Manager(double salary) {
        super(salary);
    }

    public void changeMySalary() {
        salary = 100000;
    }
}