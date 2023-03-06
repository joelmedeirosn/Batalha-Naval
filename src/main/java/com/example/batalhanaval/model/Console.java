package com.example.batalhanaval.model;

public class Console {
    public static void main(String[] args){
        Player player1 = new Player("gabe");
        Player player2 = new Player("joel");
        Tabuleiro gridP1 = new Tabuleiro(player1,1,1,1,1,1);
        Tabuleiro gridP2 = new Tabuleiro(player2,1,1,1,1,1);//definidos como 1 para agilizar os testes no console.

        gridP1.defender(gridP1);
        gridP2.defender(gridP2);
        gridP1.atacarNavio(gridP2);
        gridP2.atacarNavio(gridP1);
    }
}
