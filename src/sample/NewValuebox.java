package sample;

import javafx.scene.control.Label;

public class NewValuebox extends Label {
    public NewValuebox(double X, double Y) {
        this.setText("000");
        this.setPrefWidth(170);
        this.setPrefHeight(70);
        this.setId("Valuebox" + 100);
        this.setStyle("-fx-background-color: yellow; -fx-text-fill: black; -fx-font-size: 20px; -fx-alignment: center;");
        this.setLayoutX(X);
        this.setLayoutY(Y);
    }
}