    
package Dao;
import Model.Category;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.sql.*;

/**
 *
 * @author User
 */
public class CategoryDao {
    public static void Save(Category Category){
        String query = "insert into Category (Name) values ('"+Category.getName()+"')";
        DbOperations.setDataOrDelete(query, "Category Added Successfully!");
    }
    public static ArrayList<Category> getAllRecords(){
        ArrayList<Category> arrayList = new ArrayList();
        try{
            ResultSet rs = DbOperations.getData("select * from Category");
            while(rs.next()){
                Category Category = new Category();
                Category.setId(rs.getInt("ID"));
                Category.setName(rs.getString("Name"));
                arrayList.add(Category);
                
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        return arrayList;
    }
     public static void delete(String Id){
         String query = "delete from Category where id='"+Id+"'";
         DbOperations.setDataOrDelete(query,"Category Deleted Successfully!");
     }
}
