package com.example.batalhanaval.model;

public class Teste {
    public static void main(String[] args){
        TabuleiroDefesa tabuleiro1 = new TabuleiroDefesa(4,3,2,1,1);
        TabuleiroDefesa tabuleiro2 = new TabuleiroDefesa(4,3,2,1,1);
        Player player1 = new Player();
        Player player2 = new Player();
        player1.setPlayerName();
        player2.setPlayerName();
        tabuleiro1.teste();
        tabuleiro2.teste();


    }
}
