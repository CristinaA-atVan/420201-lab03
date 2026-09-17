package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ManagerTest {

    @Test
    void testInheritance() {
        Manager m = new Manager("Jane", 10000.0, 1000);
        assertEquals("Jane", m.getName());
    }

    @Test
    void testManagementAllowance() {
        Manager m = new Manager("Jane", 10000.0, 1000);
        assertEquals(1000, m.getManagementAllowance());
    }

    @Test
    void testBonus() {
        Manager m = new Manager("Jane", 10000.0, 1000);
        assertEquals(2000, m.calculateBonus());
    }

    @Test
    void testIncrease() {
        Manager m = new Manager("Jane", 10000.0, 1000);
        assertEquals(10000, m.getSalary());
        m.giveRaise(1000);
        assertEquals(11000, m.getSalary());
    }

    @Test
    void testDecrease() {
        Manager m = new Manager("Jane", 10000.0, 1000);
        assertEquals(10000, m.getSalary());
        m.giveRaise(-1000);
        assertNotEquals(9000, m.getSalary());
    }
}