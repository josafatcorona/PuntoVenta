
package modelo;

import form.VentasDelDia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class sqlventas extends conectar{
    Connection cn=getConnection();
    String nventa="",num="",sql="",sql2="",sql3="";
    int n=0,a;
    Double desc, total, aum;
    String datos []= new String[3];
    public int nceldas=0;
    String idventa="";
    String fecha="",cajero="";
    public   String[][] datosventa=new String[nceldas][5];
    
    public String numventa(){
        sql="SELECT MAX(ventas.id) FROM ventas";
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            if(rs.next() && rs.getObject("MAX(ventas.id)")!=null){          
               nventa=rs.getString("MAX(ventas.id)");
               n=Integer.parseInt(nventa)+1;
               num=String.valueOf(n);  
               rs.next();
               //rs.beforeFirst();
             }else{
                num="1";

            }       
            } catch (SQLException ex) {
                Logger.getLogger(sqlventas.class.getName()).log(Level.SEVERE, null, ex);
            }   
    
 return num;   
}    
public void verventas(){  
    //limpiar tabla
        DefaultTableModel tb = (DefaultTableModel) VentasDelDia.tventas.getModel();
        a = VentasDelDia.tventas.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
            tb.removeRow(tb.getRowCount()-1);
        } 
        //limpa tabla detalles
        DefaultTableModel tb2 = (DefaultTableModel) VentasDelDia.tdetalle.getModel();
        int a2 = VentasDelDia.tdetalle.getRowCount()-1;
        for (int i = a2; i >= 0; i--) {           
            tb2.removeRow(tb2.getRowCount()-1);
        }         
        //fin limpiar
        sql="";   
        sql="SELECT * FROM ventas";
        DefaultTableModel modelo;      
       
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);            
            while(rs.next())
            {               
                modelo=(DefaultTableModel) VentasDelDia.tventas.getModel();
                datos[0]=rs.getString("Id");
                datos[1]=rs.getString("Cajero");
                datos[2]= rs.getString("Fecha");
                modelo.addRow(datos);
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(sqlventas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
}
 String datos2 []= new String[4];
public void detalle_ventas(String venta){
    DefaultTableModel tb2 = (DefaultTableModel) VentasDelDia.tdetalle.getModel();
    int a2 = VentasDelDia.tdetalle.getRowCount()-1;
    for (int i = a2; i >= 0; i--) {           
        tb2.removeRow(tb2.getRowCount()-1);
    }    
    String sqll="SELECT ventas.id,ventas.fecha, productos.Nombre, usuarios.nombre, detalles_ventas.cantidad, detalles_ventas.Precio_Unitario, detalles_ventas.Precio_total FROM ventas INNER JOIN detalles_ventas INNER JOIN productos INNER JOIN usuarios WHERE ventas.id='"+venta+"' and detalles_ventas.id_Producto=productos.id and ventas.id=detalles_ventas.id_Venta and ventas.Cajero=usuarios.User";
    DefaultTableModel modelo = null;      
    String datosq []= new String[4];   
      try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sqll);
            idventa="";
            String fecha="",cajero="";
            if(rs.next()){
               
                   do{              
                        modelo=(DefaultTableModel) VentasDelDia.tdetalle.getModel();
                        cajero=rs.getString("usuarios.nombre");
                        idventa=rs.getString("ventas.id");
                        fecha=rs.getString("ventas.fecha");
                        datosq[0]=rs.getString("productos.nombre");
                        datosq[1]= rs.getString("detalles_ventas.cantidad");
                        datosq[2]=rs.getString("detalles_ventas.Precio_Unitario");
                        datosq[3]=rs.getString("detalles_ventas.Precio_total");
                        modelo.addRow(datosq);
                        VentasDelDia.tdetalle.setModel(modelo);
                        
                    } while(rs.next());
                    VentasDelDia.nticket.setText(idventa);
                    VentasDelDia.folio.setText(idventa);
                    VentasDelDia.cajero.setText(cajero);
                    VentasDelDia.fecha2.setText(fecha);
           }else{
               JOptionPane.showMessageDialog(null, "La venta no existe: "+ venta);
           }
        } catch (SQLException ex) {
            Logger.getLogger(sqlventas.class.getName()).log(Level.SEVERE, null, ex);
        }
      
}

public void registracompra(String idcajero,int nventa,String fecha, Double total){
    
    sql="Insert into ventas (id,Cajero,Fecha,Total,Tipo) values (?,?,?,?,?)";
    sql2="Insert into detalles_ventas (id_Venta,id_Producto,cantidad,Precio_Unitario,Precio_Total)values(?,?,?,?,?)";
    int n2=0;
      try {
            PreparedStatement ps2=cn.prepareStatement(sql2);
            PreparedStatement ps=cn.prepareStatement(sql);
            ps.setInt(1,nventa);
            ps.setString(2,idcajero);
            ps.setString(3,fecha);
            ps.setString(4,total.toString());
            ps.setString(5,"E");
            int i=0;
            int n3=0; 
            n= ps.executeUpdate();
            for(i=0;i<=nceldas-1;i++){
                total=descuento(datosventa[i][0], Integer.parseInt(datosventa[i][3]));            
                sql3="UPDATE productos SET Total ='"+total+"' WHERE productos.id='"+ datosventa[i][0]+"'";
                PreparedStatement ps3=cn.prepareStatement(sql3);
                    ps2.setInt(1, nventa);    
                    ps2.setString(2, datosventa[i][0]);   
                    ps2.setInt(3, Integer.parseInt(datosventa[i][3]));   
                    ps2.setFloat(4,Float.parseFloat(datosventa[i][2]));
                    ps2.setFloat(5,Float.parseFloat(datosventa[i][4]));
                    n2=ps2.executeUpdate();
                    n3= ps3.executeUpdate();
                 } 
            if(n>0 && n2>0 && n3>0){
                JOptionPane.showMessageDialog(null, "¡Gracias por su compra!");
            }
            else{
                 JOptionPane.showMessageDialog(null, "Error");
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(Sqlusers.class.getName()).log(Level.SEVERE, null, ex);
            
        } 
    sql2="";
}
public Double descuento(String codigo, int descu){  
     desc=0.0;
     sql="";   
        sql="SELECT * FROM productos where id='"+codigo+"'";       
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);            
            if(rs.next())
            {
              desc= Double.parseDouble(rs.getString("Total"))-descu;
            }
           
        } catch (SQLException ex) {
            Logger.getLogger(sqlventas.class.getName()).log(Level.SEVERE, null, ex);
        }
 return desc;       
}
public Double aumento(String codigo){  
    aum=0.0;
     sql="";sql2="";   
        sql="SELECT cantidad FROM detalles_ventas where id_Venta='"+codigo+"'";   
        sql2="SELECT Total FROM productos where id='"+codigo+"'";   
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            Statement st2 = cn.createStatement();
            ResultSet rs2 = st2.executeQuery(sql2);            
            if(rs.next() && rs2.next())
            {
                System.out.println("Total: "+rs2.getString("Total")+" Cantidad: "+rs.getString("cantidad"));
              aum= Double.parseDouble(rs2.getString("Total"))+Double.parseDouble(rs.getString("cantidad"));
            }           
        } catch (SQLException ex) {
            Logger.getLogger(sqlventas.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("au1: "+aum);
 return aum;       
}
public void eliminarventa(String folio){
    regresarProducto(folio);
    sql="Delete from Ventas where id='"+folio+"'";
    sql2="Delete from detalles_ventas where id_Venta='"+folio+"'";
    try {
        Statement st=cn.createStatement();
        Statement st2=cn.createStatement();
        st2.executeUpdate(sql2);
        st.executeUpdate(sql);
       
    } catch (Exception e) {
        System.out.println(e);
    }
    
}
public void regresarProducto(String folio){
    sql="Select * from detalles_ventas where id_Venta='"+folio+"'";
    try {
        Statement st = cn.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
            
        }
    } catch (Exception e) {
    }
}


}