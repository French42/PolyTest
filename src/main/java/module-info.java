module com.example.polytest {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.polytest to javafx.fxml;
    exports com.example.polytest;
}