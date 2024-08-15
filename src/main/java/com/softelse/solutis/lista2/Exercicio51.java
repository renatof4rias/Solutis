package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o número de termos da sequência de Tribonacci:");
        int n = sc.nextInt();

        long[] tribonacci = new long[n];
        tribonacci[0] = 1;
        tribonacci[1] = 1;
        tribonacci[2] = 2;

        for (int i = 3; i < n; i++) {
            tribonacci[i] = tribonacci[i - 1] + tribonacci[i - 2] + tribonacci[i - 3];
        }

        System.out.println("Os " + n + " primeiros termos da sequência de Tribonacci são:");
        for (int i = 0; i < n; i++) {
            System.out.print(tribonacci[i] + " ");
        }
    }
}
