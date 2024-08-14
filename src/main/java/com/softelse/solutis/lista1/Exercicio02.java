package com.softelse.solutis.lista1;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = sc.nextInt();
        int maior = (valor1 > valor2) ? valor1 : valor2;

        System.out.println("O maior valor é: " + maior);

        sc.close();
    }
}
