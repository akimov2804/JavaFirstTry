package sample;

import javafx.scene.control.Button;

public class NewButton extends Button {
    public NewButton(double X, double Y) {
        this.setText("Button");
        this.setPrefWidth(70);
        this.setPrefHeight(70);
        this.setId("Button" + 100);
        this.setLayoutX(X);
        this.setLayoutY(Y);
    }
}
