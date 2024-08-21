package com.softelse.solutis.lista4;

public class Main {
    public static void main(String[] args) {

        Elefante elefante = new Elefante("Heli", "Elefante", 15, "Savana", 3.01F, 850.09F, 4);

        System.out.println("Antes");
        System.out.println(elefante.toString());

        elefante.comer();
        System.out.println("Depois");
        System.out.println(elefante.toString());



    }
}
