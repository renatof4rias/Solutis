package com.softelse.solutis.lista6.animais;

public class Cachorro extends Animal{

    public Cachorro(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("o Cachorro faz: Au, Au, Au, Au, Au, Au, Au, Au, Au, Au,");
    }

    public void correr(){
        System.out.println("o Cachorro está Correndo");
    }

}
