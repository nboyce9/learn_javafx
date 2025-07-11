package org.example.learn_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class GreetController {

    @FXML
    Label greetingLabel;
    @FXML
    AnchorPane rootScene2;
    Stage stage;

    public void greet(String name){
      greetingLabel.setText("Hello, " + name + ". Welcome!!!");
    }

    public void logout(ActionEvent e){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Do you want save yor work before exiting?: ");

        if(alert.showAndWait().get() == ButtonType.OK){
            stage =(Stage) rootScene2.getScene().getWindow();
            System.out.println("logged out");
            stage.close();
        }
    }

}
