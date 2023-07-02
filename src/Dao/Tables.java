
package Dao;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class Tables {
    public static void main(String[] args){
        try
        {
           String userTable = "create table user(Name varchar(40),Email varchar(45) primary key,Password varchar(20),Address varchar(30),ContactNo varchar(12),UNIQUE (Email))";
           String AdminDetails = "insert into user(Name,Email,Password,ContactNo,Address) values('Admin','Admin@gmail.com','123','0768844321','Colombo')";
           String CategoryTable = "create table Category(ID int AUTO_INCREMENT primary key,Name varchar(30))";
           String ProductTable = "create table Product(ID int AUTO_INCREMENT primary key,Name varchar(50),Category varchar(50),Price varchar(39))";
           String BillTable = "create table Bill(ID int primary key,Name varchar(50),CntactNo varchar(50),Email varchar(39),Date varchar(50),Total varchar(50),CreatedBy varchar(50))";
           DbOperations.setDataOrDelete(userTable, "User Table Created Successfully!");
           DbOperations.setDataOrDelete(AdminDetails, "Admin Details Added Successfully!");
           DbOperations.setDataOrDelete(CategoryTable, "Category Table Created Successfully!");
           DbOperations.setDataOrDelete(ProductTable, "Product Table Created Successfully!");
           DbOperations.setDataOrDelete(BillTable, "Bill Table Created Successfully!");
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
