package org.example;

public class Manager extends Employee{
    private double managementAllowance;
    public Manager(String name, double salary, double managementAllowance) {
        super(name, salary);
        this.managementAllowance = managementAllowance;
    }
    public double getManagementAllowance() {
        return managementAllowance;
    }
    @Override
    public double calculateBonus() {
        return getSalary() * 0.10 + managementAllowance;
    }

    public void giveRaise(double amount) {
        increaseSalary(amount);
    }
}
