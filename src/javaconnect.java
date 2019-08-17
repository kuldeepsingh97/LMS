/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author KULDEEP SINGH
 */
import java.sql.*;
import javax.swing.JOptionPane;

public class javaconnect {
    static Connection conn;
    
    public static Connection ConnecrDb(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/LMS?zeroDateTimeBehavior=convertToNull","root","");
            return conn;
        }
        catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
    
}
