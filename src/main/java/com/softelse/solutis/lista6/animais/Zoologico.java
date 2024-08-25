package com.softelse.solutis.lista6.animais;

public class Zoologico {
    private Animal[] jaulas = new Animal[10];

    public void setJaula(int index, Animal animal) {
        if (index >= 0 && index < jaulas.length) {
            jaulas[index] = animal;
        } else {
            System.out.println("Índice fora do intervalo de jaulas.");
        }
    }
    public void percorrerJaulas() {
        for (Animal animal : jaulas) {
            if (animal != null) {
                animal.emitirSom();
                animal.correr();
            } else {
                System.out.println("Jaula vazia.");
            }
        }
    }

}
