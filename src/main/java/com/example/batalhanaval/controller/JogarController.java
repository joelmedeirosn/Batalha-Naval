package com.example.batalhanaval.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class JogarController {
    private Stage stage;
    private Scene scene;
    private Parent root;

    @FXML
    private Label labelNome;

    @FXML
    private TextField txtNome;

    @FXML
    private Button nomeAvancar;

    public void onNomeAvancarAction(){


    }

    public void setarNome(){
        labelNome.setText("Seu nome é: "+ txtNome.getText());

    }

    public void switchToMenu(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("/com/example/batalhanaval/view/Menu.fxml"));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

}
