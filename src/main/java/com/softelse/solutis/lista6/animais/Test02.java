package com.softelse.solutis.lista6.animais;

public class Test02 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bilú", 5);
        cachorro.emitirSom();
        cachorro.correr();
        System.out.println();
        Cavalo cavalo = new Cavalo("Troia", 20);
        cavalo.emitirSom();
        cavalo.correr();
        System.out.println();
        Preguica preguica = new Preguica("Procastinação", 1);
        preguica.emitirSom();
        preguica.escalarArvore();
    }
}
