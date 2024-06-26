package project.gui;

import java.sql.*;
//import java.sql.connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;



public class Connect extends JFrame {
     Connection connection;
    public Connect(){
        try{
            connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc" , "root", "moh#hag9501");

        }catch (SQLException ex){
            Logger.getLogger(Connect.class.getName()).log(Level.SEVERE,null,ex);

        }

    }
}
