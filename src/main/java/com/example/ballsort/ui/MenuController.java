package com.example.ballsort.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class MenuController {
    @FXML
    private Button btnExit;

    @FXML
    private Button btnPlay;

    @FXML
    private Button btnRecords;

    @FXML
    private Button btnSettings;

    @FXML
    void Exit(ActionEvent event) {

    }

    @FXML
    void Play(ActionEvent event) throws IOException {
        Stage stg = (Stage) btnPlay.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("play-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stg.setScene(scene);
    }

    @FXML
    void Records(ActionEvent event) throws IOException {
        Stage stg = (Stage) btnRecords.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("records-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stg.setScene(scene);
    }

    @FXML
    void Settings(ActionEvent event) throws IOException {
        Stage stg = (Stage) btnSettings.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("settings-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stg.setScene(scene);
    }

}
