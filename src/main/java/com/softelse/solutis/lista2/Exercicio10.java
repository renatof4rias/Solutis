package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor do salário bruto: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Informe o valor dos descontos: ");
        double descontos = sc.nextDouble();

        System.out.print("Informe o valor do possível empréstimo: ");
        double emprestimo = sc.nextDouble();

        double salarioLiquido = salarioBruto - descontos;
        double limiteEmprestimo = salarioLiquido * 0.30;

        if (emprestimo <= limiteEmprestimo) {
            System.out.println("O empréstimo pode ser concedido.");
        } else {
            System.out.println("O empréstimo não pode ser concedido.");
        }

        sc.close();
    }
}
