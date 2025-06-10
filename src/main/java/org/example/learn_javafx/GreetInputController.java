package org.example.learn_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class GreetInputController {
    @FXML
    TextField nameField;
    FXMLLoader loader;
    Stage stage;
    Scene scene;

    public void login(ActionEvent event) throws IOException {
        loader = new FXMLLoader(getClass().getResource("greet.fxml"));
        scene = new Scene(loader.load());
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();

        String name = nameField.getText();
        GreetController controller = loader.getController();
        controller.greet(name);

        stage.setScene(scene);
        stage.show();

    }
}
