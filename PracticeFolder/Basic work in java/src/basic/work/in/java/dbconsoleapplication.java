/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.work.in.java;

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
public class dbconsoleapplication {
    private final String dbname="advancejava";
    private final String host="localhost";
    private final String password="140186";
    private final String user="root";
    private final String url="jdbc:mysql://"+host+"/"+dbname;

    public dbconsoleapplication() {
        try {
            Connection connection=DriverManager.getConnection(url, user, password);
            System.out.println("connection established successfully");
            product product=new product(10,"laptopbd", 50000.0);
            
            //Insert value
            
            int id=product.getProductid();
            String name=product.getProductname();
            double price=product.getUnitprice();
         
            
            String sql = String.format("insert into product values(%d,'%s',%f)",
                    id,name,price);
            Statement statement=connection.createStatement();
            statement.executeUpdate(sql);
            
            System.out.println(product);
            System.out.println("insert values successfully");
            
        } catch (SQLException ex) {
            System.err.println("connection fail");
           
                   
            Logger.getLogger(dbconsoleapplication.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
