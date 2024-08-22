package com.softelse.solutis.livraria.service;

public class LivrariaVirtual {
    private static int MAX_IMPRESSOS = 10;
    private static int MAX_ELETRONICOS = 20;
    private static int MAX_VENDAS = 50;
    private int numImpressos;
    private int numEletronicos;
    private int numVendas;

    public LivrariaVirtual(int numImpressos, int numEletronicos, int numVendas) {
        this.numImpressos = numImpressos;
        this.numEletronicos = numEletronicos;
        this.numVendas = numVendas;
    }

    public void cadastrarLivro(){



    }
    public void realizarVenda(){

    }
    public void listarLivrosImpressos(){

    }
    public void listarLivrosEletronicos(){

    }

    public void listarLivros(){

    }
    public void listarVendas(){

    }

    public static int getMaxImpressos() {
        return MAX_IMPRESSOS;
    }

    public static void setMaxImpressos(int maxImpressos) {
        MAX_IMPRESSOS = maxImpressos;
    }

    public static int getMaxEletronicos() {
        return MAX_ELETRONICOS;
    }

    public static void setMaxEletronicos(int maxEletronicos) {
        MAX_ELETRONICOS = maxEletronicos;
    }

    public static int getMaxVendas() {
        return MAX_VENDAS;
    }

    public static void setMaxVendas(int maxVendas) {
        MAX_VENDAS = maxVendas;
    }

    public int getNumImpressos() {
        return numImpressos;
    }

    public void setNumImpressos(int numImpressos) {
        this.numImpressos = numImpressos;
    }

    public int getNumEletronicos() {
        return numEletronicos;
    }

    public void setNumEletronicos(int numEletronicos) {
        this.numEletronicos = numEletronicos;
    }

    public int getNumVendas() {
        return numVendas;
    }

    public void setNumVendas(int numVendas) {
        this.numVendas = numVendas;
    }


    public static void main(String[] args) {


        System.out.println("Metodo Main sem Implementação.");





    }

}
