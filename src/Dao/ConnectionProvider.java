
package Dao;
import java.sql.*;
/**
 *
 * @author User
 */
public class ConnectionProvider {
     public static Connection getCon()
    {
        try
        {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Shop","root","");
            return con;
        }
        catch(Exception e)
        {
            return null;
        }
    }
}

 
