/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package form;
import Atxy2k.CustomTextField.RestrictedTextField;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
import modelo.Sqlusers;
import modelo.users;

/**
 *
 * @author HPJYG
 */
public class Inicio_sesion extends javax.swing.JFrame {

    /**
     * Creates new form inicio
     */
    public Inicio_sesion() {
        initComponents();
         this.setLocationRelativeTo(null);
          RestrictedTextField res=new RestrictedTextField(jPasswordFieldPass);
          RestrictedTextField res2=new RestrictedTextField(jTextFieldUsuario);
          res2.setLimit(10);
          
          res.setLimit(7);
          
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldUsuario = new javax.swing.JTextField();
        Boton_Iniciar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPasswordFieldPass = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(550, 520));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apv.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 30, 120, 100);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("Usuario: ");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 300, 70, 17);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Contraseña:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(130, 350, 90, 20);

        jTextFieldUsuario.setText("Usuario");
        jTextFieldUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextFieldUsuarioMouseClicked(evt);
            }
        });
        jTextFieldUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldUsuarioActionPerformed(evt);
            }
        });
        getContentPane().add(jTextFieldUsuario);
        jTextFieldUsuario.setBounds(240, 300, 140, 30);

        Boton_Iniciar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Boton_Iniciar.setText("Aceptar");
        Boton_Iniciar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Boton_Iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_IniciarActionPerformed(evt);
            }
        });
        getContentPane().add(Boton_Iniciar);
        Boton_Iniciar.setBounds(110, 450, 70, 20);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Salir");
        jButton2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(430, 450, 60, 20);

        jPasswordFieldPass.setText("hhhuhuui");
        jPasswordFieldPass.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPasswordFieldPassMouseClicked(evt);
            }
        });
        getContentPane().add(jPasswordFieldPass);
        jPasswordFieldPass.setBounds(240, 350, 140, 30);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fon.jpg"))); // NOI18N
        jLabel1.setPreferredSize(new java.awt.Dimension(850, 740));
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 260, 594, 274);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setBackground(new java.awt.Color(204, 255, 204));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("Bienvenido");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/usuario.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(223, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(98, 98, 98))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(222, 222, 222))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(42, Short.MAX_VALUE)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 590, 270);

        pack();
    }// </editor-fold>//GEN-END:initComponents
public String cajero="";
String user,pass;
    private void jTextFieldUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioActionPerformed
        jTextFieldUsuario.setText("");
    }//GEN-LAST:event_jTextFieldUsuarioActionPerformed

    private void Boton_IniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_IniciarActionPerformed
      Sqlusers usuario =new Sqlusers();
      users usuarios=new users();      
      user=jTextFieldUsuario.getText();
      pass=jPasswordFieldPass.getText();
      usuarios.setUser(user);
      usuarios.setPass(pass);
     if (user.equals("")){
        JOptionPane.showMessageDialog(null,"Introduce tus datos");
      }else{ 
        if( usuario.acceder(usuarios)){
            this.dispose();
          }     
    }
    }//GEN-LAST:event_Boton_IniciarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextFieldUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextFieldUsuarioMouseClicked
        jTextFieldUsuario.setText("");
    }//GEN-LAST:event_jTextFieldUsuarioMouseClicked

    private void jPasswordFieldPassMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPasswordFieldPassMouseClicked
        jPasswordFieldPass.setText("");
    }//GEN-LAST:event_jPasswordFieldPassMouseClicked
/**/
   void datosbd(){
     String[] datosbd=new String[4];
       datosbd[0]=JOptionPane.showInputDialog(rootPane, "Usuario");
       datosbd[1]=JOptionPane.showInputDialog(rootPane, "Contraseña");
       datosbd[2]=JOptionPane.showInputDialog(rootPane, "URL");
       FileWriter fichero=null;
        int resp= JOptionPane.showConfirmDialog(rootPane, "Desea guardar esos datos");
        if(resp==0){
         try
        {
           fichero = new FileWriter("bd.txt");
           PrintWriter pw = new PrintWriter(fichero);
                pw.println( datosbd[0]);
                pw.println( datosbd[1]);
                pw.println( datosbd[2]);

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
        }
} 
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
            java.util.logging.Logger.getLogger(Inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Inicio_sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Iniciar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JPasswordField jPasswordFieldPass;
    private javax.swing.JTextField jTextFieldUsuario;
    // End of variables declaration//GEN-END:variables
}
