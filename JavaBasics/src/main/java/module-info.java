module com.example.javabasics {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.javabasics to javafx.fxml;
    exports com.example.javabasics;
}