package org.example.learn_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;


public class SignupController {

    @FXML
    TextField nameField, ageField;

    @FXML
    Label ageChecker, agrmntChecker, nameChecker;

    @FXML
    ColorPicker colorPicker;

    @FXML
    DatePicker datePicker;

    @FXML
    RadioButton maleLabel, femaleLabel;

    @FXML
    CheckBox agree;

    public void submit(ActionEvent e){
        checkName();
        checkAge();
        agreement();

    }

    private void checkName() {
        String name = nameField.getText();

        if (name.isEmpty()) {
            nameChecker.setText("Field can not be empty: ");
        } else {
            nameChecker.setText(" ");
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

    private void agreement(){
        if(agree.isSelected()){
            agrmntChecker.setText("ok");
        }
        else{
            agrmntChecker.setText("Agree to the Ts&Cs: ");
        }
    }
}
