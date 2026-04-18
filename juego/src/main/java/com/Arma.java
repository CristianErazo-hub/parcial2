package com;

public class Arma {

    private String nombre;
    private int danoAdicional;

    public Arma(String nombre, int danoAdicional) {
        this.nombre = nombre;
        this.danoAdicional = danoAdicional;
    }

    public int getDanoAdicional() {
        return danoAdicional;
    }

    public void atacarConArma() {
        System.out.println("Atacando con arma: " + nombre);
    }
}