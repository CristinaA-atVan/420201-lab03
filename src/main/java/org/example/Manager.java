package org.example;

public class Manager extends Employee{
    private double managementAllowance;
    public Manager(String name, double salary, double managementAllowance) {
        super(name, salary);
        System.out.println("Manager constructor");
        this.managementAllowance = managementAllowance;
    }
    public double getManagementAllowance() {
        return managementAllowance;
    }
    @Override
    public double calculateBonus() {
        return getSalary() * 0.10 + managementAllowance;
    }

    public void giveRaise() {
        increaseSalary(1000);
    }
}
