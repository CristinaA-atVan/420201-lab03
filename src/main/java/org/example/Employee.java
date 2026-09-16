package org.example;

public class Employee {

    private String name;
    private double salary;

    public Employee(String name, double salary) {
        System.out.println("Employee constructor");
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public double calculateBonus() {
        return salary * 0.05;
    }

    protected void increaseSalary(double amount) {
        if (amount > 0) {
            salary += amount;
        }
    }
}