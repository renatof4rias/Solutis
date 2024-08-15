package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite as horas: ");
        int horas = sc.nextInt();

        System.out.print("Digite os minutos: ");
        int minutos = sc.nextInt();

        System.out.print("Digite os segundos: ");
        int segundos = sc.nextInt();

        if (horas >= 0 && horas < 24 && minutos >= 0 && minutos < 60 && segundos >= 0 && segundos < 60) {
            System.out.println("Horário válido.");
        } else {
            System.out.println("Horário inválido.");
        }

        sc.close();
    }
}
