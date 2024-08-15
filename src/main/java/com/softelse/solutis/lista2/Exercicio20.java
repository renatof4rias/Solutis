package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o nome da primeira pessoa: ");
        String nome1 = sc.nextLine();

        System.out.print("Informe a idade da primeira pessoa: ");
        int idade1 = sc.nextInt();
        sc.nextLine();

        System.out.print("Informe o nome da segunda pessoa: ");
        String nome2 = sc.nextLine();

        System.out.print("Informe a idade da segunda pessoa: ");
        int idade2 = sc.nextInt();

        if (idade1 > idade2) {
            System.out.println(nome1 + " é mais velho(a) que " + nome2);
        } else if (idade2 > idade1) {
            System.out.println(nome2 + " é mais velho(a) que " + nome1);
        } else {
            System.out.println(nome1 + " e " + nome2 + " têm a mesma idade.");
        }

        sc.close();
    }
}
