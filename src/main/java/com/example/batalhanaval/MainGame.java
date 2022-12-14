package com.example.batalhanaval;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.paint.*;
import javafx.scene.shape.*;

import java.io.IOException;

public class MainGame extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(MainGame.class.getResource("view/Menu.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        //scene.getStylesheets().add(getClass().getResource("Menu.css").toExternalForm());
        String css = this.getClass().getResource("/com/example/batalhanaval/view/Menu.css").toExternalForm();
        stage.setScene(scene);
        stage.setTitle("Batalha Naval 🚢");
        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(event -> {
            event.consume();
            sairTelaAction(stage);
        });
    }
    public void sairTelaAction(Stage stage){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("Você está prestes a abandonar a tripulação.");
        alert.setContentText("Sair do jogo?");
        if(alert.showAndWait().get()== ButtonType.OK){
            stage.close();
        }

    }



    public static void main(String[] args) {
        launch(args);
    }
}