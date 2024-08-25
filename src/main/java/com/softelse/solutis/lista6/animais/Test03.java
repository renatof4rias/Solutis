package com.softelse.solutis.lista6.animais;

public class Test03 {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Bilú", 5);
        Cavalo cavalo = new Cavalo("Troia", 20);
        Preguica preguica = new Preguica("Procastinação", 1);

        Veterinario veterinario = new Veterinario();
        veterinario.examinar(cachorro);
        veterinario.examinar(cavalo);
        veterinario.examinar(preguica);

    }
}
