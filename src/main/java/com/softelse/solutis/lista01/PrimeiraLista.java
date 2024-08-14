package com.softelse.solutis.lista01;

import java.util.Scanner;

public class PrimeiraLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

/*
7. Ler dois valores para as variáveis A e B, efetuar a troca dos valores de forma
que a variável A passe a possuir o valor da variável B e que a variável B passe a
possuir o valor da variável A. Apresentar os valores trocados.
*/
        System.out.print("Valor de A -> ");
        int A = sc.nextInt();
        System.out.print("Valor de B -> ");
        int B = sc.nextInt();
        int auxiliar = A;
        A = B;
        B = auxiliar;




    sc.close();
    }
}
