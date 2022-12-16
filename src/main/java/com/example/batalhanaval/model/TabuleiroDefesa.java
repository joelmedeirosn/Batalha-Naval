package com.example.batalhanaval.model;

import java.util.Scanner;

public class TabuleiroDefesa {
    private char[][] dimensoes = new char[10][10];
    private int[][] posicaoDefesa;
    private int quantAvioes;
    private int quant4Canos;
    private int quant3Canos;
    private int quant2Canos;
    private int quant1Cano;

    //private Navios[][] navios;

    public TabuleiroDefesa(int quant1Cano, int quant2Canos, int quant3Canos, int quant4Canos, int quantAvioes) {
        this.quant1Cano=quant1Cano;
        this.quant2Canos=quant2Canos;
        this.quant3Canos=quant3Canos;
        this.quant4Canos=quant4Canos;
        this.quantAvioes=quantAvioes;
    }


    public void teste(){
        for(int i=0;i<dimensoes.length; i++){
            for(int j=0;j<dimensoes.length;j++){
                System.out.print(dimensoes[i][j]);
            }
            System.out.println();
        }
    }



    public void defender(){
        Scanner scanner = new Scanner(System.in);
        Navios navios = new Navios(); // chama a classe navios

    }


    public int[][] getPosicaoDefesa() {
        return posicaoDefesa;
    }

    public void setPosicaoDefesa(int[][] posicaoDefesa) {
        this.posicaoDefesa = posicaoDefesa;
    }


}
