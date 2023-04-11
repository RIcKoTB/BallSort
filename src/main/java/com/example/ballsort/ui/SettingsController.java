package com.example.ballsort.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.stage.Stage;

import java.io.IOException;

public class SettingsController {
    @FXML
    private Button btnColorSelect;

    @FXML
    private Button btnReturn;

    @FXML
    private ColorPicker colorp1;

    @FXML
    private ColorPicker colorp2;

    @FXML
    private ColorPicker colorp3;

    @FXML
    void Return(ActionEvent event) throws IOException {
        Stage stg = (Stage) btnReturn.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("mainmenu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stg.setScene(scene);
    }

    @FXML
    void SelectColor(ActionEvent event) {

    }

    @FXML
    void colorp1(ActionEvent event) {

    }

    @FXML
    void colorp2(ActionEvent event) {

    }

    @FXML
    void colorp3(ActionEvent event) {

    }
}
