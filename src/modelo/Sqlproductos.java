
package modelo;

import form.BuscarProductos;
import form.RegistrarCompra;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class Sqlproductos extends conectar {
     Connection cn=getConnection();
     String sql="",sql2="";
     Double imp;
     int cant;
     Double total;
     String []datos = new String [5];
     String[] datos2=new String[6];
   public /*boolean*/void AgregarProducto(productos items) {
     
       sql="INSERT INTO productos (id, Nombre,Descrip,P_compra,P_venta,Marca,Ganancia,Presentacion,Cant,Total) VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,items.getId());
            ps.setString(2,items.getNombre());
            ps.setString(3,items.getDescripcion());
            ps.setDouble(4,items.getP_compra());
            ps.setDouble(5,items.getPventa());
            ps.setString(6,items.getMarca());
            ps.setInt(7,items.getGanancia());
            ps.setString(8,items.getVenta());
            ps.setDouble(9,items.getCantidad());
            ps.setInt(10,items.getEntrada());
            int n= ps.executeUpdate();
           // ps.execute();       
            //boolean execute = ps.execute();
              if(n>0)
            {
                JOptionPane.showMessageDialog(null, "Se guardaron los datos");
               
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "Error");
            }
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ese código ya está registrado");
        }   
   }
    public void AgregarCodigo(product_code item) {
     
       sql="INSERT INTO product_code (id, nombre,imagencode) VALUES(?,?,?)";
        try {
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setString(1,item.getId());
            ps.setString(2,item.getNombre());
            ps.setString(3,item.getImagen());
            
            int n= ps.executeUpdate();
           // ps.execute();       
            //boolean execute = ps.execute();
              if(n>0)
            {
                JOptionPane.showMessageDialog(null, "Se guardaron los datos");
               
            }
            else
            {
                 JOptionPane.showMessageDialog(null, "Error");
            }
           
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Ese código ya está registrado");
        }   
   }
   
   RegistrarCompra reg= new RegistrarCompra(); 
  public boolean esnumero(String cadena){
      try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
  }

  
  /*Método busca y devuelve los datos a RegistrarCompra para que se agreguen a la tabla*/
  public String[] agregarventa(productos p){
    DefaultTableModel modelo= new DefaultTableModel();     
    cant=0;
    String valida = JOptionPane.showInputDialog(null,"Ingresa el numero de productos");
    if(esnumero(valida)){
            cant=Integer.parseInt(valida);
            if(cant>=1){      
            sql="";   
            sql="SELECT * FROM productos WHERE id='"+p.getId()+"' OR Nombre='"+p.getNombre()+"'";       
                try {
                    Statement st = cn.createStatement();
                    ResultSet rs = st.executeQuery(sql);
                    datos[0]="";
                    datos[1]="";
                    datos[2]="";
                    datos[3]="";
                    datos[4]="";         
                    if(rs.next()){    
                        System.out.println("Cant: "+cant+ " total: "+Double.parseDouble(rs.getString("Total")) );
                        if(Double.parseDouble(rs.getString("Total"))>=cant){//verifica que el numero de articulos esté en existencia
                              //System.out.println(rs.getString("Total"));
                              datos[0]=rs.getString("id");                
                              datos[1]=rs.getString("Nombre");
                              datos[2]=rs.getString("P_Venta");
                              imp=0.0;
                              imp=cant*Double.parseDouble(rs.getString("P_Venta"));
                              datos[3]=String.valueOf(cant);
                              datos[4]=String.valueOf(imp);                     
                         }else if(!rs.next()){
                             datos[0]="IN";  //no hay cantidad de productos             
                         }
                    }else{
                        datos[0]="NO";//no se encontrò
                    }
                } catch (SQLException ex) {
                        Logger.getLogger(Sqlproductos.class.getName()).log(Level.SEVERE, null, ex);
                }

                return datos;
          }else {
               datos[0]="N";
          }
    }else{
        datos[0]="LETRA";
    }
           return datos;
   }  
  /*Metodo buscar*/
  BuscarProductos busca=new BuscarProductos(null, false);
  
  public String[] buscar(productos p){
    
    sql="";   
    sql="SELECT * FROM productos WHERE id='"+p.getId()+"' || Nombre LIKE'%"+p.getNombre()+"%'";
    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        DefaultTableModel modelo= new DefaultTableModel();
        modelo=(DefaultTableModel) busca.tbuscar.getModel();
       
        if(rs.next()){ 
                datos[0]=rs.getString("id");
                datos[1]=rs.getString("Nombre");                
                datos[2]=rs.getString("Descrip");
                datos[3]=rs.getString("P_Venta");           
                datos[4]=rs.getString("Total");
                modelo.addRow(datos);  
                
        }else{
            JOptionPane.showMessageDialog(null, "No se encontró ningún producto");
            datos[0]="NO";
        }
    } catch (SQLException ex) {
            Logger.getLogger(Sqlproductos.class.getName()).log(Level.SEVERE, null, ex);
            
    }return datos;    
       
   }  
  public String[] busca_productos(String id){
      sql="";
      sql="Select * from productos where id='"+id+"'";
      try {
        Statement st=cn.createStatement();
        ResultSet rs=st.executeQuery(sql); 
        if(rs.next()){
            datos2[0]=rs.getString("id");
            datos2[1]=rs.getString("Nombre");
            datos2[2]=rs.getString("P_Compra");
            datos2[3]=rs.getString("P_Venta");
            datos2[4]=rs.getString("Total");
            datos2[5]=rs.getString("Ganancia");
        }  
        else{
            datos2[0]="NO";
        }
      } catch (SQLException ex) {
         //Logger.getLogger(Sqlproductos.class.getName()).log(Level.SEVERE, null, ex);
         JOptionPane.showMessageDialog(null, "Error, intenta de nuevo");
      }             
      return datos2;
  }  
  public boolean eliminarproducto(String codigo){
      boolean resp=false;
      sql="Delete from productos where id='"+codigo+"'";      
      sql2="Delete from detalles_ventas where id_Producto='"+codigo+"'";  
         try {
             Statement st=cn.createStatement();
             Statement st2=cn.createStatement();
             st2.executeUpdate(sql2);
             st.executeUpdate(sql);
             JOptionPane.showMessageDialog(null, "El producto: "+codigo+" se ha eliminado satisfactoriamente");
             resp=true;
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error");
             resp=false;
             //Logger.getLogger(Sqlproductos.class.getName()).log(Level.SEVERE, null, ex);
         }
     return resp;    
  }
  String cann;
  public boolean agregalmacen(String codigo){
      datos=busca_productos(codigo);  
      boolean ac=false;
      total=0.0;      
      cann = JOptionPane.showInputDialog(null,"Ingresa el numero de productos que se agregaran al inventario");
      if(esnumero(cann)){
          cant=Integer.parseInt(cann);
         if(cant>0){
            total=Double.parseDouble(datos[4])+cant;
            sql="UPDATE `productos` SET `Total` = '"+total+"' WHERE id='"+codigo+"'";
            Statement st;
               try {
                   st = cn.createStatement();
                   st.executeUpdate(sql);
                   JOptionPane.showMessageDialog(null, "Acción exitosa");
                   ac=true;
               } catch (SQLException ex) {
                   Logger.getLogger(Sqlproductos.class.getName()).log(Level.SEVERE, null, ex);
                   ac=false;
               }
         }else{
             JOptionPane.showMessageDialog(null, "Debe ingresar un numero mayor a 0");
             ac=false;
         }
      }else{
          ac=false;
          JOptionPane.showMessageDialog(null, "Solo se aceptan numeros");
      }  
    return ac;
  }
  public void actualizadatos(productos p, String codigo){
      //if(!repetido(p.getId())){
        /*     DefaultTableModel tb2 = (DefaultTableModel) BuscarProductos.tbuscar.getModel();
            int a2 =  BuscarProductos.tbuscar.getRowCount()-1;
            for (int i = a2; i >= 0; i--) {           
                tb2.removeRow(tb2.getRowCount()-1);
            }  */  
            total=0.0;
            datos2=busca_productos(codigo); 
            double ganancia=p.getPventa()-p.getP_compra();
            total=Double.parseDouble(datos2[4])+p.getEntrada();
            sql="Delete from detalles_ventas where id_Producto='"+codigo+"'";
            sql2="UPDATE productos SET id='"+p.getId()+"', nombre='"+p.getNombre()+"', `Total` = '"+total+"', P_Compra='"+p.getP_compra()+"', P_Venta='"+p.getPventa()+"', Ganancia='"+ganancia+"' WHERE id='"+codigo+"'";
            //String sql="UPDATE detalles_ventas SET id_Producto='"+p.getId()+"', Precio_Unitario='"+p.getPventa()+"' WHERE id_Producto='"+codigo+"'";
            Statement st,st2; 
            try {
                  st2=cn.createStatement();
                  st2.executeUpdate(sql);
                  st = cn.createStatement();
                  st.executeUpdate(sql2);
                  JOptionPane.showMessageDialog(null, "Los cambios se guardaron correctamente");
            } catch (SQLException ex) {

                   Logger.getLogger(Sqlproductos.class.getName()).log(Level.SEVERE, null, ex);
               }
      //}
  }
  public boolean repetido(String c){
    boolean r=false;
    sql="Select * from productos where id='"+c+"'";
    Statement st;
         try {
             st=cn.createStatement();
             ResultSet rs=st.executeQuery(sql);
             if(rs.next()){
                 JOptionPane.showMessageDialog(null, "Ese código ya existe");
                 r=true;
             }else{
                r=false; 
             }
             
         } catch (SQLException ex) {
             Logger.getLogger(Sqlproductos.class.getName()).log(Level.SEVERE, null, ex);
         }
    return r;}
  public boolean existe(String c){
    boolean r=false;
    sql="Select * from productos where id='"+c+"'";
    Statement st;
         try {
             st=cn.createStatement();
             ResultSet rs=st.executeQuery(sql);
             if(rs.next()){                
                 r=true;
             }else{
                r=false; 
             }             
         } catch (SQLException ex) {
             Logger.getLogger(Sqlproductos.class.getName()).log(Level.SEVERE, null, ex);
         }
    return r;
  }

}
