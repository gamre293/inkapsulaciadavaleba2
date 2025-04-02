import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import java.nio.file.Paths;

public class JavaFXApp extends Application {
    @Override
    public void start(Stage primaryStage) {
        Pane root = new Pane();
        Scene scene = new Scene(root, 500, 500, Color.LIGHTBLUE);

        String iconPath = Paths.get("icon.png").toUri().toString();
        primaryStage.getIcons().add(new Image(iconPath));

        Canvas canvas = new Canvas(500, 500);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        root.getChildren().add(canvas);

        gc.setFill(Color.DARKBLUE);
        gc.setFont(new Font("Arial", 20));
        gc.fillText("Hello, this is an application", 150, 250);

        gc.setFill(Color.GREEN);
        gc.fillRect(50, 50, 100, 100);

        gc.setStroke(Color.YELLOW);
        gc.setLineWidth(2);
        gc.strokeLine(50, 50, 150, 150);
        gc.strokeLine(50, 150, 150, 50);

        gc.setStroke(Color.BLUE);
        gc.setLineWidth(2);
        gc.strokeRect(200, 100, 200, 300);

        gc.setFill(Color.YELLOW);
        gc.fillOval(300, 300, 100, 100);
        gc.setFill(Color.BLACK);
        gc.fillOval(325, 325, 10, 10);
        gc.fillOval(365, 325, 10, 10);
        gc.strokeArc(325, 360, 50, 25, 0, 180, javafx.scene.shape.ArcType.OPEN);

        primaryStage.setScene(scene);
        primaryStage.setResizable(false);
        primaryStage.setTitle("JavaFX Application");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}