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
    ToggleGroup genderGroup;

    @FXML
    CheckBox agree;

    public void submit(ActionEvent e){
        checkName();
        checkAge();
        agreement();


    }

    private boolean checkName() {
        String name = nameField.getText();

        if (name.isEmpty()) {
            nameChecker.setText("Field can not be empty: ");
            return false;
        } else {
            nameChecker.setText(" ");
            return true;
        }
    }

    private boolean checkAge() {
        try{
            int age = userAge(ageField.getText());
            return true;

        }catch (NumberFormatException nfe){
            ageChecker.setText("Field can not contain letters/symbols: ");
            return false;
        }
    }

    private Integer userAge(String age){
        return Integer.parseInt(age);
    }

    private boolean agreement(){
        if(agree.isSelected()){
            agrmntChecker.setText("ok");
            return true;
        }
        else{
            agrmntChecker.setText("Agree to the Ts&Cs: ");
            return false;
        }
    }

    private String getGender(){
        if(femaleLabel.isSelected()){
            return femaleLabel.getText();
        }
        else if(maleLabel.isSelected()){
            return maleLabel.getText();
        }
        else {
            return "";
        }
    }
}
