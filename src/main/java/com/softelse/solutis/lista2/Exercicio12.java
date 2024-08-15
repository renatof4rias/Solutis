package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Informe a segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Informe a terceira nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3) / 3;

        if (media >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (media >= 5.0 && media < 7.0) {
            System.out.println("Aluno em recuperação.");
        } else {
            System.out.println("Aluno reprovado.");
        }

        sc.close();
    }
}
