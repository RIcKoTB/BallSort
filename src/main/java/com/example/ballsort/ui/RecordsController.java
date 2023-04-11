package com.example.ballsort.ui;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.stage.Stage;

import java.io.IOException;

public class RecordsController {
    @FXML
    private Button btnReturn;

    @FXML
    private TableColumn<?, ?> idColum;

    @FXML
    private TableColumn<?, ?> levelColum;

    @FXML
    private TableColumn<?, ?> nameColum;

    @FXML
    void Return(ActionEvent event) throws IOException {
        Stage stg = (Stage) btnReturn.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("mainmenu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stg.setScene(scene);
    }
}
