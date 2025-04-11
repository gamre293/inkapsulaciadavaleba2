//import javafx.fxml.FXML;
//import javafx.scene.control.Alert;
//import javafx.scene.control.Alert.AlertType;
//import javafx.scene.control.Button;
//import javafx.stage.Stage;
//
//public class ButtonAlertController {
//
//    @FXML
//    private Button actionButton;
//
//    private int clickCount = 0;
//
//    @FXML
//    private void buttonClicked() {
//        clickCount++;
//
//        if (clickCount == 5) {
//            Alert alert = new Alert(AlertType.CONFIRMATION);
//            alert.setTitle("Close Application");
//            alert.setHeaderText("You clicked the button 5 times!");
//            alert.setContentText("Do you want to close the application?");
//
//            alert.showAndWait().ifPresent(response -> {
//                if (response.getText().equals("OK")) {
//                    // If "OK" is clicked, close the application
//                    Stage stage = (Stage) actionButton.getScene().getWindow();
//                    stage.close();
//                }
//
//            });
//        }
//    }
//}
//
//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.stage.Stage;
//
//public class ButtonAlertApp extends Application {
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        Parent root = FXMLLoader.load(getClass().getResource("ButtonAlertApp.fxml"));
//        primaryStage.setTitle("Button Alert Application");
//
//        primaryStage.setOnCloseRequest(event -> {
//            event.consume();
//        });
//
//        primaryStage.setScene(new Scene(root, 400, 400));
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}

