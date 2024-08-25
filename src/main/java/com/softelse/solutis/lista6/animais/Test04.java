package com.softelse.solutis.lista6.animais;

public class Test04 {
    public static void main(String[] args) {
        Zoologico zoo = new Zoologico();
        Animal cachorro = new Cachorro("Bilu", 3);
        Animal cavalo = new Cavalo("Troia", 2);
        Animal preguica = new Preguica("Preg", 1);

        zoo.setJaula(0, cachorro);
        zoo.setJaula(1, cavalo);
        zoo.setJaula(3,preguica);
        zoo.percorrerJaulas();

    }
}
