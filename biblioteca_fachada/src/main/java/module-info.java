module co.uniquindio.poo {
    requires javafx.controls;
    requires javafx.fxml;

    opens co.uniquindio.poo to javafx.fxml;
    exports co.uniquindio.poo;
}
