package com.softelse.solutis.livraria.model;

public class Venda {
    private static int numVendas;
    private int numero;
    private String cliente;
    private float valor;

    public Venda(int numero, String cliente, float valor) {
        this.numero = numero;
        this.cliente = cliente;
        this.valor = valor;
    }

    public void addLivro(Livro i, int index){

    }

    public void listarLivros(){

    }


    public static int getNumVendas() {
        return numVendas;
    }

    public static void setNumVendas(int numVendas) {
        Venda.numVendas = numVendas;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
