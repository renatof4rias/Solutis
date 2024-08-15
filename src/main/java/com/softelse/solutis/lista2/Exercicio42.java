package com.softelse.solutis.lista2;

import java.util.Random;

public class Exercicio42 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 0; i < 40; i++) {
            int num1 = random.nextInt(60);
            int num2 = random.nextInt(60);
            int num3 = random.nextInt(60);

            int[] numeros = {num1, num2, num3};
            java.util.Arrays.sort(numeros);

            System.out.println("Grupo " + (i + 1) + ": " + numeros[0] + ", " + numeros[1] + ", " + numeros[2]);
        }
    }
}
