module com.animalproject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.animalproject to javafx.fxml;
    exports com.animalproject;
}