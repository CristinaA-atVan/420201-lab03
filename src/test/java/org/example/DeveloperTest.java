package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {

    @Test
    void testProgrammingLanguage() {
        Developer d = new Developer("Jack", 10000, "Java");
        assertEquals("Java", d.getProgrammingLanguage());
    }

    @Test
    void testBonus() {
        Developer d = new Developer("Jack", 10000, "Java");
        assertEquals(800, d.calculateBonus());
    }
}