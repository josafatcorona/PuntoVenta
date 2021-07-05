package form;

import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import modelo.Sqlusers;
import modelo.conectar;
import modelo.users;

public class Principal extends javax.swing.JFrame {
     
    public Principal() {
        initComponents(); 
        this.setLocationRelativeTo(null);
       
       // Date dan=new Date();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jButtonCajeros = new javax.swing.JButton();
        Producto_Nuevo = new javax.swing.JButton();
        Ventas = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Principal");
        setMinimumSize(new java.awt.Dimension(875, 550));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 0, 2, new java.awt.Color(0, 0, 0)));

        jButtonCajeros.setBackground(new java.awt.Color(255, 255, 255));
        jButtonCajeros.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jButtonCajeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_group (1).png"))); // NOI18N
        jButtonCajeros.setText("Usuarios");
        jButtonCajeros.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 249, 33)));
        jButtonCajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCajerosActionPerformed(evt);
            }
        });

        Producto_Nuevo.setBackground(new java.awt.Color(255, 255, 255));
        Producto_Nuevo.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Producto_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/box (2).png"))); // NOI18N
        Producto_Nuevo.setText("Productos");
        Producto_Nuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 249, 33)));
        Producto_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto_NuevoActionPerformed(evt);
            }
        });

        Ventas.setBackground(new java.awt.Color(255, 255, 255));
        Ventas.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buy.png"))); // NOI18N
        Ventas.setText("Realizar Ventas");
        Ventas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 249, 33)));
        Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 255, 255));
        jButton4.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ticket.png"))); // NOI18N
        jButton4.setText("Personalizar Ticket");
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 249, 33)));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        logout.setBackground(new java.awt.Color(255, 255, 255));
        logout.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        logout.setText("Cerrar Sesion");
        logout.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(86, 249, 33)));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(153, 255, 153));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apv.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel3)
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(213, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("SELECCIONE UNA OPCIÓN ");

        jLabel2.setFont(new java.awt.Font("Montserrat", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(86, 249, 33)));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 140, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Ventas, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE))
                            .addGap(46, 46, 46)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButtonCajeros, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Producto_Nuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                        .addComponent(logout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(242, 242, 242)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Producto_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Ventas, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonCajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(93, 93, 93)
                .addComponent(logout, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(-40, 0, 910, 570);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public String cajero="";
    private void jButtonCajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCajerosActionPerformed
        Sqlusers users = new Sqlusers();
        users usr = new users();
        usr.setUser(cajero);
        
        if(users.esAdmin(usr)){
            Cajeros cajeros=new Cajeros();
            cajeros.idcajero=cajero;
            cajeros.ncajero=jLabel2.getText();
            cajeros.setVisible(true);
            this.dispose();
        }else{
            JOptionPane.showMessageDialog(rootPane, "Esta acción solo puede realizarce por el administrador");
        }
    }//GEN-LAST:event_jButtonCajerosActionPerformed

    private void VentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VentasActionPerformed
       
            RegistrarCompra vender=new RegistrarCompra();  
            
            vender.cajero.setText(jLabel2.getText());       
            //vender.i=-1;        
            vender.cierra=false;
            vender.idcajero=cajero;  
            vender.cuenta=0;
            vender.articulos=0;
            vender.setVisible(true);
            this.dispose();        
    }//GEN-LAST:event_VentasActionPerformed
    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        int logoutR =  JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea cerrar sesion?", "Alerta", JOptionPane.YES_NO_OPTION);
        if(logoutR == 0){
            conectar con = new conectar();
            con.cierraConexion();
            Inicio_sesion i=new Inicio_sesion();
            i.setVisible(true);
            this.dispose();  
        }
        
    }//GEN-LAST:event_logoutActionPerformed

    private void Producto_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto_NuevoActionPerformed
        Productos productos=new Productos();
        productos.setVisible(true);
        productos.idcajero=cajero;
        productos.ncajero=jLabel2.getText();
        Productos.jLabel2.setText(jLabel2.getText());
        this.dispose();
    }//GEN-LAST:event_Producto_NuevoActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      PersonalizarTicket pti=new PersonalizarTicket();
      pti.idcajero=cajero;//manda usuario
      pti.ncajero=jLabel2.getText();//manda nombre
      pti.setVisible(true);
      this.dispose();     
    }//GEN-LAST:event_jButton4ActionPerformed
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Principal().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Producto_Nuevo;
    public javax.swing.JButton Ventas;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButtonCajeros;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton logout;
    // End of variables declaration//GEN-END:variables
     // String n,u;
 
}

