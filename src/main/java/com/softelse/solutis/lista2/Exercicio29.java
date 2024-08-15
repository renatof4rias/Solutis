package com.softelse.solutis.lista2;

import java.util.Scanner;

public class Exercicio29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor de x1: ");
        int x1 = sc.nextInt();

        System.out.print("Digite o valor de y1: ");
        int y1 = sc.nextInt();

        System.out.print("Digite o valor de x2: ");
        int x2 = sc.nextInt();

        System.out.print("Digite o valor de y2: ");
        int y2 = sc.nextInt();

        if (x1 != x2 && y1 != y2) {
            System.out.println("Os pontos formam um retângulo.");

            int largura = Math.abs(x2 - x1);
            int altura = Math.abs(y2 - y1);
            int area = largura * altura;

            System.out.println("A área do retângulo é: " + area);
        } else if (x1 == x2 && y1 == y2) {
            System.out.println("Os pontos formam um ponto.");
        } else if (x1 == x2) {
            System.out.println("Os pontos formam uma reta vertical.");
        } else {
            System.out.println("Os pontos formam uma reta horizontal.");
        }

        sc.close();
    }
}
