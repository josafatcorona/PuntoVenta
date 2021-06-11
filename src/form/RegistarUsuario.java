
package form;

import Atxy2k.CustomTextField.RestrictedTextField;
import javax.swing.JOptionPane;
import modelo.Sqlusers;
import modelo.users;


public class RegistarUsuario extends javax.swing.JFrame {

public static String ncajero, idcajero;
    public RegistarUsuario() {
        initComponents();
        this.setLocationRelativeTo(null);
        RestrictedTextField res=new RestrictedTextField(nombre);
        RestrictedTextField res2=new RestrictedTextField(a_materno);
        RestrictedTextField paterno=new RestrictedTextField(a_paterno);
        RestrictedTextField cnaci=new RestrictedTextField(naci);
        RestrictedTextField usuario=new RestrictedTextField(user);
        RestrictedTextField cont=new RestrictedTextField(pass);
        res.setLimit(35);
        res.setOnlyText(true);
        res2.setLimit(35);
        res2.setOnlyText(true);
        paterno.setLimit(35);
        paterno.setOnlyText(true);
        cnaci.setLimit(4);
        cnaci.setOnlyNums(true);
        usuario.setLimit(7);
        cont.setLimit(10);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButtonRegistrar = new javax.swing.JButton();
        jButtonCancela = new javax.swing.JButton();
        nombre = new javax.swing.JTextField();
        a_paterno = new javax.swing.JTextField();
        naci = new javax.swing.JTextField();
        a_materno = new javax.swing.JTextField();
        user = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 500));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Cajero nuevo:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(350, 110, 90, 15);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("* Nombre:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(200, 160, 70, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("*Apellido paterno:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(200, 200, 120, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("*Apellido materno:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(200, 240, 120, 15);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("*Año de nacimiento:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(200, 280, 130, 15);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("*Usuario:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(200, 320, 60, 15);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setText("*Contraseña:");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(200, 350, 90, 20);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("REGISTRAR USUARIO");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(370, 30, 310, 44);

        jButtonRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonRegistrar.setText("Registrar");
        jButtonRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRegistrar);
        jButtonRegistrar.setBounds(170, 420, 90, 20);

        jButtonCancela.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCancela.setText("Cancelar");
        jButtonCancela.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCancela.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCancelaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCancela);
        jButtonCancela.setBounds(480, 410, 80, 21);

        nombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        nombre.setText("David");
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        getContentPane().add(nombre);
        nombre.setBounds(350, 150, 180, 30);
        getContentPane().add(a_paterno);
        a_paterno.setBounds(350, 190, 180, 30);
        getContentPane().add(naci);
        naci.setBounds(350, 270, 180, 30);
        getContentPane().add(a_materno);
        a_materno.setBounds(350, 230, 180, 30);
        getContentPane().add(user);
        user.setBounds(350, 310, 180, 30);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 30, 190, 90);
        getContentPane().add(pass);
        pass.setBounds(350, 350, 180, 30);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 710, 480);

        pack();
    }// </editor-fold>//GEN-END:initComponents
     String nom="",paterno="",materno="",nac="",usuario="",contrasena="";
     int resp;
    private void jButtonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarActionPerformed
       Sqlusers modSql =new Sqlusers();
       users mod= new users();
       nom= nombre.getText();
       paterno=a_paterno.getText();
       materno=a_materno.getText();
       nac=naci.getText();
       usuario=user.getText();
       contrasena=pass.getText();  
       if("".equals(nom)||  "".equals(paterno)|| "".equals(materno)|| "".equals(nac)||"".equals(usuario) || "".equals(contrasena)){
           JOptionPane.showMessageDialog(rootPane, "Todos los datos son obligatorios");
       }
        else
       {
            if((Integer.parseInt(naci.getText())>1960) && (Integer.parseInt(naci.getText())<2001)){
                nombre.setText("");
                a_paterno.setText("");
                a_materno.setText("");
                naci.setText("");
                user.setText("");
                pass.setText("");
                mod.setUser(usuario);
                mod.setA_nac(nac);
                mod.setAp_m(materno);
                mod.setAp_p(paterno);
                mod.setPass(contrasena);
                mod.setNombre(nom);
                mod.setAdmin(0);
                if(modSql.registrar(mod)){
                    JOptionPane.showMessageDialog(null,"Registro guardado");
                }else{
                     JOptionPane.showMessageDialog(null,"El registro no se pudo guardar");
                }
       }else{
                JOptionPane.showMessageDialog(rootPane, "La fehca de nacimiento debe ser entre 1960 y 2000");
                naci.setText("");
                naci.requestFocus();
            }
       }
    }//GEN-LAST:event_jButtonRegistrarActionPerformed

    private void jButtonCancelaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCancelaActionPerformed
        resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Alerta", JOptionPane.YES_NO_OPTION);
        if(resp==0){
            Cajeros cajeros=new Cajeros();  
            cajeros.idcajero=idcajero;
            cajeros.ncajero=ncajero;
            cajeros.setVisible(true);
            this.dispose();
        
       }

    }//GEN-LAST:event_jButtonCancelaActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
       nombre.setText("");
    }//GEN-LAST:event_nombreActionPerformed

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
            java.util.logging.Logger.getLogger(RegistarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField a_materno;
    private javax.swing.JTextField a_paterno;
    private javax.swing.JButton jButtonCancela;
    private javax.swing.JButton jButtonRegistrar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField naci;
    private javax.swing.JTextField nombre;
    private javax.swing.JPasswordField pass;
    private javax.swing.JTextField user;
    // End of variables declaration//GEN-END:variables
}
