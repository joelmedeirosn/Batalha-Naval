package com.example.batalhanaval.model;

import java.util.Scanner;
import java.lang.*;

public class TabuleiroDefesa extends Navios {
    private int NavioPositionLine;
    private int NavioPositionCol;
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

    public void defender(){

        Scanner scanner = new Scanner(System.in);
        Navios navios = new Navios(); // chama a classe navios
        System.out.println("Selecione a Linha");
        System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:"); //implementar a conversão de letras para numeros
        NavioPositionLine = (scanner.nextInt() - 1);
        while(NavioPositionLine > 9 || NavioPositionLine < 0){
            System.out.print("");
            System.out.println("Selecione uma Linha válida");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            NavioPositionLine = (scanner.nextInt() - 1);
        }
        System.out.println("Selecione a Coluna");
        System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
        NavioPositionCol = (scanner.nextInt() - 1);
        while(NavioPositionCol > 9 || NavioPositionCol < 0){
            System.out.print("");
            System.out.println("Selecione uma Coluna válida");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            NavioPositionCol = (scanner.nextInt() - 1);
        }
    }

    public void teste(){
        defender();
        for(int i=0;i<dimensoes.length; i++){
            for(int j=0;j<dimensoes.length;j++){
                if (i == NavioPositionLine && j == NavioPositionCol) {
                    System.out.print(dimensoes[i][j] = 'N');
                }  else {
                    System.out.print(dimensoes[i][j] = '□');
                }
            }
            System.out.println();
        }
    }





    public int[][] getPosicaoDefesa() {
        return posicaoDefesa;
    }

    public void setPosicaoDefesa(int[][] posicaoDefesa) {this.posicaoDefesa = posicaoDefesa;}


}
