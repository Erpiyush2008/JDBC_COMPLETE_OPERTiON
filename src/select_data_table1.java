import java.sql.*;

public class select_data_table1 {

    public static void main(String[] args) {

        try {
            // Load Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Create Connection
            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JDBC",
                    "root",
                    "PIYUSH"
            );

            // Select Query
            String q = "SELECT * FROM table1";

            Statement stmt = con.createStatement();

            ResultSet rs = stmt.executeQuery(q);

            System.out.println("tId\t tName\t\t tCity");
            System.out.println("--------------------------------");

            while (rs.next()) {
                int id = rs.getInt("tId");
                String name = rs.getString("tName");
                String city = rs.getString("tCity");

                System.out.println(id + "\t " + name + "\t " + city);
            }

            rs.close();
            stmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}