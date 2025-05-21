import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnectionManager {
    private final String URL = "jdbc:postgresql://localhost:5432/school1";
    private final String USER = "postgres";
    private final String PASSWORD = "gamre";

    public Connection getConnection() throws SQLException {
        return DriverManager
                .getConnection(
                        URL,
                        USER,
                        PASSWORD
                );
    }
}
