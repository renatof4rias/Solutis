package com.softelse.solutis.lista4;

public class Elefante extends AnimalTerrestreAB{
    private int quantidadeComida;
    private int caminhoPercorrido;
    private int horasDormidas;

    public Elefante(String nome, String tipoAnimal, int idade, String habitat, float altura, float peso, int qntdPatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso, qntdPatas);
    }

    @Override
    public void comer() {
        quantidadeComida += 50;
    }


    @Override
    public void moverse() {
        caminhoPercorrido += 5;
    }

    @Override
    public void dormir() {
        horasDormidas += 4;
    }

    @Override
    public String toString() {
        return "Elefante{" +
                "quantidadeComida=" + quantidadeComida +
                ", caminhoPercorrido=" + caminhoPercorrido +
                ", horasDormidas=" + horasDormidas +
                '}';
    }
}
