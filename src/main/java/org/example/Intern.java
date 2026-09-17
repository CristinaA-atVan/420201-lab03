package org.example;

public class Intern extends Employee{
    private String school;
    public Intern(String name, double salary, String school) {
        super(name, salary);
        this.school = school;
    }

    @Override
    public double calculateBonus() {
        return 0;
    }
}
