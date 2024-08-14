package com.softelse.solutis.lista02;

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite a primeira palavra: ");
        String palavra1 = sc.nextLine();

        System.out.print("Digite a segunda palavra: ");
        String palavra2 = sc.nextLine();

        if (palavra1.compareTo(palavra2) < 0) {
            System.out.println("Ordem alfabética: " + palavra1 + ", " + palavra2);
        } else if (palavra1.compareTo(palavra2) > 0) {
            System.out.println("Ordem alfabética: " + palavra2 + ", " + palavra1);
        } else {
            System.out.println("As palavras são iguais: " + palavra1 + ", " + palavra2);
        }

       if (palavra1.length() > palavra2.length()) {
            System.out.println("A palavra com o maior número de caracteres é: " + palavra1);
        } else if (palavra2.length() > palavra1.length()) {
            System.out.println("A palavra com o maior número de caracteres é: " + palavra2);
        } else {
            System.out.println("As duas palavras têm o mesmo número de caracteres.");
        }

        sc.close();
    }
}
