package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o dia: ");
        int dia = sc.nextInt();

        System.out.print("Digite o mês: ");
        int mes = sc.nextInt();

        System.out.print("Digite o ano: ");
        int ano = sc.nextInt();

        boolean dataValida = false;

        if (mes >= 1 && mes <= 12) {
            int diasNoMes;
            if (mes == 2) { // Fevereiro
                if ((ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0)) {
                    diasNoMes = 29; // Ano bissexto
                } else {
                    diasNoMes = 28;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                diasNoMes = 30;
            } else {
                diasNoMes = 31;
            }

            if (dia >= 1 && dia <= diasNoMes) {
                dataValida = true;
            }
        }

        if (dataValida) {
            System.out.println("Data válida.");
        } else {
            System.out.println("Data inválida.");
        }

        sc.close();
    }
}
