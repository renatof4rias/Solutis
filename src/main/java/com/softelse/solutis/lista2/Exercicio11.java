package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Informe sua idade: ");
        int idade = sc.nextInt();

        if (idade < 16) {
            System.out.println("Você não pode votar.");
        } else if ((idade >= 16 && idade < 18) || idade >= 65) {
            System.out.println("O voto é facultativo.");
        } else {
            System.out.println("O voto é obrigatório.");
        }

        sc.close();
    }
}
