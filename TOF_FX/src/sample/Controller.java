package sample;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextArea;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class Controller {

    @FXML
    public AnchorPane ancorPane; // главная панель

    @FXML
    public Label menuLabel; // надпись Меню

    @FXML
    private TextArea textArea;

    @FXML
    private Button closeButton; // кнопка для выхода из программы

    // метод для кнопки выхода из программы
    public void handleButtonAction(ActionEvent actionEvent) {
        Stage stage = (Stage) closeButton.getScene().getWindow();
            stage.close();
        }

    // метод для кнопки выхода из программы
    public void handleButtonActionYes(ActionEvent actionEvent) {
        textArea.setText("Здравствуйте дорогая редакция пишет вам почтальон Печкин из деревни Простоквашино.\n" +
                " У меня появились новые соседи, мальчик, кот и собака с воронёнком");
    }
    }




