package com.softelse.solutis.lista4;

public abstract class AnimalMarinhoAB extends AnimalAB {
    private boolean podeNadar;

    public AnimalMarinhoAB(String nome, String tipoAnimal, int idade, String habitat, float altura, float peso, boolean podeNadar) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
        this.podeNadar = podeNadar;
    }

    public boolean isPodeNadar() {
        return podeNadar;
    }

    public void setPodeNadar(boolean podeNadar) {
        this.podeNadar = podeNadar;
    }

}
