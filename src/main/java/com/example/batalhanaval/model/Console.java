package com.example.batalhanaval.model;

public class Console {
    public static void main(String[] args){
        TabuleiroDefesa tabuleiro1 = new TabuleiroDefesa(1,1,1,1,1);
        Player player1 = new Player();
        TabuleiroAtacar tabuleiroAtaque = new TabuleiroAtacar(4,3,2,1,1);
        player1.setPlayerName();
        tabuleiro1.printaDefesa();
        tabuleiroAtaque.printaAtaque();


    }
}
