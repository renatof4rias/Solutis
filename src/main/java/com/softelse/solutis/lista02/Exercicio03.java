package com.softelse.solutis.lista02;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um número");
        int numero = sc.nextInt();

        System.out.println("Números primos menores que " + numero + " - ");
        for (int i = 2; i < numero; i++) {
            if (isPrimo(i)) {
                System.out.print(i + " ");
            }
        }
        sc.close();
    }

    public static boolean isPrimo(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
