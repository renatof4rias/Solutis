package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        System.out.print("ano atual: ");
        int anoAtual = sc.nextInt();
        int idade = anoAtual - anoNascimento;

        System.out.println("Você faz " + idade + " anos em " + anoAtual);

        sc.close();
    }
}
