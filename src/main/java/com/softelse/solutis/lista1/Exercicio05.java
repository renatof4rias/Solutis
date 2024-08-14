package com.softelse.solutis.lista1;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] diasDaSemana = {
                "Segunda-feira",
                "Terça-feira",
                "Quarta-feira",
                "Quinta-feira",
                "Sexta-feira",
                "Sábado",
                "Domingo"
        };

        System.out.print("Digite um número de 1 a 7: ");
        int numero = sc.nextInt();
        if (numero >= 1 && numero <= 7) {
            System.out.println("O dia correspondente é: " + diasDaSemana[numero - 1]);
        } else {
            System.out.println("Número inválido! Por favor, digite um número entre 1 e 7.");
        }
        sc.close();
    }
}
