package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int maiorValor = Integer.MIN_VALUE;

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            int valor = sc.nextInt();
            if (valor > maiorValor) {
                maiorValor = valor;
            }
        }

        System.out.println("O maior valor é: " + maiorValor);
    }
}
