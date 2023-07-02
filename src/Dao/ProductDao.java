
package Dao;
import Model.Product;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author User
 */
public class ProductDao {
    public static void Save(Product Product){
        String query = "insert into Product(Name,Category,Price) values ('"+Product.getName()+"','"+Product.getCategory()+"','"+Product.getPrice()+"')";
       DbOperations.setDataOrDelete(query, "Product Added Successfully!");
    }
    public static ArrayList<Product> getAllRecords(){
        ArrayList<Product> arrayList = new ArrayList<>();
        try{
              ResultSet rs = DbOperations.getData("select * from Product");
              while(rs.next()){
                  Product Product = new Product();
                  Product.setId(rs.getInt("ID"));
                  Product.setName(rs.getString("Name"));
                  Product.setCategory(rs.getString("Category"));
                  Product.setPrice(rs.getString("Price"));
                  arrayList.add(Product);
              }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
    public static void Update(Product Product){
        String query = "Update product set Name ='"+Product.getName()+"',Category ='"+Product.getCategory()+"',Price='"+Product.getPrice()+"' where id ='"+Product.getId()+"'";
        DbOperations.setDataOrDelete(query,"Product Updated Successfully!");
    }
     public static void delete(String Id){
         String query = "delete from Product where ID = '"+Id+"'";
         DbOperations.setDataOrDelete(query,"Product Deleted Successfully!");
     }
     public static ArrayList<Product> getAllRecordsByCategory(String Category){
         ArrayList<Product> arrayList = new ArrayList<>();
         try{
             ResultSet rs = DbOperations.getData("select * from product where Category='"+Category+"'");
             while(rs.next()){
                 Product Product = new Product();
                 Product.setName(rs.getString("Name"));
                 arrayList.add(Product);
             }
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
         return arrayList;
     }
      public static ArrayList<Product> filterProductByName(String Name, String Category){
         ArrayList<Product> arrayList = new ArrayList<>();
         try{
             ResultSet rs = DbOperations.getData("select * from product where Name like '%"+Name+"%' and Category ='"+Category+"'");
             while(rs.next()){
                 Product Product = new Product();
                 Product.setName(rs.getString("Name"));
                 arrayList.add(Product);
             }
         }
         catch(Exception e){
             JOptionPane.showMessageDialog(null, e);
         }
         return arrayList;
     }
      
      public static Product getProductByName(String Name){
          Product Product = new Product();
          try{
              ResultSet rs = DbOperations.getData("select * from Product where Name='"+Name+"'");
              while(rs.next())
              {
                  Product.setName(rs.getString(2));
                  Product.setCategory(rs.getString(3));
                  Product.setPrice(rs.getString(4));
              }
          }
          catch(Exception e){
              JOptionPane.showMessageDialog(null, e);
          }
          return Product;
      }
      
}
