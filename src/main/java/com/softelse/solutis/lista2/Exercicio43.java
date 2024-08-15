package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double soma = 0;
        for (int i = 0; i < 500; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            double valor = sc.nextDouble();
            soma += valor;
        }

        double media = soma / 500;
        System.out.println("A média aritmética é: " + media);
    }
}
