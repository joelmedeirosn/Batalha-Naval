package com.example.batalhanaval.model;

import java.util.Scanner;

public class Player {
    private String playerName;

    private boolean ganhou;
    private boolean navioCustom; // modo customizado mais adiante.
    private double timer; // tempo que o player demora pra jogar.
    private int quantAtaques; // quantidade de ataques do jogador.

    public void setPlayerName(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome, jogador:");
        playerName = input.nextLine();

        while (playerName.length()<=2 || playerName.length()>=16){
            System.out.println("Digite um nome entre 3 e 15 caracteres.");
            playerName = input.nextLine();
        }
    }

    public String getPlayer1Name() {
        return playerName;
    }
}

