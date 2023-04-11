module com.example.ballsort {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.ballsort to javafx.fxml;
    exports com.example.ballsort;
    exports com.example.ballsort.ui;
    opens com.example.ballsort.ui to javafx.fxml;
}