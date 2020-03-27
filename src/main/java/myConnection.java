

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class myConnection {
    public static Connection getConnection(){
        
        Connection con = null;
       
        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connected");
        } catch (ClassNotFoundException ex) {
            System.out.println("Class nhi mila");
        }
            
        try {
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javacontactapp","root", "");
        } catch (SQLException ex) {
           System.out.println("url me problem: "+ex.getMessage());
        }
        return con;
        } 
            //System.out.println(ex.getMessage());
            //System.out.println("Connection me error");
        
        
        
        
        
        
    }

