package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o dia do primeiro aniversário: ");
        int dia1 = sc.nextInt();

        System.out.print("Informe o mês do primeiro aniversário: ");
        int mes1 = sc.nextInt();

        System.out.print("Informe o dia do segundo aniversário: ");
        int dia2 = sc.nextInt();

        System.out.print("Informe o mês do segundo aniversário: ");
        int mes2 = sc.nextInt();

        if (dia1 == dia2 && mes1 == mes2) {
            System.out.println("As duas datas de aniversário são iguais.");
        } else {
            System.out.println("As duas datas de aniversário são diferentes.");
        }

        sc.close();
    }
}

