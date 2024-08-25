package com.softelse.solutis.lista6.empresa;

public class FuncionarioMedio extends FuncionarioBasico{

   private String escolaMedia;

    public FuncionarioMedio(String nome, int codigoFuncional, String escola, String escolaMedia) {
        super(nome, codigoFuncional, escola);
        this.escolaMedia = escolaMedia;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario()  * 1.50;
    }


}
