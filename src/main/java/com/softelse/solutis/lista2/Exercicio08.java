package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o numerador: ");
        double numerador = sc.nextDouble();

        System.out.print("Informe o denominador: ");
        double denominador = sc.nextDouble();

        if (denominador != 0) {
            double resultado = numerador / denominador;
            System.out.println("O resultado é: " + resultado);
        } else {
            System.out.println("Erro: O denominador não pode ser zero.");
        }

        sc.close();
    }
}
