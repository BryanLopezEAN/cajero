/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author Bryan Lopez Avila
 */
public class ConnectionDB {
   Connection cn;
    
    public Connection con(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            cn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/cajero_bank", "root", "");
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return cn;
    }
    
    Statement createStatement(){
       throw new UnsupportedOperationException("No soportado");
    }
}
