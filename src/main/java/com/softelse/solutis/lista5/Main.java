package com.softelse.solutis.lista5;

public class Main {
    public static void main(String[] args) {

        Fornecedor fornecedor = new Fornecedor("Thiago Lopes", "Nova York- TimeSquare", "4002-8922", 100.0,10);
        System.out.println(fornecedor.toString());
        System.out.println("Saldo = " + fornecedor.obterSaldo());



    }
}
