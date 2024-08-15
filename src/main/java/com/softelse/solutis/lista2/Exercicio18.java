package com.softelse.solutis.lista2;

import java.time.LocalDate;
import java.util.Scanner;

public class Exercicio18 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Informe o ano de nascimento: ");
            int anoNascimento = sc.nextInt();

            System.out.print("Informe o mês de nascimento: ");
            int mesNascimento = sc.nextInt();

            System.out.print("Informe o dia de nascimento: ");
            int diaNascimento = sc.nextInt();

            LocalDate dataAtual = LocalDate.now();
            LocalDate dataNascimento = LocalDate.of(anoNascimento, mesNascimento, diaNascimento);

            int idade = dataAtual.getYear() - anoNascimento;

            if (dataAtual.getMonthValue() < mesNascimento ||
                    (dataAtual.getMonthValue() == mesNascimento && dataAtual.getDayOfMonth() < diaNascimento)) {
                idade--;
            }

            System.out.println("Sua idade atual é: " + idade + " anos");

            sc.close();
        }
    }
