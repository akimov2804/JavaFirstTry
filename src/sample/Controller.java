package sample;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.Cursor;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.input.MouseEvent;
import javafx.event.EventHandler;


public class Controller {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button newButton;

    @FXML
    private Button newSwitcher;

    @FXML
    private Button newCheckbox;

    @FXML
    private Button newImage;

    @FXML
    private Button newValueBox;

    @FXML
    private Button newTextbox;

    @FXML
    private Button newLine;

    @FXML
    private Button newRectangle;

    @FXML
    private Button newEllipse;

    @FXML
    private Button newPolygon;

    @FXML
    private Pane workPane;

    @FXML
    void initialize() {
        EventList(newButton, workPane);
        EventList(newSwitcher, workPane);
        EventList(newCheckbox, workPane);
        EventList(newTextbox, workPane);
        EventList(newValueBox, workPane);
    }
    public double X = 0;
    public double Y = 0;
    public void EventList(Button element, Pane workPane){
        element.setOnAction(event -> {
            CreateControl(element, workPane, 0, 0);
        });
        element.setOnMouseReleased(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                if (Math.abs((int)(mouseEvent.getSceneX() - X)) > 20  &&
                        Math.abs((int)(mouseEvent.getSceneY() - Y)) > 20)
                    CreateControl(element, workPane,mouseEvent.getSceneX() - workPane.getLayoutX(), mouseEvent.getSceneY() - workPane.getLayoutY());
                element.setCursor(Cursor.HAND);
            }
        });
        element.setOnMouseEntered(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                X = mouseEvent.getSceneX();
                Y = mouseEvent.getSceneY();
                element.setCursor(Cursor.HAND);
            }
        });
    }
    public void CreateControl(Button element, Pane workPane, double X, double Y){
        if (element.getText().equals("Кнопка"))
            workPane.getChildren().add(new NewButton(X, Y));
        if (element.getText().equals("Переключатель"))
            workPane.getChildren().add(new NewSwitcher(X, Y));
        if (element.getText().equals("Индикатор"))
            workPane.getChildren().add(new NewCheckbox(X, Y));
        if (element.getText().equals("Текст"))
            workPane.getChildren().add(new NewTextbox(X, Y));
        if (element.getText().equals("Числовое значение"))
            workPane.getChildren().add(new NewValuebox(X, Y));
    }
}
