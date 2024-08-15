package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPessoas = 200;
        int homensMaiores = 0;
        int mulheresMaiores = 0;

        for (int i = 0; i < totalPessoas; i++) {
            System.out.println("Informe o sexo (M/F) e a idade da pessoa " + (i + 1) + ": ");
            String sexo = sc.next().toUpperCase();
            int idade = sc.nextInt();

            if (idade >= 18) {
                if (sexo.equals("M")) {
                    homensMaiores++;
                } else if (sexo.equals("F")) {
                    mulheresMaiores++;
                }
            }
        }

        System.out.println("Quantidade de homens maiores de idade: " + homensMaiores);
        System.out.println("Quantidade de mulheres maiores de idade: " + mulheresMaiores);
    }
}
