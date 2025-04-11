//import javafx.application.Application;
//import javafx.fxml.FXMLLoader;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import javafx.scene.layout.StackPane;
//import javafx.stage.Stage;
//
//public class ColorScenesApp extends Application {
//
//    private Stage primaryStage;
//
//    @Override
//    public void start(Stage primaryStage) throws Exception {
//        this.primaryStage = primaryStage;
//
//        StackPane scene1Layout = new StackPane();
//        Button switchToYellowButton = new Button("Switch to Yellow Scene");
//        Button switchToRedButton = new Button("Switch to Red Scene");
//        Button switchToGreenButton = new Button("Switch to Green Scene");
//
//        switchToYellowButton.setOnAction(e -> switchScene("yellow"));
//        switchToRedButton.setOnAction(e -> switchScene("red"));
//        switchToGreenButton.setOnAction(e -> switchScene("green"));
//
//        scene1Layout.getChildren().addAll(switchToYellowButton, switchToRedButton, switchToGreenButton);
//
//        scene1Layout.setStyle("-fx-alignment: center; -fx-spacing: 10;");
//        Scene scene1 = new Scene(scene1Layout, 400, 400);
//
//        primaryStage.setTitle("Scene 1");
//        primaryStage.setScene(scene1);
//        primaryStage.show();
//    }
//
//    private void switchScene(String color) {
//        StackPane colorSceneLayout = new StackPane();
//        Button goBackButton = new Button("Go Back");
//
//        goBackButton.setOnAction(e -> {
//            try {
//                start(primaryStage);
//            } catch (Exception ex) {
//                ex.printStackTrace();
//            }
//        });
//
//        colorSceneLayout.getChildren().add(goBackButton);
//        colorSceneLayout.setStyle("-fx-background-color: " + color + "; -fx-alignment: center;");
//
//        Scene colorScene = new Scene(colorSceneLayout, 400, 400);
//        primaryStage.setScene(colorScene);
//        primaryStage.setTitle(color.substring(0, 1).toUpperCase() + color.substring(1) + " Scene");
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}
