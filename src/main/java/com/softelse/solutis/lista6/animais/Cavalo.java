package com.softelse.solutis.lista6.animais;

public class Cavalo extends Animal{

    public Cavalo(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("o Cavalo faz: Hinn in in in");
    }

    public void correr(){
        System.out.println("o Cavalo está Correndo (Pocotó, Pocotó, Pocotó, Pocotó, Pocotó)");
    }
}
