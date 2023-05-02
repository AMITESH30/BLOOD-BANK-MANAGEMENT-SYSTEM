/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjBack;
import java.sql.*;

/**
 *
 * @author Cherry
 */
public class ConnectionProvider {
    public static Connection getCon() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms", "root","1234" );
        }       
        catch(Exception e) {
            return null;
        }
    }
            
}
