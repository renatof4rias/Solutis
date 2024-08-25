package com.softelse.solutis.lista6.empresa;

public class Funcionario {
    private String nome;
    private int codigoFuncional;
    private double salarioBase = 1000.00;

    public Funcionario(String nome, int codigoFuncional) {
        this.nome = nome;
        this.codigoFuncional = codigoFuncional;
    }

    public double calcularSalario(){
        return salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public int getCodigoFuncional() {
        return codigoFuncional;
    }

    public double getSalarioBase() {
        return salarioBase;
    }
}
