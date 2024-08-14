package com.softelse.solutis.lista1;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a distância em milhas: ");
        double milhas = sc.nextDouble();
        double quilometros = milhas * 1.609;
        System.out.println(milhas + " milhas equivalem a " + quilometros + " quilômetros.");
        sc.close();
    }
}
