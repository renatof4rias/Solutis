package com.softelse.solutis.lista4;

public abstract class AnimalTerrestreAB extends AnimalAB{
    private int qntdPatas;

    public AnimalTerrestreAB(String nome, String tipoAnimal, int idade, String habitat, float altura, float peso, int qntdPatas) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.qntdPatas = qntdPatas;
    }

    public int getQntdPatas() {
        return qntdPatas;
    }

    public void setQntdPatas(int qntdPatas) {
        this.qntdPatas = qntdPatas;
    }
    @Override
    public String toString() {
        return "AnimalTerrestreAB{" +
                "qntdPatas=" + qntdPatas +
                '}';
    }
}
