import java.sql.*;

public class update_table1 {

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

            // Update Query
            String q = "UPDATE table1 SET tName=?, tCity=? WHERE tId=?";

            PreparedStatement pstmt = con.prepareStatement(q);

            pstmt.setString(1, " Sharma");
            pstmt.setString(2, "bhartpur");
            pstmt.setInt(3, 2);

            int i = pstmt.executeUpdate();

            if (i > 0) {
                System.out.println("Data Updated Successfully");
            } else {
                System.out.println("No Record Found");
            }

            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}