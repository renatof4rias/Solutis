package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio44 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a quantidade de valores: ");
        int quantidade = sc.nextInt();

        double soma = 0;
        for (int i = 0; i < quantidade; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            double valor = sc.nextDouble();
            soma += valor;
        }

        double media = soma / quantidade;
        System.out.println("A média aritmética é: " + media);
    }
}
