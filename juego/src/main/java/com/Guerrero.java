package com;

public class Guerrero extends Criatura {

    public Guerrero(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int dano = fuerza;

        if (arma != null) {
            arma.atacarConArma();
            dano += arma.getDanoAdicional();
        }

 JeanPier
        System.out.println(nombre + " ataca con espada!");

        System.out.println(nombre + " ataca con espada");
main
        objetivo.defender(dano);
    }

    @Override
    public void defender(int dano) {
        salud -= dano;
        System.out.println(nombre + " recibe " + dano + " de daño. Salud: " + salud);
    }
}