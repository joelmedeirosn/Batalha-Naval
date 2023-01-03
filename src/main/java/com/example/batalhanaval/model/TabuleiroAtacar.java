package com.example.batalhanaval.model;

import java.util.Scanner;

public class TabuleiroAtacar extends Navios{

    private int atirarLine;
    private int atirarCol;
    private int[][] cruz;
    private int[][] posicaoAtaque;

    private String Tiro;
    private String Agua;
    private char[][] dimensoes;
    public TabuleiroAtacar(char[][]dimensoes){
        this.dimensoes=dimensoes;

    }

    public void atacarNavio(){
        Scanner scanner = new Scanner(System.in);
        Navios navios = new Navios(); // chama a classe navios
        System.out.println("Selecione a Linha");
        System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:"); //implementar a conversão de letras para numeros
        atirarLine = (scanner.nextInt() - 1);
        while(atirarLine > 9 || atirarLine < 0){
            System.out.print("");
            System.out.println("Selecione uma Linha válida");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            atirarLine = (scanner.nextInt() - 1);
        }
        System.out.println("Selecione a Coluna");
        System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
        atirarCol = (scanner.nextInt() - 1);
        while(atirarCol > 9 || atirarCol < 0){
            System.out.print("");
            System.out.println("Selecione uma Coluna válida");
            System.out.println("1, 2, 3, 4, 5, 6, 7, 8, 9 ou 10:");
            atirarCol = (scanner.nextInt() - 1);
        }


    }

    public int[][] getPosicaoAtaque() {
        return posicaoAtaque;
    }

    public void setPosicaoAtaque(int[][] posicaoAtaque) {
        this.posicaoAtaque = posicaoAtaque;}
}
