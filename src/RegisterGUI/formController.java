package RegisterGUI;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class formController {

    @FXML
    TextField emailField;

    @FXML
    PasswordField pass;

    @FXML
    Button btn;


    public void register(ActionEvent actionEvent) {
        String password = pass.getText();
        String email = emailField.getText();
        User usr = new User(email, password);
    }
}

