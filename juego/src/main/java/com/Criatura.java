package com;

public abstract class Criatura {

    protected String nombre;
    protected int salud;
    protected int fuerza;
    protected Arma arma; // composición

    public Criatura(String nombre, int salud, int fuerza) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
    }

    public abstract void atacar(Criatura objetivo);

    public abstract void defender(int dano);

    public boolean estaViva() {
        return salud > 0;
    }

    public void equiparArma(Arma arma) {
        this.arma = arma;
    }

    public void desequiparArma() {
        this.arma = null;
    }
}