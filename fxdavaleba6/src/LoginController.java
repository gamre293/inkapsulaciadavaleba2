import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {
    private final TextField usernameField;
    private final PasswordField passwordField;
    private final Label messageLabel;
    private final UserService userService = new UserService();

    public LoginController(TextField usernameField, PasswordField passwordField, Label messageLabel) {
        this.usernameField = usernameField;
        this.passwordField = passwordField;
        this.messageLabel = messageLabel;
    }

    public void handleLogin() {
        String username = usernameField.getText().trim();
        String password = passwordField.getText().trim();

        if (username.isEmpty() || password.isEmpty()) {
            messageLabel.setText("Please fill in both fields.");
        } else if (!userService.validateLogin(username, password)) {
            messageLabel.setText("Username or password is incorrect.");
        } else {
            messageLabel.setText("You are logged in successfully.");
        }
    }
}
