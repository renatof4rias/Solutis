package com.softelse.solutis.livraria.model;

import java.util.List;

public class Eletronico extends Livro{
    private int tamanho;

    public Eletronico(String titulo, List<String> autores, String editora, float preco, int tamanho) {
        super(titulo, autores, editora, preco);
        this.tamanho = tamanho;
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Eletronico{" +
                "tamanho=" + tamanho +
                '}';
    }


}
