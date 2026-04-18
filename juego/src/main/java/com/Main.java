package com;

public class Main {
    public static void main(String[] args) {

        Dragon dragon = new Dragon("Smaug", 100, 20);
        Mago mago = new Mago("Gandalf", 80, 15);
        Guerrero guerrero = new Guerrero("Aragorn", 90, 18);

        Arma espada = new Arma("Espada Legendaria", 10);

        guerrero.equiparArma(espada);

        Batalla.pelear(dragon, guerrero);
    }
}