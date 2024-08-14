package com.softelse.solutis.lista02;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int quilometragemTotal = 0;
        int litrosTotais = 0;
        char continuar;

        do {
            System.out.print("Digite a quilometragem dirigida (km): ");
            int quilometragem = sc.nextInt();

            System.out.print("Digite a quantidade de combustível consumido (litros): ");
            int litros = sc.nextInt();

            double consumo = (double) quilometragem / litros;
            System.out.printf("Consumo para este tanque: %.2f km/l%n", consumo);

            quilometragemTotal += quilometragem;
            litrosTotais += litros;

            System.out.printf("Quilometragem combinada: %d km%n", quilometragemTotal);
            System.out.printf("Total de litros consumidos: %d litros%n", litrosTotais);

            System.out.print("Deseja registrar outro tanque cheio? (s/n): ");
            continuar = sc.next().charAt(0);
        } while (continuar == 's' || continuar == 'S');

        sc.close();
    }
}
