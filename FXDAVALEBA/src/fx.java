//import javafx.fxml.FXML;
//import javafx.scene.control.Button;
//import javafx.scene.layout.AnchorPane;
//
//import java.util.Random;
//
//public class JumpController {
//
//    @FXML
//    private AnchorPane anchorPane;
//
//    @FXML
//    private Button jumpButton;
//
//    private final Random random = new Random();
//
//    @FXML
//    private void moveButton() {
//        double paneWidth = anchorPane.getWidth();
//        double paneHeight = anchorPane.getHeight();
//        double buttonWidth = jumpButton.getWidth();
//        double buttonHeight = jumpButton.getHeight();
//
//        double newX = random.nextDouble() * (paneWidth - buttonWidth);
//        double newY = random.nextDouble() * (paneHeight - buttonHeight);
//
//        jumpButton.setLayoutX(newX);
//        jumpButton.setLayoutY(newY);
//      import javafx.application.Application;
//      import javafx.fxml.FXMLLoader;
//      import javafx.scene.Parent;
//      import javafx.scene.Scene;
//      import javafx.stage.Stage;
//
//  public class JumpApp extends Application {
//
//        @Override
//       public void start(Stage stage) throws Exception {
//         Parent root = FXMLLoader.load(getClass().getResource("JumpButton.fxml"));
//         stage.setTitle("Brain Drill");
//         stage.setScene(new Scene(root, 400, 400));
//         stage.show();
//      }
//
//       public static void main(String[] args) {
//            launch(args);
//    }
//}
