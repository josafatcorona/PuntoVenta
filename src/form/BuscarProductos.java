
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
        jLabel12 = new javax.swing.JLabel();
        Bbuscar = new javax.swing.JButton();
        cod2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbuscar = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        BAgregar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        BRegresa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(918, 570));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("BUSCAR PRODUCTO");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(460, 40, 310, 44);

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO.png"))); // NOI18N
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 20, 190, 90);

        Bbuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Bbuscar.setText("Buscar");
        Bbuscar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        Bbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BbuscarActionPerformed(evt);
            }
        });
        getContentPane().add(Bbuscar);
        Bbuscar.setBounds(640, 150, 73, 30);

        cod2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
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
        getContentPane().add(cod2);
        cod2.setBounds(230, 150, 410, 30);

        jLabel2.setText("Teclee el código o nombre del producto para realizar la búsqueda");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(400, 130, 320, 14);

        jPanel1.setLayout(null);

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1);
        jCheckBox1.setBounds(0, 0, 21, 21);

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

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(20, 0, 650, 290);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(40, 210, 670, 290);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/qq.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, -30, 710, 770);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        BAgregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BAgregar.setText("+ Agregar a venta");
        BAgregar.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BAgregarMouseClicked(evt);
            }
        });
        BAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BAgregarActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        BRegresa.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        BRegresa.setText("Regresar");
        BRegresa.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        BRegresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRegresaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(BAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BRegresa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(BAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(125, 125, 125)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addComponent(BRegresa, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2);
        jPanel2.setBounds(710, 0, 220, 540);

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

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void BRegresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRegresaActionPerformed
        //RegistrarCompra reg=new RegistrarCompra();
        //reg.i=-1;
        //reg.cuenta=0;
        //reg.cajero.setText(ncajero);
        //reg.idcajero=idcajero;        
        //reg.setVisible(true);
        this.dispose(); 
             
    }//GEN-LAST:event_BRegresaActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
      EliminarProducto ep= new EliminarProducto();
      Sqlproductos sqlmod=new Sqlproductos();
      String[] datos=new String[5];
      selec= tbuscar.getSelectedRow();
       if(selec<0){     
            JOptionPane.showMessageDialog(rootPane, "No has seleccionado ningun producto para eliminar");
      }else{       
            String codi=String.valueOf(tbuscar.getValueAt(selec, 0));
            datos=sqlmod.busca_productos(codi);        
            ep.codigoproducto.setText(codi);
            ep.nombre.setText(datos[1]);
            ep.precio.setText(datos[3]);
            ep.existencia.setText(datos[4]);
            ep.setVisible(true);
            if(ep.isActive()){
                
            }else{
                cod2.setText("");
                cod2.requestFocus();
                limpiartabla();
                
            }
    }  
          
    }//GEN-LAST:event_jButton4ActionPerformed
   
 RegistrarCompra reg=new  RegistrarCompra();
    public  void limpiartabla(){
        int a;
         DefaultTableModel tb = (DefaultTableModel) tbuscar.getModel();
        a = tbuscar.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
            tb.removeRow(tb.getRowCount()-1);
        } 
    }
    private void BAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BAgregarActionPerformed
        selec=tbuscar.getSelectedRow();
        if(selec<0){
            JOptionPane.showMessageDialog(rootPane, "No has seleccionado nada");
        }else{
            Sqlproductos sqlmod=new Sqlproductos();           
            registrar.cds=String.valueOf(tbuscar.getValueAt(selec, 0));  
            System.out.println(String.valueOf(tbuscar.getValueAt(selec, 0)));
            registrar.AddCompra();
            registrar.repaint();
            System.out.println(selec);
        }
    }//GEN-LAST:event_BAgregarActionPerformed

    private void BAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BAgregarMouseClicked
      
    }//GEN-LAST:event_BAgregarMouseClicked

    private void cod2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cod2MouseClicked
       cod2.setText("");
    }//GEN-LAST:event_cod2MouseClicked

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
    public javax.swing.JButton BAgregar;
    private javax.swing.JButton BRegresa;
    private javax.swing.JButton Bbuscar;
    private javax.swing.JTextField cod2;
    private javax.swing.JButton jButton4;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable tbuscar;
    // End of variables declaration//GEN-END:variables
}
