/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;

import form.BuscarProductos;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import modelo.Sqlproductos;
import modelo.productos;

public class ActualizarDatosProductos extends JDialog {
    //variables
   public String idcajero,ncajero,producto,codigo;
   int resp;
    
    public ActualizarDatosProductos(ListaProductos listaProductos, boolean modal) {
        super(listaProductos, modal);        
        initComponents();       
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        entrada = new javax.swing.JTextField();
        nombre = new javax.swing.JTextField();
        pcompra = new javax.swing.JTextField();
        pventa = new javax.swing.JTextField();
        codigoproducto = new java.awt.TextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("MODIFICAR PRODUCTO");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(340, 50, 310, 44);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("*Nombre");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 210, 55, 10);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("*Precio compra");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(150, 240, 94, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("*Precio venta");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(150, 280, 84, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("*Entrada (producto nuevo)");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(150, 310, 169, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("Codigo producto: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(150, 140, 120, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("Guardar");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(90, 390, 130, 40);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(460, 390, 130, 40);

        entrada.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(entrada);
        entrada.setBounds(360, 310, 160, 30);

        nombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(nombre);
        nombre.setBounds(360, 190, 160, 30);

        pcompra.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(pcompra);
        pcompra.setBounds(360, 230, 160, 30);

        pventa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        getContentPane().add(pventa);
        pventa.setBounds(360, 270, 160, 30);

        codigoproducto.setEditable(false);
        codigoproducto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        codigoproducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoproductoActionPerformed(evt);
            }
        });
        getContentPane().add(codigoproducto);
        codigoproducto.setBounds(270, 140, 160, 30);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO.png"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(30, 30, 180, 90);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/qq.jpg"))); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(710, 520));
        jLabel1.setMinimumSize(new java.awt.Dimension(710, 520));
        jLabel1.setPreferredSize(new java.awt.Dimension(710, 520));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -90, 690, 760);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        productos mod=new productos();        
        Sqlproductos sqlmod=new Sqlproductos();
        if(codigoproducto.equals("") && nombre.equals("") && pcompra.equals("") && pventa.equals("") && entrada.equals("")){
            JOptionPane.showMessageDialog(null, "Todos los campos son obligatorios");
        }else{
            mod.setId(codigoproducto.getText());
            mod.setEntrada(Integer.parseInt(entrada.getText()));
            mod.setNombre(nombre.getText());
            mod.setPventa(Double.parseDouble(pventa.getText()));
            mod.setP_compra(Double.parseDouble(pcompra.getText()));
            sqlmod.actualizadatos(mod, codigo);            
            this.dispose();
            
        }             
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        resp=JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Alerta", JOptionPane.YES_NO_OPTION);
        if(resp==0){            
            this.dispose(); 
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void codigoproductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoproductoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoproductoActionPerformed

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
            java.util.logging.Logger.getLogger(ActualizarDatosProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ActualizarDatosProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ActualizarDatosProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ActualizarDatosProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new ActualizarDatosProductos(null, false).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public java.awt.TextField codigoproducto;
    public javax.swing.JTextField entrada;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public javax.swing.JTextField nombre;
    public javax.swing.JTextField pcompra;
    public javax.swing.JTextField pventa;
    // End of variables declaration//GEN-END:variables
}
