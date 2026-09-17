package org.example.college.management;

import org.example.college.hr.Employee;

public class TestManager extends Employee {

    public TestManager(double salary) {
        super(salary);
    }

    public void changeMySalary() {
        salary = 100000;
    }

}
