/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priactice;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alamin899
 */
public class Priactice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        
        
            
              connection conn;
        conn = new connection(30,5000,"fg");
        conn.insert();
//        String hostname="localhost";
//        String username="root";
//        String password="140186";
//        String dbname="advancejava";
//        String url="jdbc:mysql://localhost/advancejava";
//        try {
//            Connection connection=(Connection) DriverManager.getConnection(url, username,password);
//            Statement statement=(Statement) connection.createStatement();
//            String query="INSERT INTO product values(13,'computer3125',45000)";
//            
//            
//            statement.executeUpdate(query);
//            System.out.println("insert successfully");
//        } catch (SQLException ex) {
//            System.out.println("not connect with database");
//            Logger.getLogger(Priactice.class.getName()).log(Level.SEVERE, null, ex);
//        }
        
    }
    
}
