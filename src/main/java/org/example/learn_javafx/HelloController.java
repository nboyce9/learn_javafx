package org.example.learn_javafx;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.shape.Circle;

public class HelloController {
    @FXML
    private Label welcomeText;

    @FXML
    private Circle circle;
    private double y;
    private double x;

    public void onUpClick(ActionEvent e){
        circle.setCenterY(y+=1);
    }
    public void onLeftClick(ActionEvent e){
        circle.setCenterX(x+=1);
    }
    public void onDownClick(ActionEvent e){
        circle.setCenterY(y-=1);
    }
    public void onRightpClick(ActionEvent e){
        circle.setCenterX(x+=1);
    }
}
