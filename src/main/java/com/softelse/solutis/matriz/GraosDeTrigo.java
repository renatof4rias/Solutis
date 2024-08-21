package com.softelse.solutis.matriz;


    public class GraosDeTrigo {
        public static void main(String[] args) {

            long[][] tabuleiro = new long[8][8];
            long totalGraos = 0L;
            int graosAtualInt = 1;
            long graosAtualLong = 1L;

            for (int i = 0; i < 8; i++) {
                for (int j = 0; j < 8; j++) {

                    tabuleiro[i][j] = graosAtualLong;
                    totalGraos += graosAtualLong;

                    if (i * 8 + j + 1 <= 31) {
                        System.out.println("Casa (" + i + "," + j + "): " + graosAtualInt + " grãos (int)");
                        graosAtualInt *= 2;
                    } else if (i * 8 + j + 1 == 32) {
                        System.out.println("Casa (" + i + "," + j + "): Overflow de int!");
                    }
                    System.out.println("Casa (" + i + "," + j + "): " + graosAtualLong + " grãos (long)");

                    graosAtualLong *= 2;
                }
            }
            System.out.println("Número total de grãos de trigo: " + totalGraos);
        }
    }