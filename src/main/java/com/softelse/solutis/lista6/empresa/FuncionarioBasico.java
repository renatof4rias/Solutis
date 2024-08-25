package com.softelse.solutis.lista6.empresa;

public class FuncionarioBasico extends Funcionario{

    private String escola;

    public FuncionarioBasico(String nome, int codigoFuncional, String escola) {
        super(nome, codigoFuncional);
        this.escola = escola;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() * 1.10;
    }

}
