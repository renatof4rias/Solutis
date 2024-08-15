package com.softelse.solutis.lista2;

public class Exercicio49 {
    public static void main(String[] args) {
        int n = 50;
        long[] fibonacci = new long[n];

        fibonacci[0] = 1;
        fibonacci[1] = 1;

        for (int i = 2; i < n; i++) {
            fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
        }

        System.out.println("Os 50 primeiros números da sequência de Fibonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci[i] + " ");
        }
    }
}
