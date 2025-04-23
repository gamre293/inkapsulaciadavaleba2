public class UserService {

    private final String validUsername = "admin";
    private final String validPassword = "1234";

    public boolean validateLogin(String username, String password) {
        return username.equals(validUsername) && password.equals(validPassword);
    }
}
