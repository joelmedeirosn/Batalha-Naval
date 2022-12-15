package com.example.batalhanaval.model;

import java.util.Scanner;

public class Player {
    private String player1Name;
    private String player2Name;

    public void name(){
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome, jogador 1:");
        player1Name = input.nextLine();

        while (player1Name.length()<=2 || player1Name.length()>=16){
            System.out.println("Digite um nome entre 3 e 15 caracteres.");
            player1Name = input.nextLine();
        }
        System.out.println("Digite seu nome, jogador 2:");
        player2Name = input.nextLine();
        while (player2Name.length()<=2 || player2Name.length()>=16){
            System.out.println("Digite um nome entre 3 e 15 caracteres.");
            player2Name = input.nextLine();
        }
    }

    public String getPlayer1Name() {
        return player1Name;
    }

    public String getPlayer2Name() {return player2Name;}
}
