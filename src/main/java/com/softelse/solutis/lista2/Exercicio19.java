package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o primeiro número: ");
        int numero1 = sc.nextInt();

        System.out.print("Informe o segundo número: ");
        int numero2 = sc.nextInt();

        if (numero1 < numero2) {
            System.out.println("Ordem crescente: " + numero1 + ", " + numero2);
        } else {
            System.out.println("Ordem crescente: " + numero2 + ", " + numero1);
        }

        sc.close();
    }
}
