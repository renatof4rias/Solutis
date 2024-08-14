package com.softelse.solutis.lista02;


public class Exercicio10 {
    public static void main(String[] args) {
        String texto = "Exemplo de cadeia de caracteres";
        Contagem contagem = contarCaracteres(texto);

        System.out.println("Vogais: " + contagem.getVogais());
        System.out.println("Consoantes: " + contagem.getConsoantes());
        System.out.println("Espaços em branco: " + contagem.getEspacos());
    }

    public static Contagem contarCaracteres(String texto) {
        int vogais = 0;
        int consoantes = 0;
        int espacos = 0;

        texto = texto.toLowerCase();

        for (char c : texto.toCharArray()) {
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vogais++;
            } else if (c >= 'a' && c <= 'z') {
                consoantes++;
            } else if (c == ' ') {
                espacos++;
            }
        }

        return new Contagem(vogais, consoantes, espacos);
    }
}

class Contagem {
    private final int vogais;
    private final int consoantes;
    private final int espacos;

    public Contagem(int vogais, int consoantes, int espacos) {
        this.vogais = vogais;
        this.consoantes = consoantes;
        this.espacos = espacos;
    }

    public int getVogais() {
        return vogais;
    }

    public int getConsoantes() {
        return consoantes;
    }

    public int getEspacos() {
        return espacos;
    }
}
