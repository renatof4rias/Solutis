package com.softelse.solutis.lista6.empresa;

public class FuncionarioUniversitario extends FuncionarioMedio{

    private String universidade;

    public FuncionarioUniversitario(String nome, int codigoFuncional, String escola, String escolaMedia, String universidade) {
        super(nome, codigoFuncional, escola, escolaMedia);
        this.universidade = universidade;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()  * 2.00;
    }

}
