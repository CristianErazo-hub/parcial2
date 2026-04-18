package com;

public class Batalla {

    public static void pelear(Criatura c1, Criatura c2) {

        System.out.println("=== INICIO DE BATALLA ===");

        while (c1.estaViva() && c2.estaViva()) {
            c1.atacar(c2);

            if (c2.estaViva()) {
                c2.atacar(c1);
            }
        }

        System.out.println("=== FIN DE BATALLA ===");

        if (c1.estaViva()) {
            System.out.println(c1.nombre + " gana!");
        } else {
            System.out.println(c2.nombre + " gana!");
        }
    }
}