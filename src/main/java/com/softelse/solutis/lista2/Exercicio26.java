package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira hora (horas minutos segundos): ");
        int horas1 = sc.nextInt();
        int minutos1 = sc.nextInt();
        int segundos1 = sc.nextInt();

        System.out.print("Digite a segunda hora (horas minutos segundos): ");
        int horas2 = sc.nextInt();
        int minutos2 = sc.nextInt();
        int segundos2 = sc.nextInt();

        int totalSegundos1 = horas1 * 3600 + minutos1 * 60 + segundos1;
        int totalSegundos2 = horas2 * 3600 + minutos2 * 60 + segundos2;

        int diferencaSegundos = Math.abs(totalSegundos1 - totalSegundos2);

        System.out.println("A diferença entre os horários é de " + diferencaSegundos + " segundos.");

        sc.close();
    }
}
