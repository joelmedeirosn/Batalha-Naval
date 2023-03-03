package com.example.batalhanaval.model;

import java.util.Scanner;
import java.lang.*;

public class TabuleiroDefesa extends Navios {
    private int[] NavioDefenseLine = new int[10];  // deixar cada indice do array referente a um dos navios
                                                    // ex: NavioPositionLine[0] sera referentea posição do primeiro navio1cano.
    private int[] NavioDefenseCol = new int [10];
    private char[][] dimensoes = new char[10][10];

    //private int[][] posicaoDefesa;
    //private int quantAvioes;
    //private int quant4Canos;
    //private int quant3Canos;
    //private int quant2Canos;
    //private int quant1Cano;

    //private Navios[][] navios;


    public TabuleiroDefesa(int quant1Cano, int quant2Canos, int quant3Canos, int quant4Canos, int quantAvioes) {
        super(quant1Cano,quant2Canos,quant3Canos,quant4Canos,quantAvioes,);
        for(int i=0;i<dimensoes.length; i++) {
            for (int j = 0; j < dimensoes.length; j++) {
                dimensoes[i][j] = '□';
            }
        }
    }

    public void defender(){
        NavioDefenseLine[0] = 0;
        NavioDefenseCol[0] = 0;

        for(int i = 0; i < (quant1Cano + quant2Canos + quant3Canos + quant4Canos + quantAvioes);i++){

            Scanner scanner = new Scanner(System.in);
            Navios navios = new Navios(4,3,2,1,1); // chama a classe navios

            System.out.println("Selecione a Linha");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:"); //implementar a conversão de letras para numeros
            NavioDefenseLine[i] = (scanner.nextInt() - 1);
            while(NavioDefenseLine[i] > 9 || NavioDefenseLine[i] < 0){
            System.out.print("");
            System.out.println("Selecione uma Linha válida");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            NavioDefenseLine[i] = (scanner.nextInt() - 1);
            }
            System.out.println("Selecione a Coluna");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            NavioDefenseCol[i] = (scanner.nextInt() - 1);
            while(NavioDefenseCol[i] > 9 || NavioDefenseCol[i] < 0){
            System.out.print("");
            System.out.println("Selecione uma Coluna válida");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            NavioDefenseCol[i] = (scanner.nextInt() - 1);
            }
        }
    }

    public void printaTabuleiro(){
        defender();
        for(int i=0;i<dimensoes.length; i++) {
                dimensoes[NavioDefenseLine[i]][NavioDefenseCol[i]] = 'N';
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

    public int[] getNavioDefenseLine() {
        return NavioDefenseLine;
    }

    public void setNavioDefenseLine(int[] NavioPositionLine) {this.NavioDefenseLine = NavioPositionLine;}

    public int[] getNavioDefenseCol(){
        return NavioDefenseCol;
    }
    public void setNavioDefenseCol(int[] NavioPositionCol) {this.NavioDefenseCol = NavioPositionCol;}

}
