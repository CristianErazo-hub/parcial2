package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CriaturaTest {

    // 🔹 Test 1 (lo haces tú)
    @Test
    public void testEstaViva() {
        Guerrero g = new Guerrero("Test", 50, 10);
        assertTrue(g.estaViva());
    }

    // 🔹 Test 2 (lo hace tu compañero)
    @Test
    public void testDefender() {
        Guerrero g = new Guerrero("Test", 50, 10);
        g.defender(20);
        assertEquals(30, g.salud);
    }
}