package com.example.batalhanaval.model;

import java.util.Arrays;

public class Console {
    public static void main(String[] args){
        TabuleiroDefesa defesa = new TabuleiroDefesa(1,1,1,1,1);
        Player player1 = new Player();
        TabuleiroAtacar tabuleiroAtaque = new TabuleiroAtacar(4,3,2,1,1);
        player1.setPlayerName();
        defesa.printaDefesa();
        tabuleiroAtaque.printaAtaque();
        Navios navios = new Navios(1,1,1,1,1);

    }
}
