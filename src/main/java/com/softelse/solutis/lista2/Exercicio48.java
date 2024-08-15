package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de notas:");
        int quantidadeNotas = sc.nextInt();
        double somaNotas = 0;

        for (int i = 1; i <= quantidadeNotas; i++) {
            System.out.println("Informe a nota " + i + ":");
            somaNotas += sc.nextDouble();
        }

        double media = somaNotas / quantidadeNotas;

        System.out.println("Informe o número de faltas:");
        int faltas = sc.nextInt();

        if (faltas > 25) {
            System.out.println("Aluno reprovado por faltas.");
        } else if (media >= 7) {
            System.out.println("Aluno aprovado.");
        } else {
            System.out.println("Aluno reprovado por nota.");
        }
    }
}
