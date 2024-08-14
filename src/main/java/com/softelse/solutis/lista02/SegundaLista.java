package com.softelse.solutis.lista02;

import java.util.Scanner;

public class SegundaLista {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*
1. Qual a saída do seguinte programa:
*/
                int i = 5;
                int j = i;
                j = 10;
                System.out.println("i + j = " + j + i);
/*
2. Faça um programa que receba 2 valores e retorne o maior entre eles.
*/
        System.out.print("Digite o primeiro valor: ");
        int valor1 = sc.nextInt();
        System.out.print("Digite o segundo valor: ");
        int valor2 = sc.nextInt();
        int maior = (valor1 > valor2) ? valor1 : valor2;

        System.out.println("O maior valor é: " + maior);



/*
3. Crie uma classe e na função main() implemente um programa que lê um
número inteiro do teclado e imprime todos os números primos menores que ele
(divisíveis por 1 ou por ele mesmo).
*/

/*
4. Pretende-se escrever um programa que leia do teclado uma distância expressa em milhas,
converte-a para quilômetros e apresenta o resultado no console. (fórmula de conversão: 1 milha = 1.609 km).
*/

/*
5. Faça um programa que solicite ao usuário um número de 1 a 7, e imprima na tela o dia da semana correspondente.
Suponha que Segunda corresponde a 1 , Terça corresponde a 2, e assim por diante. Utilizando Array.
*/

/*
6. Imprima produto dos números de ímpares de 15 a 30, usando os tipos de dados int e float.
*/

/*
7. Imprima o resultado da divisão por 2 de todos os múltiplos de 3, entre 1 e 100, usando os tipos de dados int e double .
 */
    }
}
