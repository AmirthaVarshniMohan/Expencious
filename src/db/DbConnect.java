package db;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author amirt
 */
public class DbConnect {
    public static Connection c;
    public static Statement st;
    static {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            c = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/spendingdb"+"?useSSL=false","root","root");
            st = c.createStatement();
            
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex);
        }
    }
}
