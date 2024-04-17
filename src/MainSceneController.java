import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class MainSceneController {

    @FXML
    private TextField TextField;

    @FXML
    void submit(ActionEvent event) {
        Stage mainWindow = (Stage) TextField.getScene().getWindow();
        String title = TextField.getText();
        mainWindow.setTitle(title);
    }

}