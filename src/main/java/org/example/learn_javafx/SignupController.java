package org.example.learn_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.DatePicker;
import javafx.scene.control.RadioButton;

import java.awt.*;

public class SignupController {

    @FXML
    TextField nameField, ageField;

    @FXML
    Label ageChecker, agrmntChecker;

    @FXML
    ColorPicker colorPicker;

    @FXML
    DatePicker datePicker;

    @FXML
    RadioButton maleLabel, femaleLabel;
}
