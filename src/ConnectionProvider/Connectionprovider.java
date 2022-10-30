/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionProvider;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
/**
 *
 * @author adars
 */
public class Connectionprovider {
    public static Connection getCon(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc.mysql://localhost:3306/StudentResultSystem", "root", "adarsh1234");
            return con;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e.toString());
            return null;
        }
    }
}
