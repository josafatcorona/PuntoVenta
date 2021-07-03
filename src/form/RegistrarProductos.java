
package form;

import javax.swing.JOptionPane;
import modelo.Sqlproductos;
import modelo.productos;
import Atxy2k.CustomTextField.RestrictedTextField;
import java.awt.FileDialog;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.HashSet;
import java.util.Set;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import jbarcodebean.JBarcodeBean;
import modelo.product_code;
import net.sourceforge.jbarcodebean.model.Interleaved25;


public class RegistrarProductos extends javax.swing.JFrame {

   
    public RegistrarProductos() {
        initComponents();
        this.setLocationRelativeTo(null);
        //mensajes();
        //limitando field
       /* RestrictedTextField codigo= new RestrictedTextField(cod);
        codigo.setLimit(12);
        codigo.setOnlyAlphaNumeric(true);*/ 
        //Nombre
       
     g=false;
        RestrictedTextField nombre= new RestrictedTextField(name);
        nombre.setLimit(20); nombre.setOnlyText(true);
        //Descripción
        RestrictedTextField descrip= new RestrictedTextField(desc);
        descrip.setLimit(80); descrip.setOnlyAlphaNumeric(true);
        //Compra
        RestrictedTextField compra= new RestrictedTextField(pcompra);
        compra.setLimit(4); compra.setOnlyNums(true);
        //Marca
        RestrictedTextField marc= new RestrictedTextField(marca);
        marc.setLimit(20); marc.setOnlyText(true);
        //ganancia
        RestrictedTextField ganan= new RestrictedTextField(precioVenta);
        ganan.setLimit(4);
        ganan.setOnlyNums(true);
        //cantidad
        RestrictedTextField cantidad= new RestrictedTextField(cant);
        cantidad.setLimit(4);// cantidad.setOnlyAlphaNumeric(true);
        //entrada
        RestrictedTextField entrada= new RestrictedTextField(ent);
        entrada.setLimit(3);
        entrada.setOnlyNums(true);
        /*cod.requestFocus();
       */
        //cod.requestFocus();
       
    }
 JBarcodeBean barcode= new  JBarcodeBean(); 
 public static BufferedImage imagen=null;
  public boolean g=false;
  public String ncajero,idcajero;
  int resp;
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        desc = new javax.swing.JTextField();
        pcompra = new javax.swing.JTextField();
        marca = new javax.swing.JTextField();
        precioVenta = new javax.swing.JTextField();
        venta = new javax.swing.JComboBox();
        cant = new javax.swing.JTextField();
        ent = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Generar = new javax.swing.JButton();
        cod = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        labelcode = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 680));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel1.setText("*Código producto");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, -1, -1));

        jLabel3.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel3.setText("*Nombre");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, 70, -1));

        name.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        name.setText("Nombre producto");
        name.setToolTipText("oijoijo");
        name.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        name.setMinimumSize(new java.awt.Dimension(10, 21));
        name.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nameMouseClicked(evt);
            }
        });
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 230, 30));

        desc.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        desc.setText("Ingrediente activo");
        desc.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        desc.setMinimumSize(new java.awt.Dimension(10, 21));
        desc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                descMouseClicked(evt);
            }
        });
        jPanel1.add(desc, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 230, 30));

        pcompra.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        pcompra.setText("Precio de compra");
        pcompra.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        pcompra.setMinimumSize(new java.awt.Dimension(10, 21));
        pcompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pcompraMouseClicked(evt);
            }
        });
        jPanel1.add(pcompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 160, 230, 30));

        marca.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        marca.setText("Marca producto");
        marca.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        marca.setMinimumSize(new java.awt.Dimension(10, 21));
        marca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                marcaMouseClicked(evt);
            }
        });
        jPanel1.add(marca, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 210, 230, 30));

        precioVenta.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        precioVenta.setText("Precio venta");
        precioVenta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        precioVenta.setMinimumSize(new java.awt.Dimension(10, 21));
        precioVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                precioVentaMouseClicked(evt);
            }
        });
        precioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioVentaActionPerformed(evt);
            }
        });
        jPanel1.add(precioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 230, 30));

        venta.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        venta.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Kilogramo", "Litro", "Pieza", "Gramos", "Mililitros", " " }));
        venta.setMinimumSize(new java.awt.Dimension(71, 18));
        venta.setPreferredSize(new java.awt.Dimension(71, 18));
        venta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ventaActionPerformed(evt);
            }
        });
        jPanel1.add(venta, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 310, 230, 30));

        cant.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        cant.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        cant.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantMouseClicked(evt);
            }
        });
        cant.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cantKeyTyped(evt);
            }
        });
        jPanel1.add(cant, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, 230, 30));

        ent.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        ent.setText("Cantidad de producto nuevo");
        ent.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        ent.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entMouseClicked(evt);
            }
        });
        jPanel1.add(ent, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 410, 230, 30));

        jLabel9.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel9.setText("*Total(Producto)");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 420, 110, 20));

        jLabel8.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel8.setText("*Se vende");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, 70, -1));

        jLabel7.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel7.setText("*Precio venta");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 100, -1));

        jLabel6.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel6.setText("*Marca");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 60, -1));

        jLabel5.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel5.setText("*Precio compra");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 100, 20));

        jLabel4.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel4.setText("*Descripción");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 90, 20));

        Generar.setBackground(new java.awt.Color(255, 255, 255));
        Generar.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        Generar.setText("GenerarC");
        Generar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 249, 33)));
        Generar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenerarActionPerformed(evt);
            }
        });
        jPanel1.add(Generar, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 150, 30));

        cod.setEditable(false);
        cod.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        cod.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 1, new java.awt.Color(0, 0, 0)));
        cod.setMinimumSize(new java.awt.Dimension(10, 30));
        jPanel1.add(cod, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, 230, 30));

        jLabel13.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        jLabel13.setText("*Cantidad/envase ");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 120, -1));
        jPanel1.add(labelcode, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 460, 250, 60));

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 600, 530));

        jLabel2.setText("(Por empaque)");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 360, -1, -1));

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Cancelar");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 249, 33)));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 620, 170, 40));

        guardar.setBackground(new java.awt.Color(255, 255, 255));
        guardar.setFont(new java.awt.Font("Montserrat", 1, 12)); // NOI18N
        guardar.setText("Guardar");
        guardar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(86, 249, 33)));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });
        jPanel2.add(guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 620, 170, 40));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("REGISTRAR PRODUCTO");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 10, 310, 44));

        getContentPane().add(jPanel2);
        jPanel2.setBounds(180, 0, 720, 690);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apv.png"))); // NOI18N
        getContentPane().add(jLabel11);
        jLabel11.setBounds(20, 250, 100, 130);

        jPanel3.setBackground(new java.awt.Color(86, 249, 33));
        getContentPane().add(jPanel3);
        jPanel3.setBounds(0, 0, 180, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void mensajes(){
        cod.setText("123456");
        name.setText("Nombre roducto");
        desc.setText("Ingrediente activo");
        pcompra.setText("Precio de compra");
        marca.setText("Marca producto");
        precioVenta.setText("$ Ganancia producto"); 
        cant.setText("Cantidad por empaque o envase(5lt)"); 
        ent.setText("Cantidad de producto nuevo");
    }
    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
         productos mod=new productos();
         product_code code =  new product_code();
         int punto=0;
         Sqlproductos sqlmod=new Sqlproductos();
         for(int s=0;s<=cant.getText().length()-1;s++){
            char c=cant.getText().charAt(s);
            if (c=='.'){
                punto+=1;
            }
         }
       if(cod.getText().equals("123456") || name.getText().equals("Nombre roducto") || desc.getText().equals("Ingrediente activo") || pcompra.getText().equals("Precio de compra") || marca.getText().equals("Marca producto") ||precioVenta.getText().equals("$ Ganancia producto") 
          || cant.getText().equals("Cantidad por empaque o envase(5lt)") || ent.getText().equals("Cantidad de producto nuevo") ){
           JOptionPane.showMessageDialog(null, "Completa el formulario");
       }else{
            if(String.valueOf(cod.getText()).isEmpty() || String.valueOf(name.getText()).isEmpty() || String.valueOf(desc.getText()).isEmpty() || String.valueOf(pcompra.getText()).isEmpty() || String.valueOf(marca.getText()).isEmpty() || String.valueOf(precioVenta.getText()).isEmpty() ||  String.valueOf(ent.getText()).isEmpty() ){
            JOptionPane.showConfirmDialog(rootPane, "Todos los campos son obligatorios");
         }else if(punto>1){
             JOptionPane.showMessageDialog(rootPane, "Cantidad por empaque no válida");
             cant.setText("");
             cant.requestFocus();
        } else{
            mod.setId(cod.getText());
            mod.setNombre(name.getText());
            mod.setDescripcion(desc.getText());
            mod.setP_compra(Double.parseDouble(pcompra.getText()));
            mod.setPventa(Double.parseDouble(precioVenta.getText()));
            mod.setMarca(marca.getText());            
            mod.setGanancia((int) (mod.getPventa()-mod.getPventa()));        
            if("Pieza".equals((String)venta.getSelectedItem())){
               mod.setVenta("PZ");
            }else if("Litro".equals((String)venta.getSelectedItem())){
               mod.setVenta("LT");
            }else if("Kilogramo".equals((String)venta.getSelectedItem())){
               mod.setVenta("KG");
            }else if ("Gramos".equals((String)venta.getSelectedItem())){
                mod.setVenta("MG");
            }else if ("Mililitros".equals((String)venta.getSelectedItem())){
                mod.setVenta("ML");
            }
            if(String.valueOf(cant.getText()).isEmpty()){
                mod.setCantidad(0);
            }else{
                mod.setCantidad(Double.parseDouble(cant.getText()));
            }
            mod.setEntrada(Integer.parseInt(ent.getText()));
            sqlmod.AgregarProducto(mod);
            
             if(g){
                try{
                    FileDialog ventana= new FileDialog(RegistrarProductos.this,"Guardar imagen", FileDialog.SAVE);
                    ventana.show();
                    File cb= new File(ventana.getDirectory()+ventana.getFile()+".png");
                    ImageIO.write(imagen, "png", cb);
                    code.setId(mod.getId());
                    code.setNombre(mod.getNombre()); 
                    code.setImagen(cb.getAbsolutePath());
                    sqlmod.AgregarCodigo(code);
                    
                }catch(Exception e){
                  System.out.println(e);  
                }
            }
            //Limpiar Jtxfiel
            labelcode.setText("");
            cod.setText("");
            name.setText("");
            desc.setText("");
            pcompra.setText("");
            precioVenta.setText("");
            marca.setText("");
            cant.setText("");
            ent.setText("");
            
           
         }
       } 
       
    }//GEN-LAST:event_guardarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Alerta", JOptionPane.YES_NO_OPTION);
        if(resp==0){
           Principal p=new Principal();
           p.cajero=idcajero;
           p.jLabel2.setText(ncajero);
           p.setVisible(true);
           this.dispose();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void ventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ventaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ventaActionPerformed

    private void precioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioVentaActionPerformed

    private void nameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nameMouseClicked
        name.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_nameMouseClicked

    private void descMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_descMouseClicked
        desc.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_descMouseClicked

    private void pcompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pcompraMouseClicked
        pcompra.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_pcompraMouseClicked

    private void marcaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_marcaMouseClicked
        marca.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_marcaMouseClicked

    private void precioVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioVentaMouseClicked
        precioVenta.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_precioVentaMouseClicked

    private void entMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entMouseClicked
        ent.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_entMouseClicked

    private void GenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GenerarActionPerformed
         String n=generarcodigo();
         cod.setText(n);   
         barcode.setCodeType(new Interleaved25());
         barcode.setCode(n);
         barcode.setCheckDigit(true);
         imagen= barcode.draw(new BufferedImage(260,90,BufferedImage.TYPE_INT_RGB));
         ImageIcon barras=new ImageIcon(imagen);
         this.labelcode.setIcon(barras);
         g=true;
         
    }//GEN-LAST:event_GenerarActionPerformed

    private void cantKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cantKeyTyped
        char caracter=evt.getKeyChar();
        /*  if(c<'0' || c>'9' || c!='.') evt.consume();*/
        if(((caracter < '0') || (caracter > '9')) && (caracter != KeyEvent.VK_BACK_SPACE)
            && (caracter !='.')){
            /* lo que deseo colocar aqui es si ya se pulso el caracter (.) el mismo no se pueda repetir*/
            evt.consume();}

    }//GEN-LAST:event_cantKeyTyped

    private void cantMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantMouseClicked
        cant.setText("");        // TODO add your handling code here:
    }//GEN-LAST:event_cantMouseClicked
       

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
            java.util.logging.Logger.getLogger(RegistrarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Generar;
    private javax.swing.JTextField cant;
    private javax.swing.JTextField cod;
    private javax.swing.JTextField desc;
    private javax.swing.JTextField ent;
    private javax.swing.JButton guardar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JLabel labelcode;
    private javax.swing.JTextField marca;
    private javax.swing.JTextField name;
    private javax.swing.JTextField pcompra;
    private javax.swing.JTextField precioVenta;
    private javax.swing.JComboBox venta;
    // End of variables declaration//GEN-END:variables

    private String generarcodigo() {
        Sqlproductos sqlmod=new Sqlproductos();
        String num="";
        for(int k=0;k<=8;k++){
            int j=(int) (10* Math.random());
            num=num+String.valueOf(j);
            if (k==6) break;
        }
        if(sqlmod.existe(num)){
            generarcodigo();
        }
        return num;
    }
}
