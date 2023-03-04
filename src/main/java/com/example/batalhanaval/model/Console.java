package com.example.batalhanaval.model;

public class Console {
    public static void main(String[] args){
        Tabuleiro jogo = new Tabuleiro("gabe",1,1,1,1,1);
        Player player1 = new Player("gabe");
        player1.setPlayerName();
        jogo.printaDefesa();
        jogo.printaAtaque();
    }
}
