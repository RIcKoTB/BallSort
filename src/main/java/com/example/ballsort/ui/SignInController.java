package com.example.ballsort.ui;

import com.example.ballsort.bl.SignIn;
import com.example.ballsort.bl.SignUp;
import com.example.ballsort.da.entity.User;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class SignInController {

    @FXML
    private Button btnSignIn;

    @FXML
    private Button btnSignUp;

    @FXML
    private TextField txtbLogin;

    @FXML
    private TextField txtbPassword;

    @FXML
    void SignIn(ActionEvent event) throws IOException, SQLException {
        String login = txtbLogin.getText();
        String password = txtbPassword.getText();
        User user = new User(login, password);
        if (SignIn.signIn(user)) {
            Stage stg = (Stage) btnSignIn.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("mainmenu-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            stg.setScene(scene);
        }
    }

    @FXML
    void SignUpWay(ActionEvent event) throws IOException {
        Stage stg = (Stage) btnSignUp.getScene().getWindow();
        FXMLLoader fxmlLoader = new FXMLLoader(HelloController.class.getResource("signup-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stg.setScene(scene);
    }
}
