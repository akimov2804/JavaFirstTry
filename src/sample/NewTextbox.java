package sample;

import javafx.scene.control.Label;

public class NewTextbox extends Label {
    public NewTextbox(double X, double Y) {
        this.setText("Text");
        this.setId("Text" + 100);
        this.setLayoutX(X);
        this.setLayoutY(Y);
    }
}