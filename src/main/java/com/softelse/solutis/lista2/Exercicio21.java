package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o cargo (Diretoria, Gerência, Operacional): ");
        String cargo = sc.nextLine().toLowerCase();

        System.out.print("Informe o salário do funcionário: ");
        double salario = sc.nextDouble();

        double percentualEmprestimo = 0;

        switch (cargo) {
            case "diretoria":
                percentualEmprestimo = 0.30;
                break;
            case "gerência":
                percentualEmprestimo = 0.25;
                break;
            case "operacional":
                percentualEmprestimo = 0.20;
                break;
            default:
                System.out.println("Cargo inválido.");
                return;
        }

        double valorEmprestimo = salario * percentualEmprestimo;
        System.out.println("O valor máximo do empréstimo é: " + valorEmprestimo);

        sc.close();
    }

}
