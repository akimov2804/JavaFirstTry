package sample;

import javafx.scene.control.Label;
import javafx.scene.paint.Paint;

public class NewSwitcher extends Label {
    public NewSwitcher(double X, double Y) {
        this.setText("OFF");
        this.setPrefWidth(70);
        this.setPrefHeight(70);
        this.setId("Switcher" + 100);
        this.setStyle("-fx-background-color: red; -fx-text-fill: white; -fx-font-size: 20px; -fx-alignment: center");
        this.setLayoutX(X);
        this.setLayoutY(Y);
    }
}
