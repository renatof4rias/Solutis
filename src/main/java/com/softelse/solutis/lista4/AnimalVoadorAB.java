package com.softelse.solutis.lista4;

public abstract class AnimalVoadorAB extends AnimalAB{
    private short qntdAsas;
    private Long envergaduraAsas;
    private short qntdPatas;

    public AnimalVoadorAB(String nome, String tipoAnimal, int idade, String habitat, float altura, float peso) {
        super(nome, tipoAnimal, idade, habitat, altura, peso);
    }

    public short getQntdAsas() {
        return qntdAsas;
    }

    public void setQntdAsas(short qntdAsas) {
        this.qntdAsas = qntdAsas;
    }

    public Long getEnvergaduraAsas() {
        return envergaduraAsas;
    }

    public void setEnvergaduraAsas(Long envergaduraAsas) {
        this.envergaduraAsas = envergaduraAsas;
    }

    public short getQntdPatas() {
        return qntdPatas;
    }

    public void setQntdPatas(short qntdPatas) {
        this.qntdPatas = qntdPatas;
    }
}
