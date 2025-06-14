package org.example.learn_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


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

    public void submit(ActionEvent e){
        String name = nameField.getText();
        checkAge();

        if(!name.isEmpty()){
            System.out.println("Welcome " + name + "!!");
        }
        else{
            System.out.println("Field can not be empty.");
        }
    }

    private void checkAge() {
        try{
            int age = userAge(ageField.getText());
            ageChecker.setText("ok");

        }catch (NumberFormatException nfe){
            ageChecker.setText("Field can not contain letters/symbols: ");
        }
    }


    private Integer userAge(String age){
        return Integer.parseInt(age);
    }
}
