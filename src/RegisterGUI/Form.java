/**
 * @filename: Form.java
 * @author: Chloe Healy
 */
package RegisterGUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Form extends Application {
    /**
     * Class to create a basic GUI window
     * @param primaryStage representation of GUI
     * @throws Exception
     */

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("form.fxml"));
        primaryStage.setTitle("Registration Form");
        primaryStage.setScene(new Scene(root, 500, 500));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
