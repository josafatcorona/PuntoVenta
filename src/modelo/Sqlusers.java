
package modelo;
import form.Inicio_sesion;
import form.Principal;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
public class Sqlusers extends conectar {            
  
    Connection cn=getConnection();
    String sql,sql2,admin="",folio="";
    int n;
    public boolean registrar(users usr){
      
      if(repetido(usr)){
          return false;
      }else {         
            String sql="INSERT INTO usuarios (User,Pass,Admin,Nombre,Ap_P,Ap_M,A_Nac) VALUES(?,?,?,?,?,?,?)";
             try {            
                 PreparedStatement ps=cn.prepareStatement(sql);
                 ps.setString(1,usr.getUser());
                 ps.setString(2,usr.getPass());
                 ps.setInt(3,usr.getAdmin());
                 ps.setString(4,usr.getNombre());
                 ps.setString(5,usr.getAp_p());
                 ps.setString(6,usr.getAp_m());
                 ps.setString(7,usr.getA_nac());
                 n= ps.executeUpdate();
                 return true;
             } catch (SQLException ex) {
                 Logger.getLogger(Sqlusers.class.getName()).log(Level.SEVERE, null, ex);
                 return false;
             } 
   }
    }
    
   public boolean acceder(users usr/*String user,String pass*/){
         //Consulta inicio sesión
        //Si extiste el usuario y la contraseña entra
        String sql="Select * from usuarios where  User='"+usr.getUser()+"' and Pass='"+usr.getPass()+"'";
    try{             
           Statement st=cn.createStatement();
           ResultSet rs =st.executeQuery(sql);             
           if(rs.next()){ 
                Inicio_sesion inicio= new Inicio_sesion();
                inicio.dispose();
                Principal p= new Principal(); //Manda a traer y hace visible la pantalla Principal
                String  nombre=rs.getString("nombre");
                String  caj=rs.getString("User");
                String admim;
                if(rs.getString("Admin").equals("1")){
                    admin="Administrador";
                }else{admin="Cajero";}
                p.jLabel2.setText(nombre);//Obtengo el nombre del cajero y lo mando a la pantalla Principal
                p.cajero=caj;
                /*Escribir en un archivo quien ingreso al sistema*/
                 FileWriter fichero = null;
                    PrintWriter pw = null;
                    try
                    {
                        String path = System.getProperty("user.dir");
                        fichero = new FileWriter(path+"/ingreso.txt");
                        pw = new PrintWriter(fichero);
                            pw.println(admin);

                    } catch (Exception e) {
                        e.printStackTrace();
                    } finally {
                       try {
                       // Nuevamente aprovechamos el finally para 
                       // asegurarnos que se cierra el fichero.
                       if (null != fichero)
                          fichero.close();
                       } catch (Exception e2) {
                          e2.printStackTrace();
                       }
                    }
                /*fin*/
                p.setVisible(true);
                inicio.setVisible(false);
                inicio.dispose();
                return true;
                }
           else if(!rs.next()){
                JOptionPane.showMessageDialog(null,"Usuario y/o Contraseña incorrectos");
                return false;    
        } 
     
     }catch(SQLException ex){
         Logger.getLogger(Inicio_sesion.class.getName()).log(Level.SEVERE,null,ex);
     }
     return true;
    }   
   sqlventas modv=new sqlventas();
   
public void eliminausuario(String usuario){
    if(!usuario.equals("dajoc96")){ 
        sql="Delete from usuarios where user='"+usuario+"'";
        sql2="Select * from ventas where Cajero='"+usuario+"'";   
        Statement st,st2;
        try {
            st2=cn.createStatement();
            ResultSet rs =st2.executeQuery(sql2);     
            while(rs.next()){
               folio=rs.getString("id");
               System.out.print(folio+" ");
               System.out.println(rs.getString("Cajero"));
               modv.eliminarventa(folio);

            }
            st = cn.createStatement();
            st.executeUpdate(sql);
            JOptionPane.showMessageDialog(null, "El usuario se ha eliminado correctamente");
        } catch (SQLException ex) {
        Logger.getLogger(Sqlusers.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}  
public boolean repetido(users usr){
    sql="select * from usuarios where User='"+usr.getUser()+"'";
    boolean exis=false;
    try{             
           Statement st=cn.createStatement();
           ResultSet rs =st.executeQuery(sql);             
           if(rs.next()){ 
                exis=true;    
           }
           else{
               exis=false;
           }
     
    }catch(SQLException ex){
         Logger.getLogger(Inicio_sesion.class.getName()).log(Level.SEVERE,null,ex);
     }
   return exis; 
}

public boolean esAdmin(users usr){
    sql="select * from usuarios where User='"+usr.getUser()+"'";    
    try{             
           Statement st=cn.createStatement();
           ResultSet rs =st.executeQuery(sql);             
           if(rs.next()){ 
               if(rs.getString("Admin").equals("1")){
                  return true;  
               }else{
                   return false;
               }
                  
           }
           else{
               return false;
           }
     
    }catch(SQLException ex){
         Logger.getLogger(Inicio_sesion.class.getName()).log(Level.SEVERE,null,ex);
         return false;
     }

}
}