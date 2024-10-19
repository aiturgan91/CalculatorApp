module com.example.calculatorapp2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.calculatorapp2 to javafx.fxml;
    exports com.example.calculatorapp2;
}