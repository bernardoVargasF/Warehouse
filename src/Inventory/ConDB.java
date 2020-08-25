package Inventory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author Bernardo
 */
public class ConDB {
    Connection conn;
    public ConDB () {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Searchin for connection class...");
             
             
        } catch (ClassNotFoundException ex) {
            System.out.println("Class not found and unable to connect " + 
                ex.getLocalizedMessage());
        }
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost/inventory", "inventoryuser", "04021986");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }        
    }
    public Connection getConnection() {
        return conn;
    }
    
}
