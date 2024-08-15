package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o mês do nascimento (1-12): ");
        int mes = sc.nextInt();

        if (mes >= 1 && mes <= 3) {
            System.out.println("Você nasceu no 1º trimestre.");
        } else if (mes >= 4 && mes <= 6) {
            System.out.println("Você nasceu no 2º trimestre.");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("Você nasceu no 3º trimestre.");
        } else if (mes >= 10 && mes <= 12) {
            System.out.println("Você nasceu no 4º trimestre.");
        } else {
            System.out.println("Mês inválido.");
        }

        sc.close();
    }
}
