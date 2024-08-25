package com.softelse.solutis.lista6.animais;

public class Preguica extends Animal{
    public Preguica(String nome, int idade) {
        super(nome, idade);
    }

    @Override
    public void emitirSom() {
        System.out.println("A Preguiça Faz: zZzZzZzZZZZ");
    }

    public void escalarArvore(){
        System.out.println("Subindo beeeeeeeeeeeeeeeeeeeeeeeeeem devagar");
    }

}
