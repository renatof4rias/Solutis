package com.softelse.solutis.lista6.empresa2;

import com.softelse.solutis.lista6.comissao.Funcionario;

public class Supervisor extends Funcionario {
    public Supervisor(double salarioBase) {
        super(salarioBase);
    }
    @Override
    public double calcularComissao() {
        return 600.00;
    }
}
