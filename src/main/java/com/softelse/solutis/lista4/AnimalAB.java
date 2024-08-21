package com.softelse.solutis.lista4;

public abstract class AnimalAB implements AnimalIF{

    private String nome;
    private String tipoAnimal;
    private int idade;
    private String habitat;
    private float altura;
    private float peso;

    public AnimalAB(String nome, String tipoAnimal, int idade, String habitat, float altura, float peso) {
        this.nome = nome;
        this.tipoAnimal = tipoAnimal;
        this.idade = idade;
        this.habitat = habitat;
        this.altura = altura;
        this.peso = peso;
    }

    @Override
    public abstract void comer();

    @Override
    public abstract void moverse();

    @Override
    public abstract void dormir() ;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipoAnimal() {
        return tipoAnimal;
    }

    public void setTipoAnimal(String tipoAnimal) {
        this.tipoAnimal = tipoAnimal;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }


    @Override
    public String toString() {
        return "AnimalAB{" +
                "nome='" + nome + '\'' +
                ", tipoAnimal='" + tipoAnimal + '\'' +
                ", idade=" + idade +
                ", habitat='" + habitat + '\'' +
                ", altura=" + altura +
                ", peso=" + peso +
                '}';
    }
}
