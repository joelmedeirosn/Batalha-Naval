package com.example.batalhanaval.model;

public class Console {
    public static void main(String[] args){
        TabuleiroDefesa defesa = new TabuleiroDefesa("gabe",1,1,1,1,1);
        Player player1 = new Player("gabe");
        TabuleiroAtacar tabuleiroAtaque = new TabuleiroAtacar("gabe",4,3,2,1,1);
        player1.setPlayerName();
        defesa.printaDefesa();
        tabuleiroAtaque.printaAtaque();
        Tabuleiro tabuleiro = new Tabuleiro("gabe",1,1,1,1,1);

    }
}
