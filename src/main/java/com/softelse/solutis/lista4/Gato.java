package com.softelse.solutis.lista4;

public class Gato extends AnimalTerrestreAB{
    private int quantidadeComida;
    private int caminhoPercorrido;
    private int horasDormidas;

    public Gato(String nome, String tipoAnimal, int idade, String habitat, float altura, float peso, int qntdPatas, int quantidadeComida, int caminhoPercorrido, int horasDormidas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, qntdPatas);
        this.quantidadeComida = quantidadeComida;
        this.caminhoPercorrido = caminhoPercorrido;
        this.horasDormidas = horasDormidas;
    }

    @Override
    public void comer() {
        quantidadeComida += 3;
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 8;
    }

    @Override
    public void dormir() {
        horasDormidas += 12;
    }
}
