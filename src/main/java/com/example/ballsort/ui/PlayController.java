package com.example.ballsort.ui;

import com.example.ballsort.bl.AddBall;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;

public class PlayController {
    @FXML
    private VBox Flask1;

    @FXML
    private VBox Flask2;

    @FXML
    private VBox Flask3;

    @FXML
    private VBox Flask4;

    @FXML
    private Button btnAgain;

    @FXML
    private Button btnReturn;

    @FXML
    void Again(ActionEvent event) {
        AddBall.addBall(Flask1, Flask2, Flask3, Flask4);
    }

    @FXML
    void Return(ActionEvent event) throws IOException {
        Stage stg = (Stage) btnReturn.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("mainmenu-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stg.setScene(scene);
    }
}
