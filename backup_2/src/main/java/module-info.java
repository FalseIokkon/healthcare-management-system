module com.example {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.healthcare to javafx.fxml;
    exports com.healthcare;
}
