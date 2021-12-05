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

        if (usr.verifyEmail(email) && usr.verifyPass(password)) {
            showAlert(Alert.AlertType.CONFIRMATION, "Registration Success!",
                    "You have been registered successfully!");

        } else if (usr.verifyEmail(email) && !usr.verifyPass(password)) {
            showAlert(Alert.AlertType.ERROR, "Registration Error",
                    "Password not accepted. Try again!");

        } else if (!usr.verifyEmail(email) && usr.verifyPass(password)) {
            showAlert(Alert.AlertType.ERROR, "Registration Error",
                    "Email invalid! Please enter a valid email address.");
        } else {
            showAlert(Alert.AlertType.ERROR, "Registration Error",
                    "Invalid email. Password not accepted. Try again!");
        }
    }

    private static void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.show();
    }
}



