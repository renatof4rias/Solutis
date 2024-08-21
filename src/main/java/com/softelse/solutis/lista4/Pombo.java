package com.softelse.solutis.lista4;

public class Pombo extends AnimalVoadorAB{
    private int quantidadeComida;
    private int caminhoPercorrido;
    private int horasDormidas;

    public Pombo(String nome, String tipoAnimal, int idade, String habitat, float altura, float peso, int quantidadeComida, int caminhoPercorrido, int horasDormidas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.quantidadeComida = quantidadeComida;
        this.caminhoPercorrido = caminhoPercorrido;
        this.horasDormidas = horasDormidas;
    }

    @Override
    public void comer() {
        quantidadeComida += 1;
    }

    @Override
    public void moverse() {
        caminhoPercorrido += 25;
    }

    @Override
    public void dormir() {
        horasDormidas += 8;
    }
}
