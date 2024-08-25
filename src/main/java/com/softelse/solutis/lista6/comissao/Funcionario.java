package com.softelse.solutis.lista6.comissao;

public abstract class Funcionario {
    private double salarioBase;

    public Funcionario(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public abstract double calcularComissao();

    public double calcularRendaTotal() {
        return salarioBase + calcularComissao();
    }
}