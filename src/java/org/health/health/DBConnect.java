/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.health.health;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Apple
 */
public class DBConnect {
        public Connection getMyConnection() throws SQLException, ClassNotFoundException{
        Connection conn  = null;
        try{
            //load driver
            Class.forName("com.mysql.jdbc.Driver");
            
            try{
                //db connect
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccineadmintarcker", "root", "");
            return conn; 
            }catch(SQLException s){
                
            }
        }catch(ClassNotFoundException n){
        }
        return conn;
    
}
    
}
