package com.softelse.solutis.lista2;

import java.util.Random;
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Digite a quantidade de números a serem sorteados: ");
        int quantidade = sc.nextInt();

        System.out.print("Digite o valor mínimo da faixa: ");
        int minimo = sc.nextInt();

        System.out.print("Digite o valor máximo da faixa: ");
        int maximo = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            int numeroSorteado = random.nextInt(maximo - minimo + 1) + minimo;
            System.out.println(numeroSorteado);
        }
    }
}
