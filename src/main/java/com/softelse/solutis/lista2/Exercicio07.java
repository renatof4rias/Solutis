package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe o valor da despesa: ");
        double valorDespesa = sc.nextDouble();

        double comissao = valorDespesa * 0.10;

        System.out.println("A comissão do garçom é: R$ " + comissao);

        sc.close();
    }
}
