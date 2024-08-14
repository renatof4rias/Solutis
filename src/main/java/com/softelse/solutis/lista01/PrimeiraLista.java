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


/*
11. Utilize a estrutura if para fazer um programa que retorne o nome de um
produto a partir do código do mesmo. Considere os seguintes códigos:
001 ? Parafuso;
002 ? Porca;
003 ? Prego;
Para qualquer outro código: XXX ? Diversos.
*/
        System.out.print("Digite o código do produto (001, 002, 003): ");
        int codigoProduto = sc.nextInt();
        if (codigoProduto == 001) {
            System.out.println("Produto: Parafuso");
        } else if (codigoProduto == 002) {
            System.out.println("Produto: Porca");
        } else if (codigoProduto == 003) {
            System.out.println("Produto: Prego");
        } else {
            System.out.println("Produto: Diversos");
        }

/*
12. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de dados int e double .
 */
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                int resultadoInt = i / 2;
                double resultadoDouble = (double) i / 2;
                System.out.println("Número: " + i + "  Divisão por 2: " + resultadoInt + "Divisão por 2: " + resultadoDouble);
            }
        }




/*
13. Escreva uma classe que imprima todas as possibilidades de que no lançamento de dois dados tenhamos o valor 7 como resultado da soma dos valores de cada dado.
 */

        for (int dado1 = 1; dado1 <= 6; dado1++) {
            for (int dado2 = 1; dado2 <= 6; dado2++) {
                if (dado1 + dado2 == 7) {
                    System.out.println("Dado 1: " + dado1 + " Dado 2: " + dado2);
                }
            }
        }
    sc.close();
    }
}
