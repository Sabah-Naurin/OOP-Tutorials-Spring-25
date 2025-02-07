package com.animalproject;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


public class AnimalDetailsController {

    @FXML
    private TextField petAgeField;

    @FXML
    private TextField petBreedField;

    @FXML
    private TextField petNameField;

    @FXML
    private Label detailsLabel;

    @FXML
    void onGoButtonClicked(ActionEvent event) {
        String petName = petNameField.getText();
        String petBreed = petBreedField.getText();
        int petAge = Integer.parseInt(petAgeField.getText());

        Animal a = new Animal();

        a.name = petName;
        a.breed = petBreed;
        a.age = petAge;

        detailsLabel.setText(a.printAnimalDetails());

    }

}
