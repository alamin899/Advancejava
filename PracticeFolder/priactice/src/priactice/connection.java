/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package priactice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alamin899
 */
public class connection {

   
    public String dbname="advancejava";
    public String user="root";
    public String password="140186";
    public String host="localhost";
    public String url="jdbc:mysql://localhost/advancejava";
    
    
    int ids,prices;
    String names;

    public connection(int ids, int prices, String names) throws SQLException {
        this.ids = ids;
        this.prices = prices;
        this.names = names;
        
    }

    

    
    public void insert() throws SQLException{
        
        System.out.println(ids);
        Connection connec=DriverManager.getConnection(url, user, password);
        String query="INSERT INTO product values('+ids+','+this.prices+','+this.names+')";
        try {
            Statement statement=connec.createStatement();
            statement.executeUpdate(query);
            System.out.println("insert successfully");
        } catch (SQLException ex) {
            Logger.getLogger(connection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("not insert successfully,Database not connected");
        }
    }
    
}
