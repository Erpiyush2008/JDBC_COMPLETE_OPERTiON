import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class piyush {
    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/JDBC";
            String user = "root";
            String password = "PIYUSH";

            Connection con = DriverManager.getConnection(url, user, password);

            String q = "CREATE TABLE table1 (" +
                    "tId INT PRIMARY KEY AUTO_INCREMENT, " +
                    "tName VARCHAR(200) NOT NULL, " +
                    "tCity VARCHAR(400))";

            Statement stmt = con.createStatement();

            stmt.executeUpdate(q);

            System.out.println("Table created successfully.");

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}