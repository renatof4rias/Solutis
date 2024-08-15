package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o primeiro número: ");
        int num1 = sc.nextInt();

        System.out.print("Digite o segundo número: ");
        int num2 = sc.nextInt();

        System.out.print("Digite o terceiro número: ");
        int num3 = sc.nextInt();

        int maior;
        if (num1 == num2 && num2 == num3) {
            System.out.println("Os três números são iguais.");
            return;
        } else if (num1 >= num2 && num1 >= num3) {
            maior = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            maior = num2;
        } else {
            maior = num3;
        }

        System.out.println("O maior número é: " + maior);

        sc.close();
    }
}
