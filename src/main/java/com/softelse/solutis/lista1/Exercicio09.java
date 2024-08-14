package com.softelse.solutis.lista1;

import java.util.Scanner;

public class Exercicio09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        double raio = sc.nextDouble();
        double area = Math.PI * Math.pow(raio, 2);
        double areaArredondada = Math.round(area);
        System.out.println("A área do círculo com raio " + raio + " é: " + areaArredondada);

        sc.close();
    }
}
