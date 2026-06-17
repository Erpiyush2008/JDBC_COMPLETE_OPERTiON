import java.sql.*;

public class Main {
   public static void main(String[] args) {



       try {
   //load the driver
           Class.forName("com.mysql.jdbc.Driver");

           String url = "jdbc:mysql://localhost:3306/JDBC";
           String user = "root";
           String password = "PIYUSH";
           //create a connection
           Connection con = DriverManager.getConnection(url,user,password);

           if(con.isClosed()){
               System.out.println("connection is closed");
           }else{
               System.out.println("connection is created");
           }

       }
catch (Exception e){
           e.printStackTrace();
}
    }
}