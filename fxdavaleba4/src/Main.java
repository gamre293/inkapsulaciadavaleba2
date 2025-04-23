import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import java.awt.*;
import java.io.IOException;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static java.awt.image.ImageObserver.HEIGHT;
import static java.awt.image.ImageObserver.WIDTH;

public class Main extends Application {

    @Override
   public void start(Stage primaryStage) throws IOException {

        //1
//        primaryStage.setTitle("Choose Your Pet");
//
//        RadioButton catButton = new RadioButton("Cat");
//        RadioButton dogButton = new RadioButton("Dog");
//        RadioButton rabbitButton = new RadioButton("Rabbit");
//        RadioButton birdButton = new RadioButton("Bird");
//
//        ToggleGroup petGroup = new ToggleGroup();
//        catButton.setToggleGroup(petGroup);
//        dogButton.setToggleGroup(petGroup);
//        rabbitButton.setToggleGroup(petGroup);
//        birdButton.setToggleGroup(petGroup);
//
//        VBox radioBox = new VBox(5, catButton, dogButton, rabbitButton, birdButton);
//
//        TextField nameField = new TextField();
//        nameField.setPromptText("ex: Bunny");
//
//        Button submitButton = new Button("Submit");
//        Label resultLabel = new Label();
//
//        submitButton.setOnAction(e -> {
//            RadioButton selected = (RadioButton) petGroup.getSelectedToggle();
//            String name = nameField.getText().trim();
//
//            if (selected != null && !name.isEmpty()) {
//                String petType = selected.getText();
//                resultLabel.setText("You have chosen " + petType + " as " + name + ".");
//            } else {
//                resultLabel.setText("Please choose a pet and enter a name.");
//            }
//        });
//
//        VBox layout = new VBox(10);
//        layout.setStyle("-fx-padding: 20; -fx-font-size: 14;");
//        layout.getChildren().addAll(
//                new Label("Choose your pet:"),
//                radioBox,
//                new Label("Enter pet name:"),
//                nameField,
//                submitButton,
//                resultLabel
//        );
//
//        Scene scene = new Scene(layout, 300, 300);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);


//          2
//        Parent root = FXMLLoader.load(getClass().getResource("gallery.fxml"));
//        primaryStage.setTitle("Image Gallery");
//        primaryStage.setScene(new Scene(root, 600, 400));
//        primaryStage.show();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}

//        3
//    final int WIDTH = 600;
//    final int HEIGHT = 400;
//    final Canvas canvas = new Canvas(WIDTH, HEIGHT);
//
//
//        primaryStage.setTitle("What kind of greeting card do you want");
//
//        CheckBox balloonBox = new CheckBox("Balloons");
//        CheckBox heartBox = new CheckBox("Hearts");
//        CheckBox starBox = new CheckBox("Stars");
//        Button generateButton = new Button("Generate Card");
//
//        generateButton.setOnAction(e -> {
//            drawGreetingCard(balloonBox.isSelected(), heartBox.isSelected(), starBox.isSelected());
//        });
//
//        VBox layout = new VBox(10);
//        layout.setStyle("-fx-padding: 20; -fx-alignment: center;");
//        layout.getChildren().addAll(balloonBox, heartBox, starBox, generateButton, canvas);
//
//        Scene scene = new Scene(layout, WIDTH + 40, HEIGHT + 100);
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//
//    private void drawGreetingCard(boolean balloons, boolean hearts, boolean stars) {
//        GraphicsContext gc = canvas.getGraphicsContext2D();
//        gc.setFill(Color.LIGHTYELLOW);
//        gc.fillRect(0, 0, WIDTH, HEIGHT);
//
//        List<String> shapes = new ArrayList<>();
//        if (balloons) shapes.add("balloon");
//        if (hearts) shapes.add("heart");
//        if (stars) shapes.add("star");
//
//        if (shapes.isEmpty()) return;
//
//        Random rand = new Random();
//        for (int i = 0; i < 50; i++) {
//            String shape = shapes.get(rand.nextInt(shapes.size()));
//            double x = rand.nextDouble() * WIDTH;
//            double y = rand.nextDouble() * HEIGHT;
//
//            switch (shape) {
//                case "balloon":
//                    drawBalloon(gc, x, y);
//                    break;
//                case "heart":
//                    drawHeart(gc, x, y);
//                    break;
//                case "star":
//                    drawStar(gc, x, y);
//                    break;
//            }
//        }
//    }
//
//    private void drawBalloon(GraphicsContext gc, double x, double y) {
//        gc.setFill(Color.RED);
//        gc.fillOval(x, y, 30, 40);
//        gc.setStroke(Color.BLACK);
//        gc.strokeLine(x + 15, y + 40, x + 15, y + 60);
//    }
//
//    private void drawHeart(GraphicsContext gc, double x, double y) {
//        gc.setFill(Color.HOTPINK);
//        gc.fillOval(x, y, 20, 20);
//        gc.fillOval(x + 10, y, 20, 20);
//        gc.beginPath();
//        gc.moveTo(x, y + 15);
//        gc.lineTo(x + 20, y + 40);
//        gc.lineTo(x + 40, y + 15);
//        gc.closePath();
//        gc.fill();
//    }
//
//    private void drawStar(GraphicsContext gc, double x, double y) {
//        gc.setFill(Color.GOLD);
//        double[] xs = {x, x + 10, x + 40, x + 15, x + 25, x, x - 25, x - 15, x - 40, x - 10};
//        double[] ys = {y - 30, y - 10, y - 10, y + 5, y + 30, y + 15, y + 30, y + 5, y - 10, y - 10};
//        gc.fillPolygon(xs, ys, xs.length);
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//}



