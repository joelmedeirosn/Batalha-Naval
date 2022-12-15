package com.example.batalhanaval.model;

public class TabuleiroDefesa {
    private char[][] dimensoes = new char[10][10];
    private int[][] posicaoDefesa;


    private Navios[][] navios;

    public TabuleiroDefesa() { this.dimensoes = dimensoes; }

    public void teste(){
        for(int i=0;i<dimensoes.length; i++){
            for(int j=0;j<dimensoes.length;j++){
                System.out.print(dimensoes[i][j]);
            }
            System.out.println();
        }
    }


    public void defender(){

    }


    public int[][] getPosicaoDefesa() {
        return posicaoDefesa;
    }

    public void setPosicaoDefesa(int[][] posicaoDefesa) {
        this.posicaoDefesa = posicaoDefesa;
    }


}
