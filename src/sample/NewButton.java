package sample;

import javafx.scene.control.Button;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

public class NewButton extends Button {
    public NewButton(double X, double Y, int count) {
        this.setText("Button" + count);
        this.setPrefWidth(100);
        this.setPrefHeight(70);
        this.setId("Button" + count);
        this.setLayoutX(X);
        this.setLayoutY(Y);
        this.setOnAction(e -> {
            try {
                send_request(this.getText());
            } catch (InterruptedException | IOException | ClassNotFoundException unknownHostException) {
                unknownHostException.printStackTrace();
            }
        });
    }
    public void send_request(String Name) throws UnknownHostException, IOException, ClassNotFoundException, InterruptedException {
        InetAddress host = InetAddress.getLocalHost();
        Socket socket = new Socket(host.getHostName(), 9876);
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
        oos.writeObject(Name + " clicked!");
        ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
        System.out.println((String) ois.readObject());
    }
}
