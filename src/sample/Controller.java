package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {
    @FXML
    TextArea messagesTxtArea;
    @FXML
    TextField textTxtField;

    public void submit(ActionEvent actionEvent) {
        messagesTxtArea.setText(textTxtField.getText());
    }
}
