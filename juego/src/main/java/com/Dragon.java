package com;

public class Dragon extends Criatura implements Volador {

    public Dragon(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int dano = fuerza * 2;

        if (arma != null) {
            arma.atacarConArma();
            dano += arma.getDanoAdicional();
        }

        System.out.println(nombre + " (Dragon) ataca con fuego!");
        objetivo.defender(dano);
    }

    @Override
    public void defender(int dano) {
        salud -= dano;
        System.out.println(nombre + " recibe " + dano + " de daño. Salud: " + salud);
    }

    @Override
    public void volar() {
        System.out.println(nombre + " está volando");
    }

    @Override
    public void aterrizar() {
        System.out.println(nombre + " ha aterrizado");
    }
}