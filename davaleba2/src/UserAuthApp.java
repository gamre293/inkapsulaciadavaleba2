import java.sql.*;
import java.util.Scanner;
import java.security.MessageDigest;

public class UserAuthApp {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/user_auth_db";
    static final String DB_USER = "postgres";
    static final String DB_PASSWORD = "yourpass";

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("1. Register\n2. Login\n3. Exit");
                int choice = scanner.nextInt();
                scanner.nextLine();

                if (choice == 1) {
                    System.out.print("Username: ");
                    String username = scanner.nextLine();

                    System.out.print("Password: ");
                    String password = scanner.nextLine();

                    System.out.print("First Name: ");
                    String firstName = scanner.nextLine();

                    System.out.print("Last Name: ");
                    String lastName = scanner.nextLine();

                    registerUser(username, password, firstName, lastName);
                } else if (choice == 2) {
                    System.out.print("Username: ");
                    String username = scanner.nextLine();

                    System.out.print("Password: ");
                    String password = scanner.nextLine();

                    loginUser(username, password);
                } else {
                    break;
                }
            }
        }
    }

    private static void registerUser(String username, String password, String firstName, String lastName) {
        String hashedPassword = hashPassword(password);

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO users (username, password, first_name, last_name) VALUES (?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, hashedPassword);
            stmt.setString(3, firstName);
            stmt.setString(4, lastName);
            stmt.executeUpdate();
            System.out.println("Registration successful.");
        } catch (SQLException e) {
            System.out.println("Error during registration: " + e.getMessage());
        }
    }

    private static void loginUser(String username, String password) {
        String hashedPassword = hashPassword(password);

        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, username);
            stmt.setString(2, hashedPassword);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                System.out.println("Login successful. Welcome " + rs.getString("first_name") + "!");
            } else {
                System.out.println("Invalid credentials.");
            }
        } catch (SQLException e) {
            System.out.println("Error during login: " + e.getMessage());
        }
    }

    private static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hashed = md.digest(password.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : hashed) {
                sb.append(String.format("%02x", b));
            }
            return sb.toString();
        } catch (Exception e) {
            throw new RuntimeException("Error hashing password", e);
        }
    }
}
