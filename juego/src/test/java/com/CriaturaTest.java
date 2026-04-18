package com;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CriaturaTest {

    @Test
    public void testEstaViva() {
        Guerrero g = new Guerrero("Test", 50, 10);
        assertTrue(g.estaViva());
    }
}