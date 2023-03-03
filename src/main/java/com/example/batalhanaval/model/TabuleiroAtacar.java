package com.example.batalhanaval.model;

import java.util.Scanner;

public class TabuleiroAtacar extends Navios{

    private int[] NavioAtaqueLine;
    private int[] NavioAtaqueCol;
    private int[][] cruz;
    private int[][] posicaoAtaque;

    private String Tiro;
    private String Agua;
    private char[][] dimensoes;
    public TabuleiroAtacar(char[][]dimensoes){
        this.dimensoes = dimensoes;
    }


    public void atacarNavio(){

            Scanner scanner = new Scanner(System.in);
            Navios navios = new Navios(); // chama a classe navios
            System.out.println("Selecione a Linha");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:"); //implementar a conversão de letras para numeros
            NavioAtaqueLine[0] = (scanner.nextInt() - 1);
            while (NavioAtaqueLine[0] > 9 || NavioAtaqueLine[0] < 0) {
                System.out.print("");
                System.out.println("Selecione uma Linha válida");
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
                NavioAtaqueLine[0] = (scanner.nextInt() - 1);
            }
            System.out.println("Selecione a Coluna");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            NavioAtaqueCol[0] = (scanner.nextInt() - 1);
            while (NavioAtaqueCol[0] > 9 || NavioAtaqueCol[0] < 0) {
                System.out.print("");
                System.out.println("Selecione uma Coluna válida");
                System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
                NavioAtaqueCol[0] = (scanner.nextInt() - 1);
            }
    }

    public int[][] getPosicaoAtaque() {
        return posicaoAtaque;
    }

    public void setPosicaoAtaque(int[][] posicaoAtaque) {
        this.posicaoAtaque = posicaoAtaque;}
}
