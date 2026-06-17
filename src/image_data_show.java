import  java.sql.*;
import  java.io.*;

public class image_data_show {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/JDBC",
                    "root",
                    "PIYUSH"
            );
            String q = "insert into images(pic) values(?)";

            PreparedStatement pstmt = con.prepareStatement(q);

            FileInputStream fis = new FileInputStream(
                    "C:\\formal.jpeg"
            );
            pstmt.setBinaryStream(1, fis, fis.available());

            pstmt.executeUpdate();

            System.out.println("Done....");


        }catch (Exception e){
            System.out.println("Error !!");
        }
    }
}
