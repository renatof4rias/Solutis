package com.softelse.solutis.lista6.empresa2;

import com.softelse.solutis.lista6.comissao.Funcionario;

public class Vendedor extends Funcionario {
    public Vendedor(double salarioBase) {
        super(salarioBase);
    }
    @Override
    public double calcularComissao() {
        return 250.00;
    }
}
