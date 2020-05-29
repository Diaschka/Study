package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import javax.swing.*;

public class Controller {
    @FXML
    public TextArea messageRead;
    @FXML
    public TextField messageWrite;
    @FXML
    public Button Send;

    @FXML
    public void menuExitOnClick(ActionEvent actionEvent) {
        System.exit(0);
    }

    public void send(ActionEvent actionEvent) {
        messageRead.appendText(messageWrite.getText() + "\n");
        messageWrite.clear();
    }
}
