package com.example.batalhanaval.model;

import java.util.Scanner;
import java.lang.*;

public class TabuleiroDefesa extends Navios {
    private int[] NavioPositionLine = new int[10];  // deixar cada indice do array referente a um dos navios
                                                    // ex: NavioPositionLine[0] sera referentea posição do primeiro navio1cano.
    private int[] NavioPositionCol = new int [10];
    private char[][] dimensoes = new char[10][10];

    //private int[][] posicaoDefesa;
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
        for(int i=0;i<dimensoes.length; i++) {
            for (int j = 0; j < dimensoes.length; j++) {
                dimensoes[i][j] = '□';
            }
        }
    }

    public void defender(){
        NavioPositionLine[0] = 0;
        NavioPositionCol[0] = 0;

        for(int i = 0; i < (quant1Cano + quant2Canos + quant3Canos + quant4Canos + quantAvioes);i++){

            Scanner scanner = new Scanner(System.in);
            Navios navios = new Navios(); // chama a classe navios

            System.out.println("Selecione a Linha");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:"); //implementar a conversão de letras para numeros
            NavioPositionLine[i] = (scanner.nextInt() - 1);
            while(NavioPositionLine[i] > 9 || NavioPositionLine[i] < 0){
            System.out.print("");
            System.out.println("Selecione uma Linha válida");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            NavioPositionLine[i] = (scanner.nextInt() - 1);
            }
            System.out.println("Selecione a Coluna");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            NavioPositionCol[i] = (scanner.nextInt() - 1);
            while(NavioPositionCol[i] > 9 || NavioPositionCol[i] < 0){
            System.out.print("");
            System.out.println("Selecione uma Coluna válida");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            NavioPositionCol[i] = (scanner.nextInt() - 1);
            }
        }
    }

    public void printaTabuleiro(){
        defender();
        for(int i=0;i<dimensoes.length; i++) {
                dimensoes[NavioPositionLine[i]][NavioPositionCol[i]] = 'N';
        }
        for(int i=0;i<dimensoes.length; i++) {
            for(int j=0; j< dimensoes.length;j++){
                System.out.print(dimensoes[i][j]);
            }
            System.out.println();
        }
    }



/*    public int[][] getposicaoDefesa() {
        return posicaoDefesa;
    }
    public void setposicaoDefesa(int[][] posicaoDefesa) {this.posicaoDefesa = posicaoDefesa;}
*/

    public int[] getNavioPositionLine() {
        return NavioPositionLine;
    }

    public void setNavioPositionLine(int[] NavioPositionLine) {this.NavioPositionLine = NavioPositionLine;}

    public int[] getNavioPositionCol(){
        return NavioPositionCol;
    }
    public void setNavioPositionCol(int[] NavioPositionCol) {this.NavioPositionCol = NavioPositionCol;}

}
