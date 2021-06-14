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

        jLabel3 = new javax.swing.JLabel();
        Lista_Producto = new javax.swing.JButton();
        Producto_Nuevo = new javax.swing.JButton();
        Regresar = new javax.swing.JButton();
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

        Lista_Producto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lista_Producto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/box (2).png"))); // NOI18N
        Lista_Producto.setText("Lista de Productos");
        Lista_Producto.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Lista_Producto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Lista_ProductoActionPerformed(evt);
            }
        });
        getContentPane().add(Lista_Producto);
        Lista_Producto.setBounds(120, 160, 400, 70);

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
        Producto_Nuevo.setBounds(120, 290, 400, 70);

        Regresar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Regresar.setText("Regresar");
        Regresar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        Regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegresarActionPerformed(evt);
            }
        });
        getContentPane().add(Regresar);
        Regresar.setBounds(530, 480, 70, 30);

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    public static javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
     // String n,u;
 
}

