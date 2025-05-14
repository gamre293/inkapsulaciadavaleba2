import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        String sql = "select id";
        String url = "jdbc:postgresql://localhost:5432/telusko";
        String username = "postgres";
        String password = "0000";

        Connection con = DriverManager.getConnection(url, username, password);
        Statement st = con.createStatement();
        st.executeQuery(sql);
    }
}