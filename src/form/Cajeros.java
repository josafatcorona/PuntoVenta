/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Sqlusers;
import modelo.conectar;

/**
 *
 * @author HPJYG
 */
public class Cajeros extends javax.swing.JFrame {

    
    public Cajeros() {
        initComponents();
          this.setLocationRelativeTo(null);
          mostrarusuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jCheckBox2 = new javax.swing.JCheckBox();
        jToggleButton1 = new javax.swing.JToggleButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbusuario = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButtonAgrega = new javax.swing.JButton();
        jButtonRegresar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(700, 600));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, -1, -1));

        jToggleButton1.setText("jToggleButton1");
        jPanel1.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        tbusuario.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tbusuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbusuario);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 0, 530, 200));

        getContentPane().add(jPanel1);
        jPanel1.setBounds(70, 190, 580, 200);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("CAJEROS REGISTRADOS");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(360, 50, 310, 44);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Borrar");
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(80, 420, 70, 21);

        jButtonAgrega.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonAgrega.setText("Agregar cajero");
        jButtonAgrega.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonAgrega.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAgrega);
        jButtonAgrega.setBounds(300, 420, 130, 23);

        jButtonRegresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRegresar.setText("Regresar");
        jButtonRegresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegresar);
        jButtonRegresar.setBounds(550, 420, 90, 21);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 20, 200, 110);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/qq.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(750, 700));
        jLabel1.setMinimumSize(new java.awt.Dimension(750, 700));
        jLabel1.setPreferredSize(new java.awt.Dimension(700, 570));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -10, 760, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public String idcajero="",ncajero="";
int resp;   
    private void jButtonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegresarActionPerformed
  Principal p= new Principal();
  p.jLabel2.setText(ncajero);
  p.cajero=idcajero;
  p.setVisible(true);
  this.dispose();
    }//GEN-LAST:event_jButtonRegresarActionPerformed
/*Mostrarr*/
 void mostrarusuarios(){
   DefaultTableModel modelo;
   String [] titulos= {"USUARIO","NOMBRE","APELLIDOS     ","TIPO"};
   conectar con= new conectar();
   Connection  cn=con.getConnection();
   modelo=new  DefaultTableModel(null,titulos);   
   String datos []= new String[5];
   String sql="SELECT * FROM  usuarios"; 
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            String tipo="";
            while(rs.next())
            {
                if(rs.getString("Admin").equals("1")){
                    tipo="Administrador";
                 }
                else if(rs.getString("Admin").equals("0")){
                   tipo="Vendedor"; 
                }
                    
                datos[0]=rs.getString("User");
                datos[1]=rs.getString("Nombre");
                datos[2]= rs.getString("Ap_P")+" "+rs.getNString("Ap_M");
                datos[3]=tipo;
                modelo.addRow(datos);
            }
            tbusuario.setModel(modelo);
        } catch (SQLException ex) {
            Logger.getLogger(Cajeros.class.getName()).log(Level.SEVERE, null, ex);
        }
  
  
   }
   
    
/**/    
    
    private void jButtonAgregaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregaActionPerformed
     RegistarUsuario newuser=new RegistarUsuario();
     newuser.idcajero=idcajero;
     newuser.ncajero=ncajero;
     newuser.setVisible(true);
     
     this.dispose();
    }//GEN-LAST:event_jButtonAgregaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       int seleccionado;
       seleccionado=tbusuario.getSelectedRow();  
       System.out.println(tbusuario.getSelectedRow());
       Sqlusers sqlmod=new Sqlusers();
       if(!String.valueOf(tbusuario.getValueAt(seleccionado, 0)).equals(idcajero)){
            resp =JOptionPane.showConfirmDialog(null, "¿Esta seguro de eliminar al usuario?"+String.valueOf(tbusuario.getValueAt(seleccionado, 0)), "APV-Alerta", JOptionPane.YES_NO_OPTION);
            if(resp==0){
                sqlmod.eliminausuario(String.valueOf(tbusuario.getValueAt(seleccionado, 0)));
        } 
       }else{
           JOptionPane.showMessageDialog(null, "No se puede eliminar este usuario");
       }
           
         mostrarusuarios();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Cajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cajeros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cajeros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAgrega;
    private javax.swing.JButton jButtonRegresar;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tbusuario;
    // End of variables declaration//GEN-END:variables
}
