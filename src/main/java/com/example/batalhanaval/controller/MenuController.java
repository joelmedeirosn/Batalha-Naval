package com.example.batalhanaval.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MenuController {

    @FXML
    private Button jogar;

    public void  onJogarAction(){
        System.out.println("Jogar");

    }
    @FXML private javafx.scene.control.Button fecharTela;
    public void sairTelaAction(){
        System.out.println("Fechar");
    }

    @FXML
    private Button ranking;
    public void onRankingAction(){
        System.out.println("Ranking");
    }
}


