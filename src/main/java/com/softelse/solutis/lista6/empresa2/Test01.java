package com.softelse.solutis.lista6.empresa2;

import java.util.ArrayList;
import java.util.List;

public class Test01 {
    public static void main(String[] args) {
        List<Funcionario> funcionarios = new ArrayList<>();

        double salarioBasico = 1500.0;
        double salarioMedio = 2500.0;
        double salarioSuperior = 4500.0;

        double comissaoGerente = 1000.0;
        double comissaoSupervisor = 500.0;
        double comissaoVendedor = 200.0;

        funcionarios.add(new Funcionario("João", "Ensino Básico", "Vendedor", salarioBasico, comissaoVendedor));
        funcionarios.add(new Funcionario("Ana", "Ensino Básico", "Vendedor", salarioBasico, comissaoVendedor));
        funcionarios.add(new Funcionario("Carlos", "Ensino Básico", "Vendedor", salarioBasico, comissaoVendedor));
        funcionarios.add(new Funcionario("Mariana", "Ensino Básico", "Vendedor", salarioBasico, comissaoVendedor));

        funcionarios.add(new Funcionario("Bruno", "Ensino Médio", "Supervisor", salarioMedio, comissaoSupervisor));
        funcionarios.add(new Funcionario("Clara", "Ensino Médio", "Supervisor", salarioMedio, comissaoSupervisor));
        funcionarios.add(new Funcionario("Daniel", "Ensino Médio", "Vendedor", salarioMedio, comissaoVendedor));
        funcionarios.add(new Funcionario("Paula", "Ensino Médio", "Vendedor", salarioMedio, comissaoVendedor));

        funcionarios.add(new Funcionario("Fernanda", "Nível Superior", "Gerente", salarioSuperior, comissaoGerente));
        funcionarios.add(new Funcionario("Lucas", "Nível Superior", "Vendedor", salarioSuperior, comissaoVendedor));

        double custoTotal = 0.0;
        double custoEnsinoBasico = 0.0;
        double custoEnsinoMedio = 0.0;
        double custoEnsinoSuperior = 0.0;

        for (Funcionario f : funcionarios) {
            double salarioTotal = f.calcularSalarioTotal();
            custoTotal += salarioTotal;

            switch (f.escolaridade) {
                case "Ensino Básico":
                    custoEnsinoBasico += salarioTotal;
                    break;
                case "Ensino Médio":
                    custoEnsinoMedio += salarioTotal;
                    break;
                case "Nível Superior":
                    custoEnsinoSuperior += salarioTotal;
                    break;
            }
        }

        System.out.println("Custo total da empresa: R$ " + custoTotal);
        System.out.println("Custo com funcionários de Ensino Básico: R$ " + custoEnsinoBasico);
        System.out.println("Custo com funcionários de Ensino Médio: R$ " + custoEnsinoMedio);
        System.out.println("Custo com funcionários de Nível Superior: R$ " + custoEnsinoSuperior);

        for (Funcionario f : funcionarios) {
            System.out.println(f.toString());
        }
    }
}
