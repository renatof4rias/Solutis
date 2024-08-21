package com.softelse.solutis.lista4;

public class Peixe extends AnimalMarinhoAB{
    private int quantidadeComida;
    private int caminhoPercorrido;
    private int horasDormidas;

    public Peixe(String nome, String tipoAnimal, int idade, String habitat, float altura, float peso, boolean podeNadar, int quantidadeComida, int caminhoPercorrido, int horasDormidas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, podeNadar);
        this.quantidadeComida = quantidadeComida;
        this.caminhoPercorrido = caminhoPercorrido;
        this.horasDormidas = horasDormidas;
    }

    @Override
    public void comer() {
        quantidadeComida += 2;
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 20;
    }

    @Override
    public void dormir() {
        horasDormidas += 6;
    }
}
