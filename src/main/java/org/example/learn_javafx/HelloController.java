package org.example.learn_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }

    public void onUpClick(ActionEvent e){
        System.out.println("UP");
    }
    public void onLeftClick(ActionEvent e){
        System.out.println("LEFT");
    }
    public void onDownClick(ActionEvent e){
        System.out.println("DOWN");
    }
    public void onRightpClick(ActionEvent e){
        System.out.println("RIGHT");
    }
}
