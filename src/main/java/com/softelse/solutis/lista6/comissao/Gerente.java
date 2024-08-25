package com.softelse.solutis.lista6.comissao;


public class Gerente extends Funcionario {
    public Gerente(double salarioBase) {
        super(salarioBase);
    }
    @Override
    public double calcularComissao() {
        return 1500.00;
    }
}
