
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class conectar {
    private static Connection conn;
    private static  String driver ="com.mysql.jdbc.Driver";
    private static final String user ="root";
    private static final String pass ="infected";
    private static final String url  ="jdbc:mysql://localhost/agropuntoverde";
    

   
      
      
    public conectar() {   
        conn=null;
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user, pass);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
        }       
    }
    public Connection getConnection(){
        System.out.println("Conexion establecida: "+conn);
        return conn;
    }
    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
