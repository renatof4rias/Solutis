package com.softelse.solutis.lista5;

public class Main {
    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("Snow", "Nova York- TimeSquare", "4002-8922", 100.0,10);
        System.out.println(fornecedor.toString());
        System.out.println("Saldo = " + fornecedor.obterSaldo());

        Empregado empregado = new Empregado("Luzinete","Londres", "3030-0303", 10, 1512.00, 5.0);
        System.out.println("salario do Empregado " + empregado.calcularSalario());

        Administrador administrador = new Administrador("Luzinete","Londres", "3030-0303", 10, 1512.00, 5.0, 200.0);
        System.out.println("salario do Administrador " + administrador.calcularSalario());

        Operario operario = new Operario("Luzinete","Londres", "3030-0303", 10, 1512.00, 5.0, 10000.00,10.0);
        System.out.println("salario do Operario " + operario.calcularSalario());

        Vendedor vendedor = new Vendedor("Luzinete","Londres", "3030-0303", 10, 1512.00, 5.0, 10000.00,50.0);
        System.out.println("salario do Vendedor " + vendedor.calcularSalario());
    }
}
