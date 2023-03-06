package com.example.batalhanaval.model;

import java.util.Scanner;
import java.lang.*;

public class Tabuleiro extends Navios{
    Player player;
    private char[][] dimensoes = new char[10][10];
    private int[] linhaA = new int[10];
    private int[] linhaD = new int[10];
    private int[] colunaA = new int [10];
    private int[] colunaD = new int [10];

    public Tabuleiro(Player player, int quant1Cano, int quant2Canos, int quant3Canos, int quant4Canos, int quantAvioes) {
        super(quant1Cano,quant2Canos,quant3Canos,quant4Canos,quantAvioes);
        this.player = player;
        for(int i=0;i<dimensoes.length; i++) {
            for (int j = 0; j < dimensoes.length; j++) {
                dimensoes[i][j] = '□';
            }
        }
    }

    public void defender(Tabuleiro x){ //falta implementar cada tipo de navio no tabuleiro
        linhaD[0] = 0;
        colunaD[0] = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < (getQuant1Cano() + getQuant2Canos() + getQuant3Canos() + getQuant4Canos() + getQuantAvioes());i++){

            System.out.println("Selecione a Linha");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            linhaD[i] = (scanner.nextInt() - 1);
            while(linhaD[i] > 9 || linhaD[i] < 0){
            System.out.println("Selecione uma Linha válida");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            linhaD[i] = (scanner.nextInt() - 1);
            }
            System.out.println("Selecione a Coluna");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            colunaD[i] = (scanner.nextInt() - 1);
            while(colunaD[i] > 9 || colunaD[i] < 0){
            System.out.println("Selecione uma Coluna válida");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            colunaD[i] = (scanner.nextInt() - 1);
            }
        }
        for(int i = 0; i< x.dimensoes.length; i++){
            x.dimensoes[linhaD[i]][colunaD[i]] = 'N';
        }
        for(int i = 0; i< x.dimensoes.length; i++){
            for(int j = 0; j< x.dimensoes.length; j++){
                System.out.print(x.dimensoes[i][j]);
            }
            System.out.println();
        }
    }

    public void atacarNavio(Tabuleiro x){

        linhaA[0] = 0;
        colunaA[0] = 0;
        Scanner scanner = new Scanner(System.in);
        while(getQuant1Cano()!=0 || getQuant2Canos()!=0 || getQuant3Canos()!=0 || getQuant4Canos()!=0 || getQuantAvioes()!=0){
            for(int i = 0; i < 3;i++){

                System.out.println("Selecione a Linha, ");
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
                linhaA[i] = (scanner.nextInt() - 1);
                while (linhaA[i] > 9 || linhaA[i] < 0) {
                    System.out.println("Selecione uma Linha válida");
                    System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
                    linhaA[i] = (scanner.nextInt() - 1);
                }
                System.out.println("Selecione a Coluna");
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
                colunaA[i] = (scanner.nextInt() - 1);
                while (colunaA[i] > 9 || colunaA[i] < 0) {
                    System.out.println("Selecione uma Coluna válida");
                    System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
                    colunaA[i] = (scanner.nextInt() - 1);
                }

            }
            for(int i = 0; i< x.dimensoes.length; i++) {
                x.dimensoes[linhaA[i]][colunaA[i]] = 'A';
            }
            for(int i = 0; i< x.dimensoes.length; i++) {
                for(int j = 0; j< x.dimensoes.length; j++){
                    System.out.print(x.dimensoes[i][j]);
                }

                System.out.println();
            }
        }
        player.setGanhou(true);
    }

    public char[][] getDimensoes() {
        return dimensoes;
    }
    public int[] getLinhaA() {
        return linhaA;
    }
    public void setLinhaA(int[] NavioPositionLine) {this.linhaA = NavioPositionLine;}
    public int[] getColunaA(){
        return colunaA;
    }
    public void setColunaA(int[] NavioPositionCol) {this.colunaA = NavioPositionCol;}
    public void setDimensoes(char[][] dimensoes) {
        this.dimensoes = dimensoes;
    }
    public char[][] dimensoes() {
        return dimensoes;
    }


}
