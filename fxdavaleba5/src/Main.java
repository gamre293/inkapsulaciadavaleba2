import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.util.HashMap;
import java.util.Map;

public class Main extends Application {

    private final ChoiceBox<String> fromCurrency = new ChoiceBox<>();
    private final ChoiceBox<String> toCurrency = new ChoiceBox<>();
    private final Spinner<Double> amountSpinner = new Spinner<>();
    private final Label resultLabel = new Label();

    private final Map<String, Double> rates = new HashMap<>();

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Currency Converter");

        rates.put("Lari", 1.0);
        rates.put("USD", 2.7);
        rates.put("GBP", 3.2);
        rates.put("EUR", 2.9);

        fromCurrency.getItems().addAll("Lari", "USD", "GBP", "EUR");
        toCurrency.getItems().addAll("Lari", "USD", "GBP", "EUR");
        fromCurrency.setValue("USD");
        toCurrency.setValue("Lari");

        SpinnerValueFactory<Double> valueFactory = new SpinnerValueFactory.DoubleSpinnerValueFactory(0, 10000, 1, 0.5);
        amountSpinner.setValueFactory(valueFactory);
        amountSpinner.setEditable(true);

        resultLabel.setFont(new Font("Arial", 18));
        resultLabel.setStyle("-fx-text-fill: darkgreen;");

        VBox layout = new VBox(15);
        layout.setPadding(new Insets(20));
        layout.setStyle("-fx-background-color: #f0f8ff;");
        layout.getChildren().addAll(
                new Label("Convert from:"), fromCurrency,
                new Label("Convert to:"), toCurrency,
                new Label("Enter amount:"), amountSpinner,
                new Label("Converted amount:"), resultLabel
        );

        fromCurrency.setOnAction(e -> updateConversion());
        toCurrency.setOnAction(e -> updateConversion());
        amountSpinner.valueProperty().addListener((obs, oldVal, newVal) -> updateConversion());

        updateConversion();

        Scene scene = new Scene(layout, 300, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateConversion() {
        String from = fromCurrency.getValue();
        String to = toCurrency.getValue();
        Double amount = amountSpinner.getValue();

        if (from == null || to == null || amount == null || amount < 0) {
            resultLabel.setText("Invalid input.");
            return;
        }

        if (from.equals(to)) {
            resultLabel.setText(String.format("%.2f %s", amount, to));
            return;
        }

        double amountInLari = amount * rates.get(from);
        double converted = amountInLari / rates.get(to);

        resultLabel.setText(String.format("%.2f %s", converted, to));
    }

    public static void main(String[] args) {
        launch(args);
    }
}
