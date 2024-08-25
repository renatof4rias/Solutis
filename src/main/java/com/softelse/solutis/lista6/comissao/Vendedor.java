package com.softelse.solutis.lista6.comissao;

public class Vendedor extends Funcionario {
    public Vendedor(double salarioBase) {
        super(salarioBase);
    }
    @Override
    public double calcularComissao() {
        return 250.00;
    }
}
