package org.example.learn_javafx;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

public class ImgViewController {

    @FXML
    ImageView imgView;
    @FXML
    Button switchBtn;

    Image img = new Image(getClass().getResourceAsStream("pinksmoke.jpg"));

    public void displayImg(){
        imgView.setImage(img);
    }

}
