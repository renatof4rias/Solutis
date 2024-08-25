package com.softelse.solutis.lista6.comissao;

public class Supervisor extends Funcionario {
    public Supervisor(double salarioBase) {
        super(salarioBase);
    }
    @Override
    public double calcularComissao() {
        return 600.00;
    }
}
