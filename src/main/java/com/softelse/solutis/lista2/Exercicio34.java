package com.softelse.solutis.lista2;

import java.util.Random;

public class Exercicio34 {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int numeroSorteado = random.nextInt(100) + 1;
            System.out.println(numeroSorteado);
        }
    }
}
