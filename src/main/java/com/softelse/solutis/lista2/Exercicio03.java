package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe a quantidade de homens na turma: ");
        int homens = sc.nextInt();

        System.out.print("Informe a quantidade de mulheres na turma: ");
        int mulheres = sc.nextInt();

        int totalAlunos = homens + mulheres;
        double percentualHomens = (double) homens / totalAlunos * 100;
        double percentualMulheres = (double) mulheres / totalAlunos * 100;

        System.out.println("Percentual de homens: " + percentualHomens + "%");
        System.out.println("Percentual de mulheres: " + percentualMulheres + "%");

        sc.close();
    }
}
