package form;

import static form.RegistarUsuario.idcajero;
import static form.RegistarUsuario.ncajero;
import javax.swing.JOptionPane;

public class Productos extends javax.swing.JFrame {
     
    public Productos() {
        initComponents(); 
        this.setLocationRelativeTo(null);
       
       // Date dan=new Date();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        Lista_Producto = new javax.swing.JButton();
        Producto_Nuevo = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 550));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 51));
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(jLabel2);
        jLabel2.setBounds(690, 10, 130, 30);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        Lista_Producto.setBackground(new java.awt.Color(255, 255, 255));
        Lista_Producto.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Lista_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/box (2).png"))); // NOI18N
        Lista_Producto.setText("Lista de Productos");
        Lista_Producto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 249, 33)));
        Lista_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_ProductoActionPerformed(evt);
            }
        });

        Producto_Nuevo.setBackground(new java.awt.Color(255, 255, 255));
        Producto_Nuevo.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Producto_Nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/box (2).png"))); // NOI18N
        Producto_Nuevo.setText("Registrar Producto");
        Producto_Nuevo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 249, 33)));
        Producto_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Producto_NuevoActionPerformed(evt);
            }
        });

        Regresar.setBackground(new java.awt.Color(255, 255, 255));
        Regresar.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 249, 33)));
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("SELECCIONA UNA OPCIÓN ");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Producto_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Lista_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(131, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(Lista_Producto, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(Producto_Nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addComponent(Regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(200, 0, 650, 530);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, -10, 200, 550);

        pack();
    }// </editor-fold>//GEN-END:initComponents
 public String ncajero,idcajero;
    private void RegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegresarActionPerformed
        int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Alerta", JOptionPane.YES_NO_OPTION);
        if(resp==0){
           Principal p=new Principal();
           p.cajero=idcajero;
           p.jLabel2.setText(ncajero);
           p.setVisible(true);
           this.dispose();
        }
    }//GEN-LAST:event_RegresarActionPerformed

    private void Producto_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Producto_NuevoActionPerformed
        RegistrarProductos nuevop=new RegistrarProductos();
        nuevop.setVisible(true);
        nuevop.idcajero=idcajero;
        nuevop.ncajero=ncajero;        
        this.dispose();
    }//GEN-LAST:event_Producto_NuevoActionPerformed

    private void Lista_ProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Lista_ProductoActionPerformed
        ListaProductos lista=new ListaProductos();
        lista.setVisible(true);
        lista.idcajero=idcajero;
        lista.ncajero=ncajero;        
        this.dispose();
            
    }//GEN-LAST:event_Lista_ProductoActionPerformed
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(() -> {
            new Productos().setVisible(true);
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Lista_Producto;
    private javax.swing.JButton Producto_Nuevo;
    private javax.swing.JButton Regresar;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
     // String n,u;
 
}

