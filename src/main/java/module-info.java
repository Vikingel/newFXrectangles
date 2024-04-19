module com.example.firstfx1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.firstfx1 to javafx.fxml;
    exports com.example.firstfx1;
}