module co.edu.uniquindio.calculadora {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.edu.uniquindio.calculadora to javafx.fxml;
    exports co.edu.uniquindio.calculadora;
}
