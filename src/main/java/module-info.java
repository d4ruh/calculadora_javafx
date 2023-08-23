module com.example.calculadora_javafx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.calculadora_javafx to javafx.fxml;
    exports com.example.calculadora_javafx;
}