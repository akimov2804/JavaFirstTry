package sample;

import javafx.scene.control.Button;

public class NewCheckbox extends Button {
    public NewCheckbox(double X, double Y, int count) {
        this.setText("OFF");
        this.setPrefWidth(70);
        this.setPrefHeight(70);
        this.setId("CheckButton" + count);
        this.setLayoutX(X);
        this.setLayoutY(Y);
    }
}