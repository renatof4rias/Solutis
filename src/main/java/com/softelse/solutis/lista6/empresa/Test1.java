package com.softelse.solutis.lista6.empresa;

public class Test1 {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[10];

        funcionarios[0] = new Funcionario("João", 1);
        funcionarios[1] = new FuncionarioBasico("Maria", 2, "Escola A");
        funcionarios[2] = new FuncionarioMedio("Pedro", 3, "Escola A", "Escola B");
        funcionarios[3] = new FuncionarioUniversitario("Ana", 4, "Escola A", "Escola B", "Universidade X");
        funcionarios[4] = new FuncionarioBasico("Carlos", 5, "Escola C");
        funcionarios[5] = new FuncionarioMedio("Roberta", 6, "Escola C", "Escola D");
        funcionarios[6] = new FuncionarioUniversitario("Luiz", 7, "Escola E", "Escola F", "Universidade Y");
        funcionarios[7] = new Funcionario("Paula", 8);
        funcionarios[8] = new FuncionarioBasico("Fernanda", 9, "Escola G");
        funcionarios[9] = new FuncionarioUniversitario("Ricardo", 10, "Escola H", "Escola I", "Universidade Z");

        for (Funcionario f : funcionarios) {
            System.out.println("Nome: " + f.getNome() + ", Código: " + f.getCodigoFuncional() + ", Salário: R$ " + f.calcularSalario());
        }



    }
}
