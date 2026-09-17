package org.example;

public class Developer extends Employee{
    private String programmingLanguage;
    public Developer(String name, double salary, String programmingLanguage) {
        super(name, salary);
        this.programmingLanguage = programmingLanguage;
    }

    @Override
    public double calculateBonus() {
        return getSalary() * 0.08;
    }
}
