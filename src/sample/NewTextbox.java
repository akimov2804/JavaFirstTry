package sample;

import javafx.scene.control.Label;

public class NewTextbox extends Label {
    public NewTextbox(double X, double Y, int count) {
        this.setText("Text");
        this.setId("Text" + count);
        this.setLayoutX(X);
        this.setLayoutY(Y);
    }
}