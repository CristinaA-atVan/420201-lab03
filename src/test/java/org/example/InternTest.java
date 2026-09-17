package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InternTest {

    @Test
    void testBonus() {
        Intern i = new Intern("Jill", 10000, "Vanier");
        assertEquals(0, i.calculateBonus());
    }

}