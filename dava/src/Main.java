import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
     DatabaseConnectionManager dcm = new DatabaseConnectionManager();
        try {
            dcm.getConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
