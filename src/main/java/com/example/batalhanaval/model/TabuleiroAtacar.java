package com.example.batalhanaval.model;

public class TabuleiroAtacar {

    private int[] atirar;
    private int[][] cruz;
    private int[][] posicaoAtaque;

    private String Tiro;
    private String Agua;
    private char[][] dimensoes;
    public TabuleiroAtacar(char[][]dimensoes){
        this.dimensoes=dimensoes;

    }

    public void atacar(){


    }

    public int[][] getPosicaoAtaque() {
        return posicaoAtaque;
    }

    public void setPosicaoAtaque(int[][] posicaoAtaque) {
        this.posicaoAtaque = posicaoAtaque;}
}
