package form;

import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {
     
    public Principal() {
        initComponents(); 
        this.setLocationRelativeTo(null);
       
       // Date dan=new Date();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jButtonCajeros = new javax.swing.JButton();
        Ventas = new javax.swing.JButton();
        Producto_Nuevo = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(700, 550));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO.png"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(30, 30, 190, 100);

        jButtonCajeros.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonCajeros.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/user_group (1).png"))); // NOI18N
        jButtonCajeros.setText("Ver Usuarios");
        jButtonCajeros.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonCajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCajerosActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCajeros);
        jButtonCajeros.setBounds(380, 300, 220, 70);

        Ventas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Ventas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buy.png"))); // NOI18N
        Ventas.setText("Realizar Ventas");
        Ventas.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Ventas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VentasActionPerformed(evt);
            }
        });
        getContentPane().add(Ventas);
        Ventas.setBounds(80, 160, 220, 70);

        Producto_Nuevo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Producto_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/box (2).png"))); // NOI18N
        Producto_Nuevo.setText("Registrar Producto");
        Producto_Nuevo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Producto_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto_NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(Producto_Nuevo);
        Producto_Nuevo.setBounds(380, 160, 220, 70);

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ticket.png"))); // NOI18N
        jButton4.setText("Personalizar Ticket");
        jButton4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(80, 300, 220, 70);

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton5.setText("Salir");
        jButton5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(530, 480, 70, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("SELECCIONE UNA OPCIÓN ");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(290, 50, 340, 44);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 10, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(510, 0, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-110, -20, 870, 580);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public String cajero="";
    private void jButtonCajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCajerosActionPerformed
        if(cajero.equals("dcc1996")){
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
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Inicio_sesion i=new Inicio_sesion();
        i.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void Producto_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto_NuevoActionPerformed
        RegistrarProductos nuevop=new RegistrarProductos();
        nuevop.setVisible(true);
        nuevop.idcajero=cajero;
        nuevop.ncajero=jLabel2.getText();
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
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButtonCajeros;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
     // String n,u;
 
}

