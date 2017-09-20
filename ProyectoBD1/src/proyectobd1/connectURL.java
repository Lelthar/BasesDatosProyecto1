package proyectobd1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.sql.*;
/**
 *
 * @author Gerald
 */
public class connectURL {
    
    public static void main(String[] args) {  

      // Create a variable for the connection string.  
      String bd = "banco";
      String userName = "sa";
      String userPassword = "3103199811";
      //
      // Declare the JDBC objects.  
      Connection con = null;  
      Statement stmt = null;  
      ResultSet rs = null;  
      //"jdbc:sqlserver://localhost:1433;databaseName=banco;integratedSecurity=true;","sa","3103199811"
      try {  
         // Establish the connection.  
         Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");  
         con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName="+bd+";",userName,userPassword);  
    
         // Create and execute an SQL statement that returns some data.  
         String SQL = "SELECT * FROM cliente";  
         stmt = con.createStatement();  
         rs = stmt.executeQuery(SQL);  
         

         // Iterate through the data in the result set and display it.  
         while (rs.next()) {  
            System.out.println(rs.getString(1) + " " + rs.getString(2) + " "+rs.getString(3));  
         }  
      }  

      // Handle any errors that may have occurred.  
      catch (Exception e) {  
         e.printStackTrace();  
      }  
      /*finally {  
         if (rs != null) try { rs.close(); } catch(Exception e) {}  
         if (stmt != null) try { stmt.close(); } catch(Exception e) {}  
         if (con != null) try { con.close(); } catch(Exception e) {}  
      }  */
   }  
}
