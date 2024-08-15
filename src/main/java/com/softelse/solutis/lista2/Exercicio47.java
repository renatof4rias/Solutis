package com.softelse.solutis.lista2;

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio47 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> sexos = new ArrayList<>();
        ArrayList<Double> pesos = new ArrayList<>();
        ArrayList<Integer> idades = new ArrayList<>();
        ArrayList<Double> alturas = new ArrayList<>();

        while (true) {
            System.out.println("Informe o nome (ou 'fim' para terminar):");
            String nome = sc.next();
            if (nome.equalsIgnoreCase("fim")) break;
            System.out.println("Sexo (M/F):");
            String sexo = sc.next();
            System.out.println("Peso:");
            double peso = sc.nextDouble();
            System.out.println("Idade:");
            int idade = sc.nextInt();
            System.out.println("Altura:");
            double altura = sc.nextDouble();

            nomes.add(nome);
            sexos.add(sexo);
            pesos.add(peso);
            idades.add(idade);
            alturas.add(altura);
        }

        int countHomens = 0, countMulheresAlturaPeso = 0, countIdade18_25 = 0;
        double somaIdadeHomens = 0;
        String pacienteMaisVelho = "", mulherMaisBaixa = "";
        int idadeMax = Integer.MIN_VALUE;
        double alturaMin = Double.MAX_VALUE;

        for (int i = 0; i < nomes.size(); i++) {
            if (sexos.get(i).equalsIgnoreCase("M")) {
                somaIdadeHomens += idades.get(i);
                countHomens++;
            }
            if (sexos.get(i).equalsIgnoreCase("F") && alturas.get(i) >= 1.60 && alturas.get(i) <= 1.70 && pesos.get(i) > 70) {
                countMulheresAlturaPeso++;
            }
            if (idades.get(i) >= 18 && idades.get(i) <= 25) {
                countIdade18_25++;
            }
            if (idades.get(i) > idadeMax) {
                idadeMax = idades.get(i);
                pacienteMaisVelho = nomes.get(i);
            }
            if (sexos.get(i).equalsIgnoreCase("F") && alturas.get(i) < alturaMin) {
                alturaMin = alturas.get(i);
                mulherMaisBaixa = nomes.get(i);
            }
        }

        System.out.println("Quantidade de pacientes: " + nomes.size());
        System.out.println("Média de idade dos homens: " + (countHomens > 0 ? (somaIdadeHomens / countHomens) : "Sem dados"));
        System.out.println("Mulheres com altura 1.60-1.70 e peso > 70kg: " + countMulheresAlturaPeso);
        System.out.println("Pessoas com idade entre 18 e 25: " + countIdade18_25);
        System.out.println("Paciente mais velho: " + pacienteMaisVelho);
        System.out.println("Mulher mais baixa: " + mulherMaisBaixa);
    }
}
