package com.example.boekvlucht;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class BoekvluchtController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}