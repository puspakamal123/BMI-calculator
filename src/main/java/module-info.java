module com.example.bmicalculator {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.bmicalculator to javafx.fxml;
    exports com.example.bmicalculator;
}