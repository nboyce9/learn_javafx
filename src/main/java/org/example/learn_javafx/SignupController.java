package org.example.learn_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.paint.Color;


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
    @FXML
    Alert alert;

    public void submit(ActionEvent e){
//        checkName();
//        checkAge();
//        agreement();
        if(checkName() && checkAge() && agreement()){

            Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Confirm the information is correct.");
            alert.setHeaderText("Confirm the Information is correct.");
            alert.setContentText("Name: " +nameField.getText() + "\n"+
                    "Age: " + userAge(ageField.getText()) +"\n"+
                    "DOB: "+ datePicker.getValue() +"\n"+
                    "Gender: "+ getGender() + "\n"+
                    "Color: "+ colorPicker.getValue());
            alert.showAndWait();

            colorPicker.getValue();
        }
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
