package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor inicial da dívida: ");
        double valorInicial = sc.nextDouble();

        System.out.print("Informe a quantidade de meses: ");
        int meses = sc.nextInt();

        System.out.print("Informe a taxa de juros mensal (%): ");
        double jurosMensais = sc.nextDouble();

        double valorFinal = valorInicial * (1 + (jurosMensais / 100) * meses);

        System.out.println("O valor final da dívida é: R$ " + valorFinal);

        sc.close();
    }
}
