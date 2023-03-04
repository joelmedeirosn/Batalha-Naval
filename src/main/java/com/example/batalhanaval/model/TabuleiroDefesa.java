package com.example.batalhanaval.model;

import java.util.Scanner;
import java.lang.*;

public class TabuleiroDefesa extends Tabuleiro {
    Tabuleiro tabuleiro = new Tabuleiro("gabe",4,3,2,1,1);
    private int[] NavioDefenseLine = new int[10];  // deixar cada indice do array referente a um dos navios
                                                    // ex: NavioPositionLine[0] sera referentea posição do primeiro navio1cano.
    private int[] NavioDefenseCol = new int [10];



    public TabuleiroDefesa(String playerName,int quant1Cano, int quant2Canos, int quant3Canos, int quant4Canos, int quantAvioes) {
        super(playerName,quant1Cano,quant2Canos,quant3Canos,quant4Canos,quantAvioes);

    }

    public void defender(){
        Player player1 = new Player("gabe");
        Player player2 = new Player("gabe");
        Player playerAtual;
        NavioDefenseLine[0] = 0;
        NavioDefenseCol[0] = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < (getQuant1Cano() + getQuant2Canos() + getQuant3Canos() + getQuant4Canos() + getQuantAvioes());i++){

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

    public void printaDefesa(){
        defender();
        for(int i = 0; i< getDimensoes().length; i++){
                getDimensoes()[NavioDefenseLine[i]][NavioDefenseCol[i]] = 'N';
        }
        for(int i = 0; i< getDimensoes().length; i++){
            for(int j = 0; j< getDimensoes().length; j++){
                System.out.print(getDimensoes()[i][j]);
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
