package com.example.ballsort.bl;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

import java.util.ArrayList;
import java.util.List;

public class AddBall {
    private static VBox flask1;
    private VBox flask2;
    private VBox flask3;
    private static VBox flask4;

    public AddBall(VBox flask1, VBox flask2, VBox flask3, VBox flask4) {
        this.flask1 = flask1;
        this.flask2 = flask2;
        this.flask3 = flask3;
        this.flask4 = flask4;

    }
    static List<VBox> flasks = new ArrayList<>();

    static List<Button> buttonsList = new ArrayList<>();

    private static Button activeButton; // змінна для зберігання активної кнопки

    public static void addBall(VBox flask1, VBox flask2, VBox flask3, VBox flask4) {
        flasks.add(flask1);
        flasks.add(flask2);
        flasks.add(flask3);
        flasks.add(flask4);


        for (int i = 0; i < 3; i++) {
            for (VBox flask : flasks) {
                // Перевірка, чи має флягон (Flask) менше 4 кілець
                if (flask.getChildren().size() < 4) {
                    Button button = new Button("");
                    button.setStyle("-fx-background-color: #ffffff;\n" +
                            "  -fx-background-radius: 50%;\n" +
                            "  -fx-min-width: 50px;\n" +
                            "  -fx-border-color: #252525;" +
                            "  -fx-border-radius:  50%;" +
                            "  -fx-min-height: 50px;\n" +
                            "  -fx-max-width: 50px;\n" +
                            "  -fx-max-height: 50px;");
                    // String color = "-fx-background-color: " + color;
                    // button.setOnAction(buttonsAction());
                    buttonsList.add(button);
                    flask.getChildren().add(button);
                    button.setOnAction(e -> setActiveButton(button));

                }
            }
        }

        if(flask1.getChildren().size() > 4
                && flask2.getChildren().size() > 4
                && flask3.getChildren().size() > 4
                && flask4.getChildren().size() > 4){
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Помилка");
            alert.setHeaderText("Кількість кружків не може перевищувати 4");
            alert.showAndWait();
        }
    }

    private static void setActiveButton(Button button) {
        activeButton = button;
        for(VBox flask : flasks){
            flask.getChildren().remove(activeButton);

            if(flask.getChildren().size() < 4){
                flask.getChildren().add(activeButton);
                return;
            }

        }
    }
}

