package com.example.batalhanaval.model;

import java.util.Scanner;

public class TabuleiroAtacar extends Navios{

    private int[] NavioAtaqueLine = new int[10];
    private int[] NavioAtaqueCol = new int[10];
    private String cruz = "Cruz";
    private int[][] posicaoAtaque;

    private String tiro ="Tiro";
    private String Agua = "Agua";
    private char[][] dimensoes = new char[10][10];
    private boolean turno;



    public TabuleiroAtacar(int quant1Cano, int quant2Canos, int quant3Canos, int quant4Canos, int quantAvioes){
        super(quant1Cano, quant2Canos, quant3Canos, quant4Canos, quantAvioes);
        for(int i=0;i<dimensoes.length; i++) {
            for (int j = 0; j < dimensoes.length; j++) {
                dimensoes[i][j] = '□';
            }
        }
    }


    public void atacarNavio(){
        Player player1 = new Player();
        Player player2 = new Player();
        Player playerAtual;
        int contador = 0;

        NavioAtaqueLine[0] = 0;
        NavioAtaqueCol[0] = 0;
        Scanner scanner = new Scanner(System.in);
        Navios navios = new Navios(4,3,2,1,1);

               for(int i = 0; i < 5;i++){

               System.out.println("Selecione a Linha, ");
               System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:"); //implementar a conversão de letras para numeros
               NavioAtaqueLine[i] = (scanner.nextInt() - 1);
               while (NavioAtaqueLine[i] > 9 || NavioAtaqueLine[i] < 0) {
                   System.out.print("");
                   System.out.println("Selecione uma Linha válida");
                   System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
                   NavioAtaqueLine[i] = (scanner.nextInt() - 1);
               }
               System.out.println("Selecione a Coluna");
               System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
               NavioAtaqueCol[i] = (scanner.nextInt() - 1);
               while (NavioAtaqueCol[i] > 9 || NavioAtaqueCol[i] < 0) {
                   System.out.print("");
                   System.out.println("Selecione uma Coluna válida");
                   System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
                   NavioAtaqueCol[i] = (scanner.nextInt() - 1);
               }

           }


    }
        public void printaAtaque(){
        atacarNavio();
        for(int i=0;i<dimensoes.length; i++) {
            dimensoes[NavioAtaqueLine[i]][NavioAtaqueCol[i]] = 'A';
        }
        for(int i=0;i<dimensoes.length; i++) {
            for(int j=0; j< dimensoes.length;j++){
                System.out.print(dimensoes[i][j]);
            }
            System.out.println();
        }
    }

    public int[][] getPosicaoAtaque() {
        return posicaoAtaque;
    }

    public void setPosicaoAtaque(int[][] posicaoAtaque) {
        this.posicaoAtaque = posicaoAtaque;}
}
