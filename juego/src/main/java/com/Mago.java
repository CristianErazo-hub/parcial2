package com;

public class Mago extends Criatura implements Magico {

    public Mago(String nombre, int salud, int fuerza) {
        super(nombre, salud, fuerza);
    }

    @Override
    public void atacar(Criatura objetivo) {
        int dano = fuerza;

        if (arma != null) {
            arma.atacarConArma();
            dano += arma.getDanoAdicional();
        }

        lanzarHechizo();
        objetivo.defender(dano);
    }

    @Override
    public void defender(int dano) {
        salud -= dano;
        System.out.println(nombre + " recibe " + dano + " de daño. Salud: " + salud);
    }

    @Override
    public void lanzarHechizo() {
        System.out.println(nombre + " lanza un hechizo!");
    }

    @Override
    public void aprenderHechizo(String hechizo) {
        System.out.println(nombre + " aprende el hechizo: " + hechizo);
    }
}