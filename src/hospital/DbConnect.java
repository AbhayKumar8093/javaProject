/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospital;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Abhay kumar
 */
public class DbConnect {
     static Connection conn;
        static Statement stmt;
        public static void connect_db()
        {
        try
        {
            //load drivers for mysql jdbc connectivity
        Class.forName("com.mysql.jdbc.Driver");
        //set the connection
        //DRIVERMANAGER.GETcONNECTION IS A METHOD USED TO CONNECT WITH THE DATABASE
        conn = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dbhospital?zeroDateTimeBehavior=convertToNull","root","");
        stmt= (Statement)conn.createStatement();
        }
        catch(ClassNotFoundException | SQLException | NumberFormatException | HeadlessException e)
        {
           System.out.println("Error:" + e.getMessage());
        }
        }
}
