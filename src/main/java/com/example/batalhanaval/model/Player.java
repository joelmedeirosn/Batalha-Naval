package com.example.batalhanaval.model;

import java.util.Scanner;

public class Player {
    private String playerName;

    public void name(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome");
        playerName = input.nextLine();

        while (playerName.length()<=2 || playerName.length()>=16){
            System.out.println("Digite um nome entre 3 e 15 caracteres.");
            playerName = input.nextLine();
        }
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
}
