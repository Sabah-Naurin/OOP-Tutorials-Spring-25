module com.bankmanagement {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bankmanagement to javafx.fxml;
    exports com.bankmanagement;
}