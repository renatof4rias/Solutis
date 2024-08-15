package com.softelse.solutis.lista2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int numeroSorteado = random.nextInt(100) + 1;
        int tentativas = 0;
        int chute;

        do {
            System.out.print("Tente adivinhar o número sorteado (entre 1 e 100): ");
            chute = sc.nextInt();
            tentativas++;

            if (chute > numeroSorteado) {
                System.out.println("O número é menor.");
            } else if (chute < numeroSorteado) {
                System.out.println("O número é maior.");
            } else {
                System.out.println("Parabéns! Você acertou o número em " + tentativas + " tentativas.");
            }
        } while (chute != numeroSorteado);
    }
}
