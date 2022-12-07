package com.example.batalhanaval;

public class Tabuleiro {
    private char[][] dimensoes = new char[10][10];

    public void teste(){
        for(int i=0;i<dimensoes.length; i++){
            for(int j=0;j<dimensoes.length;j++){
                System.out.print(dimensoes[i][j]);
            }
            System.out.println();
        }

    }
    private int[][] posicaoDefesa;

    private int[][] posicaoAtaque;

    private Navios[][] navios;


    public Tabuleiro() {
        this.dimensoes = dimensoes;
    }

    public int[][] getPosicaoDefesa() {
        return posicaoDefesa;
    }

    public void setPosicaoDefesa(int[][] posicaoDefesa) {
        this.posicaoDefesa = posicaoDefesa;
    }

    public int[][] getPosicaoAtaque() {
        return posicaoAtaque;
    }

    public void setPosicaoAtaque(int[][] posicaoAtaque) {
        this.posicaoAtaque = posicaoAtaque;}
}
