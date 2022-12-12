package com.example.batalhanaval.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {

    @FXML
    private Button jogar;

    public void  onJogarAction(){
        System.out.println("Jogar");

    }
    @FXML private javafx.scene.control.Button fecharTela;
    public void sairTelaAction(){
        System.out.println("Sair");
    }

    @FXML
    private Button ranking;
    public void onRankingAction(){
        System.out.println("Ranking");
    }

    private Stage stage;
    private Scene scene;
    private Parent root;



    public void switchToJogar(ActionEvent event) throws IOException{
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/batalhanaval/view/Jogar.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }


}


