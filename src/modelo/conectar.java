
package modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class conectar {
    private static Connection conn;
    private static  String driver ="com.mysql.jdbc.Driver";
    private static  String user ="root";
    private static  String pass ="infected";
    private static  String url  ="jdbc:mysql://localhost/agropuntoverde";
    

   
      
      
    public conectar() { 
        conn=null;
        String[] bd = recuperardatos();       
        user=bd[0];
        pass=bd[1];
        url=bd[2];        
        try{
            Class.forName(driver);
            conn=DriverManager.getConnection(url, user, pass);
        }catch(ClassNotFoundException | SQLException e){
            System.out.println(e);
            JOptionPane.showMessageDialog(null, e.getMessage()+"\n user:"+user+" password:"+pass+" url:"+url, "Error", JOptionPane.ERROR_MESSAGE);
        }       
    }
    public Connection getConnection(){
        System.out.println("Conexion establecida: "+conn);
        return conn;
    }
    Statement createStatement() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void cierraConexion() {
    try {
        conn.close();
        System.out.println("Conexion finalizada");
    } catch (SQLException sqle) {
        JOptionPane.showMessageDialog(null, "Error al cerrar conexion", "Error", JOptionPane.ERROR_MESSAGE);
        
    }
}
    
     public String[] recuperardatos(){
         File archivo = null;
         String[] datos=new String[3];
         FileReader fr = null;
         BufferedReader br = null;
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("bd.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         // Lectura del fichero
         String linea;
         int i=0;
         while((linea=br.readLine())!=null){
             datos[i]=linea;
             i++;
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      return datos;
    }
    
}
