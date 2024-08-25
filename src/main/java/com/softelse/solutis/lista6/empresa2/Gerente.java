package com.softelse.solutis.lista6.empresa2;


import com.softelse.solutis.lista6.comissao.Funcionario;

public class Gerente extends Funcionario {
    public Gerente(double salarioBase) {
        super(salarioBase);
    }
    @Override
    public double calcularComissao() {
        return 1500.00;
    }
}
