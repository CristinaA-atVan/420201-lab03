package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EmployeeTest {
    @Test
    void testNameStorage() {
        Employee e = new Employee("John", 10000);
        assertEquals("John", e.getName());
    }

    @Test
    void testSalaryStorage() {
        Employee e = new Employee("John", 10000);
        assertEquals(10000, e.getSalary());
    }

    @Test
    void testCalculation() {
        Employee e = new Employee("John", 10000);
        assertEquals(500, e.calculateBonus());
    }
}