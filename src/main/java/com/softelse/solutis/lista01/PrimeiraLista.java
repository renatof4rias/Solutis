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

/*
8. Escreva uma classe que verifica se um dado número inteiro é par ou ímpar.
*/
        System.out.println("Informe um Valor Inteiro");
        int numeroInteiro = sc.nextInt();

       if ( numeroInteiro % 2 == 0){
           System.out.println("Par");
       }else {
           System.out.println("Impar");
       }

/*
9. Encontre o quadrado dos números de 0 até 10. Utilize o controle de fluxo for.
*/

        for (int i = 0; i <= 10; i++) {
            int quadrado = i * i;
            System.out.println("O quadrado de " + i + " é: " + quadrado);
        }


/*
10. Faça um programa com 3 variáveis do tipo inteiro (int) tal que a primeira tenha o valor de 6, a segunda o valor 4 e a terceira receba o valor da divisão da
primeira pela segunda. Exiba o valor da terceira variável. Faça uma análise do
resultado.
*/
        int primeiroNumero = 6;
        int segundoNumero = 4;
        int resultadoDivisao = primeiroNumero / segundoNumero;
        System.out.println("O resultado da divisão de " + primeiroNumero + " por " + segundoNumero + " é: " + resultadoDivisao);



    sc.close();
    }
}
