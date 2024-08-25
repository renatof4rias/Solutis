package com.softelse.solutis.lista6.comissao;

public class Test01 {
    public static void main(String[] args) {
        Funcionario gerente = new Gerente(5000.00);
        Funcionario supervisor = new Supervisor(3000.00);
        Funcionario vendedor = new Vendedor(2000.00);

        System.out.println("Renda total do Gerente: R$ " + gerente.calcularRendaTotal());
        System.out.println("Renda total do Supervisor: R$ " + supervisor.calcularRendaTotal());
        System.out.println("Renda total do Vendedor: R$ " + vendedor.calcularRendaTotal());
    }
}
