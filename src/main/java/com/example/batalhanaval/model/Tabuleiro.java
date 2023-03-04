package com.example.batalhanaval.model;

import java.util.Scanner;
import java.lang.*;

public class Tabuleiro extends Navios {
    private int[] linha = new int[10];  // deixar cada indice do array referente a um dos navios
                                                    // ex: NavioPositionLine[0] sera referentea posição do primeiro navio1cano.
    private int[] coluna = new int [10];

    public Tabuleiro(String playerName, int quant1Cano, int quant2Canos, int quant3Canos, int quant4Canos, int quantAvioes) {
        super(playerName,quant1Cano,quant2Canos,quant3Canos,quant4Canos,quantAvioes);

    }

    public void defender(){
        Player player1 = new Player("gabe");
        Player player2 = new Player("gabe");
        Player playerAtual;
        linha[0] = 0;
        coluna[0] = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < (getQuant1Cano() + getQuant2Canos() + getQuant3Canos() + getQuant4Canos() + getQuantAvioes());i++){

            System.out.println("Selecione a Linha");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:"); //implementar a conversão de letras para numeros
            linha[i] = (scanner.nextInt() - 1);
            while(linha[i] > 9 || linha[i] < 0){
            System.out.print("");
            System.out.println("Selecione uma Linha válida");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            linha[i] = (scanner.nextInt() - 1);
            }
            System.out.println("Selecione a Coluna");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            coluna[i] = (scanner.nextInt() - 1);
            while(coluna[i] > 9 || coluna[i] < 0){
            System.out.print("");
            System.out.println("Selecione uma Coluna válida");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            coluna[i] = (scanner.nextInt() - 1);
            }
        }
    }

    public void printaDefesa(){
        defender();
        for(int i = 0; i< getDimensoes().length; i++){
                getDimensoes()[linha[i]][coluna[i]] = 'N';
        }
        for(int i = 0; i< getDimensoes().length; i++){
            for(int j = 0; j< getDimensoes().length; j++){
                System.out.print(getDimensoes()[i][j]);
            }
            System.out.println();
        }
    }

    public void atacarNavio(){
        Player player1 = new Player("gabe");
        Player player2 = new Player("gabe");
        Player playerAtual;
        Tabuleiro defesa = new Tabuleiro("gabe",4,3,2,1,1);
        int contador = 0;

       linha[0] = 0;
        coluna[0] = 0;
        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < 5;i++){

            System.out.println("Selecione a Linha, ");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:"); //implementar a conversão de letras para numeros
            linha[i] = (scanner.nextInt() - 1);
            while (linha[i] > 9 || linha[i] < 0) {
                System.out.print("");
                System.out.println("Selecione uma Linha válida");
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
                linha[i] = (scanner.nextInt() - 1);
            }
            System.out.println("Selecione a Coluna");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            coluna[i] = (scanner.nextInt() - 1);
            while (coluna[i] > 9 || coluna[i] < 0) {
                System.out.print("");
                System.out.println("Selecione uma Coluna válida");
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
                coluna[i] = (scanner.nextInt() - 1);
            }

        }


    }
    public void printaAtaque(){
        Tabuleiro defesa = new Tabuleiro("gabe",4,3,2,1,1);
        atacarNavio();
        for(int i = 0; i< getDimensoes().length; i++) {
            getDimensoes()[linha[i]][coluna[i]] = 'A';
        }
        for(int i = 0; i< getDimensoes().length; i++) {
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

    public int[] getLinha() {
        return linha;
    }

    public void setLinha(int[] NavioPositionLine) {this.linha = NavioPositionLine;}

    public int[] getColuna(){
        return coluna;
    }
    public void setColuna(int[] NavioPositionCol) {this.coluna = NavioPositionCol;}


}
