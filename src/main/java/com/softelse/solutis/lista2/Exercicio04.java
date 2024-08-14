package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double somaNotas = 0;
        for (int i = 1; i <= 4; i++) {
            System.out.print("Informe a nota " + i + ": ");
            double nota = sc.nextDouble();
            somaNotas += nota;
        }

        double media = somaNotas / 4;

        System.out.println("A média aritmética é: " + media);

        sc.close();
    }
}
