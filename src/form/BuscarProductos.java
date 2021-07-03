
package form;

import form.EliminarProducto;
import form.RegistrarCompra;
import static java.lang.System.exit;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Sqlproductos;
import modelo.productos;


public class BuscarProductos extends  JDialog {
//variables
    public String ncajero,idcajero;
    public RegistrarCompra registrar;
    int selec;
    public BuscarProductos(RegistrarCompra compra, boolean modal) {
        super(compra,modal);
        initComponents();        
        this.setLocationRelativeTo(null);
    }

    private BuscarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        Bbuscar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        BRegresa = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbuscar = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        cod2 = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(918, 570));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Montserrat", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("BUSCAR PRODUCTO");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(650, 40, 310, 44);

        Bbuscar.setBackground(new java.awt.Color(255, 255, 255));
        Bbuscar.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Bbuscar.setText("Buscar");
        Bbuscar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 249, 33)));
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Bbuscar);
        Bbuscar.setBounds(753, 150, 150, 30);

        jLabel2.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel2.setText("Teclee el código o nombre del producto para realizar la búsqueda");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(500, 130, 410, 15);

        BRegresa.setBackground(new java.awt.Color(255, 255, 255));
        BRegresa.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        BRegresa.setText("Cerrar");
        BRegresa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 249, 33)));
        BRegresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegresaActionPerformed(evt);
            }
        });
        getContentPane().add(BRegresa);
        BRegresa.setBounds(730, 490, 169, 40);

        tbuscar = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbuscar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Descripción", "Precio", "Inventario"
            }
        ));
        tbuscar.getTableHeader().setResizingAllowed(false);
        tbuscar.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(tbuscar);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(250, 190, 650, 290);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 2, new java.awt.Color(0, 0, 0)));

        cod2.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        cod2.setText("Código del producto...");
        cod2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cod2MouseClicked(evt);
            }
        });
        cod2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cod2ActionPerformed(evt);
            }
        });
        cod2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cod2KeyPressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(cod2, javax.swing.GroupLayout.PREFERRED_SIZE, 410, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(cod2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(358, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3);
        jPanel3.setBounds(210, 0, 710, 540);

        jPanel1.setBackground(new java.awt.Color(86, 249, 33));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apv.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jLabel1)
                .addContainerGap(67, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addComponent(jLabel1)
                .addContainerGap(237, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 210, 540);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cod2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cod2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod2ActionPerformed
RegistrarCompra rc2=new RegistrarCompra();
    private void BbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BbuscarActionPerformed
      Sqlproductos sqlmod=new Sqlproductos();
      productos mod =new productos();
      mod.setId(cod2.getText());
      mod.setNombre(cod2.getText());
      String[] info= new String[5];     
      info=sqlmod.buscar(mod);
      if(info[0].equals("NO")){
      }else{
            DefaultTableModel modelo2= new DefaultTableModel();
            modelo2=(DefaultTableModel) tbuscar.getModel();
            modelo2.addRow(info);
            cod2.setText("");
            cod2.requestFocus();
            //rc2.codigo=cod2.getText();
      }
    }//GEN-LAST:event_BbuscarActionPerformed
   
 RegistrarCompra reg=new  RegistrarCompra();
    public  void limpiartabla(){
        int a;
         DefaultTableModel tb = (DefaultTableModel) tbuscar.getModel();
        a = tbuscar.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
            tb.removeRow(tb.getRowCount()-1);
        } 
    }
    private void cod2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cod2MouseClicked
       cod2.setText("");
    }//GEN-LAST:event_cod2MouseClicked

    private void cod2KeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod2KeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cod2KeyPressed

    private void BRegresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegresaActionPerformed
        //RegistrarCompra reg=new RegistrarCompra();
        //reg.i=-1;
        //reg.cuenta=0;
        //reg.cajero.setText(ncajero);
        //reg.idcajero=idcajero;
        //reg.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_BRegresaActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BRegresa;
    private javax.swing.JButton Bbuscar;
    private javax.swing.JTextField cod2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tbuscar;
    // End of variables declaration//GEN-END:variables
}
