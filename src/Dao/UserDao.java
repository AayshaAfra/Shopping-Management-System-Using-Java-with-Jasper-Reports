
package Dao;
import Model.Customer;
import javax.swing.JOptionPane;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author User
 */
public class UserDao {
    public static void save(Customer Customer){
        String query = "insert into user(Name,Email,Password,Address,ContactNo) values('"+Customer.getName()+"','"+Customer.getEmail()+"','"+Customer.getPassword()+"','"+Customer.getAddress()+"','"+Customer.getContactNo()+"')";
        DbOperations.setDataOrDelete(query,"Registered Successfully!");
    }
    
    public static Customer Login(String Email,String Password){
        Customer Customer = null;
        try{
            ResultSet rs = DbOperations.getData("select * from user where Email='"+Email+"' and Password='"+Password+"'");
            while(rs.next()){
                Customer = new Customer();
                Customer.setEmail(rs.getString("Email"));
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return Customer;
    }
    public static ArrayList<Customer> getAllRecords(String Email){
        ArrayList<Customer> arrayList = new ArrayList<>();
        try{
             ResultSet rs = DbOperations.getData("select * from user where Email like '%"+Email+"%'");
             while(rs.next()){
                 Customer Customer = new Customer();
                 Customer.setName(rs.getString("Name"));
                 Customer.setEmail(rs.getString("Email"));
                 Customer.setAddress(rs.getString("Address"));
                 Customer.setContactNo(rs.getString("ContactNo"));
                 arrayList.add(Customer);
             }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
