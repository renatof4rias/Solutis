package com.softelse.solutis.lista6.empresa2;

public class Funcionario {
    String nome;
    String escolaridade;
    String cargo;
    double salarioBase;
    double comissao;

    Funcionario(String nome, String escolaridade, String cargo, double salarioBase, double comissao) {
        this.nome = nome;
        this.escolaridade = escolaridade;
        this.cargo = cargo;
        this.salarioBase = salarioBase;
        this.comissao = comissao;
    }

    double calcularSalarioTotal() {
        return salarioBase + comissao;
    }

    @Override
    public String toString() {
        return "Nome: " + nome +
                ", Escolaridade: " + escolaridade +
                ", Cargo: " + cargo +
                ", Salário Base: R$ " + salarioBase +
                ", Comissão: R$ " + comissao +
                ", Salário Total: R$ " + calcularSalarioTotal();
    }
}