package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o dia do aniversário: ");
        int dia = sc.nextInt();

        System.out.print("Informe o mês do aniversário: ");
        int mes = sc.nextInt();

        boolean dataValida = false;

        if (mes >= 1 && mes <= 12) {
            switch (mes) {
                case 2: dataValida = (dia >= 1 && dia <= 28); break;
                case 4: case 6: case 9: case 11:
                    dataValida = (dia >= 1 && dia <= 30); break;
                default: dataValida = (dia >= 1 && dia <= 31);
            }
        }

        if (dataValida) {
            System.out.println("Data de aniversário válida.");
        } else {
            System.out.println("Data de aniversário inválida.");
        }

        sc.close();
    }
}
