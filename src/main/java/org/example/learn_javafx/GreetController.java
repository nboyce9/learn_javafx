package org.example.learn_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class GreetController {

    @FXML
    Label greetingLabel;

    public void greet(String name){
      greetingLabel.setText("Hello, " + name + ". Welcome!!!");
    }
}
