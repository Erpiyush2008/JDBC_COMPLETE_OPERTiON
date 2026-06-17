import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import  java.io.*;
public class inserted_table1_datafromuser{

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String url = "jdbc:mysql://localhost:3306/JDBC";
            String user = "root";
            String password = "PIYUSH";

            Connection con = DriverManager.getConnection(url, user, password);

            String q = "INSERT INTO table1(tName, tCity) VALUES (?, ?)";

            PreparedStatement pstmt = con.prepareStatement(q);


  BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  System.out.println("Enter the name:");
String name = br.readLine();
System.out.println("Enter the city");
String city = br.readLine();

pstmt.setString(1,name);
pstmt.setString(2,city);
            pstmt.executeUpdate();
            pstmt.close();
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}