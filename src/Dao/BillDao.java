
package Dao;

import javax.swing.JOptionPane;
import java.sql.*;
import Model.Bill;
import java.util.ArrayList;


/**
 *
 * @author User
 */
public class BillDao {
    public static String getId(){
        int id = 1;
        try{
           ResultSet rs = DbOperations.getData("select max(ID) from bill"); 
           if(rs.next())
           {
               id = rs.getInt(1);
               id = id + 1;
               
           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return String.valueOf(id);
    }
    public static void Save(Bill Bill){
        String query = "insert into Bill values('"+Bill.getBill()+"','"+Bill.getName()+"','"+Bill.getContactNo()+"','"+Bill.getEmail()+"','"+Bill.getDate()+"','"+Bill.getTotal()+"','"+Bill.getCreatedBy()+"')";
        DbOperations.setDataOrDelete(query, "Bill Details Added Successfully!");
    }
    public static ArrayList<Bill> getAllRecordsByInc(String date){
        ArrayList<Bill> arrayList = new ArrayList<>();
        try{
             ResultSet rs = DbOperations.getData("select * from bill where Date like '%"+date+"%'"); 
           while(rs.next())
           {
               Bill bill = new Bill();
               bill.setBill(rs.getInt("id"));
               bill.setName(rs.getString("Name"));
               bill.setContactNo(rs.getString("CntactNo"));
               bill.setEmail(rs.getString("Email"));
               bill.setDate(rs.getString("Date"));
               bill.setTotal(rs.getString("Total"));
               bill.setCreatedBy(rs.getString("CreatedBy"));
               
               arrayList.add(bill);
           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
     public static ArrayList<Bill> getAllRecordsByDesc(String date){
        ArrayList<Bill> arrayList = new ArrayList<>();
        try{
             ResultSet rs = DbOperations.getData("select * from bill where Date like '%"+date+"%' order By id  DESC"); 
           while(rs.next())
           {
               Bill bill = new Bill();
               bill.setBill(rs.getInt("id"));
               bill.setName(rs.getString("Name"));
               bill.setContactNo(rs.getString("CntactNo"));
               bill.setEmail(rs.getString("Email"));
               bill.setDate(rs.getString("Date"));
               bill.setTotal(rs.getString("Total"));
               bill.setCreatedBy(rs.getString("CreatedBy"));
               
               arrayList.add(bill);
           }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
}
