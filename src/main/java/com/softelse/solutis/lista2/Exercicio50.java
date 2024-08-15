package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o valor de n:");
        int n = sc.nextInt();

        long[] fibonacci = new long[n];
        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("O " + n + "-ésimo termo da sequência de Fibonacci é: " + fibonacci[n - 1]);
    }
}
