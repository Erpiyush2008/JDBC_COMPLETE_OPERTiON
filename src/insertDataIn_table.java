import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
public class insertDataIn_table {


    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/JDBC";
            String user = "root";
            String password = "PIYUSH";

            Connection con = DriverManager.getConnection(url, user, password);

             String q= "insert into table1(tName,tCity) values (?,?)";

            PreparedStatement pstmt = con.prepareStatement(q);

            //set the value to query

            pstmt.setString(1,"Durgesh Tiwari");
            pstmt.setString(2,"Lucknow");
            pstmt.executeUpdate();
            System.out.print("inserted");
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
