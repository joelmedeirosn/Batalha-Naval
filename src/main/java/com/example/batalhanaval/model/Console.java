package com.example.batalhanaval.model;

public class Console {
    public static void main(String[] args){
        Player player1 = new Player();
        Player player2 = new Player();
        //player1.setPlayerName();
        //player2.setPlayerName();
        Tabuleiro gridP1 = new Tabuleiro(player1,4,1,0,0,0);
        Tabuleiro gridP2 = new Tabuleiro(player2,4,1,0,0,0);//definidos como 1 para agilizar os testes no console.


        gridP1.defender(gridP1);
        //gridP2.defender(gridP2);

        //gridP1.atacarNavio(gridP2);

        //gridP2.atacarNavio(gridP1);
    }
}
