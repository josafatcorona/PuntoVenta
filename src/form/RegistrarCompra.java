
package form;

import Atxy2k.CustomTextField.RestrictedTextField;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Sqlproductos;
import modelo.productos;
import modelo.sqlventas;
import java.util.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.sendMail;

public class RegistrarCompra extends javax.swing.JFrame implements Runnable{
    //variables para la hora
    String vhora, minutos, segundos, ampm,fechac;
    Calendar calendario;
    Thread  h1;
    public static String cds;
   public static int cuenta=0,i=-1,articulos=0;
   public static String codigo="";
    public RegistrarCompra() {     
        cierra=false;
        initComponents();
        this.setExtendedState(MAXIMIZED_BOTH);
        h1=new Thread(this);
        h1.start();
        i=-1;
        Date sistemaFech = new Date();
        SimpleDateFormat formato = new SimpleDateFormat("dd MMMM yyyy");
        fecha.setText(formato.format(sistemaFech));
        sqlventas sqlvn=new sqlventas();
        String nventa=sqlvn.numventa();        
        nticket.setText(String.valueOf(nventa));
        cierra=false;        
        RestrictedTextField co= new RestrictedTextField(cod12);
        co.setLimit(13);
        co.setOnlyAlphaNumeric(true);
        cod12.requestFocus();
       }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel2 = new javax.swing.JLabel();
        nticket = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        Agregar = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        t2 = new javax.swing.JTable();
        t2 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        t2 = new javax.swing.JTable();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jTextField6 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        total = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jButton6 = new javax.swing.JButton();
        finalizar = new javax.swing.JButton();
        cod12 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        hora = new javax.swing.JLabel();
        fecha = new javax.swing.JLabel();
        regresar = new javax.swing.JButton();
        cajero = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(getMaximumSize());
        setUndecorated(true);
        setSize(new java.awt.Dimension(1250, 940));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(getMaximumSize());
        jPanel1.setPreferredSize(new java.awt.Dimension(900, 570));

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/apv.png"))); // NOI18N

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("AGRO PUNTO VERDE");

        jLabel1.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N
        jLabel1.setText("Le atiende: ");

        jLabel2.setForeground(new java.awt.Color(0, 102, 0));
        jLabel2.setText("# VENTA - TICKET:");

        nticket.setEditable(false);
        nticket.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N

        jLabel5.setText("Código producto:");

        Agregar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        Agregar.setText("Agregar producto");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton4.setText("Buscar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 0));

        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });

        t2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Nombre", "Precio", "Cantidad", "Importe"
            }
        ));
        t2.setCellSelectionEnabled(true);
        jScrollPane2.setViewportView(t2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        jTextField6.setEditable(false);
        jTextField6.setText("0");

        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("# Productos de venta actual:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("$");

        total.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        total.setForeground(new java.awt.Color(51, 0, 153));
        total.setText("0.0");
        total.setEnabled(false);
        total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                totalActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("Total:");

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButton6.setText("Ventas del día");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        finalizar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        finalizar.setText("Cobrar");
        finalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                finalizarActionPerformed(evt);
            }
        });

        cod12.setText("5");
        cod12.setFocusCycleRoot(true);
        cod12.setFocusTraversalPolicyProvider(true);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel9.setText("Fecha:");

        jLabel14.setText("Hora:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addGap(18, 18, 18)
                        .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9)
                    .addComponent(fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14)
                    .addComponent(hora, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        regresar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        regresar.setText("Regresar");
        regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                regresarActionPerformed(evt);
            }
        });

        cajero.setFont(new java.awt.Font("Montserrat", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3)
            .addComponent(jSeparator9)
            .addComponent(jSeparator5)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(nticket, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(196, 196, 196))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cod12, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Agregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(201, 201, 201))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(296, 296, 296)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(finalizar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(192, 192, 192))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(218, 218, 218)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 1075, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(181, 181, 181)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cajero, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(cajero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(54, 54, 54)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nticket, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6))
                .addGap(6, 6, 6)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(Agregar)
                    .addComponent(jButton4)
                    .addComponent(cod12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32045, 32045, 32045))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(finalizar)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(regresar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1410, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_regresarActionPerformed
        Principal p= new Principal();
        p.setVisible(true);
        p.jLabel2.setText(cajero.getText());
        p.cajero=idcajero;
        this.hide();
    }//GEN-LAST:event_regresarActionPerformed

    private void finalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_finalizarActionPerformed
        Sqlproductos mod=new Sqlproductos();
        if(!"0.0".equals(total.getText())){
            String valida = JOptionPane.showInputDialog(null,"Cantidad pagada");

            if(mod.esnumero(valida)){
                cant=Float.parseFloat(valida);
                if(cant>=Double.parseDouble(total.getText())){
                    co.total.setText(total.getText());
                    co.pago.setText(String.valueOf(cant));
                    cambio=cant-Double.parseDouble(total.getText());
                    co.cambio.setText(String.valueOf(cambio));
                    co.setVisible(true);
                    co.nceldas=t2.getRowCount();
                    Date fechaHoraActual= new Date();
                    Calendar calendario=new GregorianCalendar();
                    fechac=String.valueOf(calendario.get(Calendar.YEAR))+"-"+String.valueOf(calendario.get(Calendar.MONTH)+1)+"-"+String.valueOf(calendario.get(Calendar.DAY_OF_MONTH))+" "+String.valueOf(calendario.get(Calendar.HOUR_OF_DAY))+":"+String.valueOf(calendario.get(Calendar.MINUTE))+":"+String.valueOf(calendario.get(Calendar.SECOND))+".0";
                    co.fecha=fechac;
                    co.articulos=articulos;
                    co.idcajero=idcajero;
                    co.ncajero=cajero.getText();
                    co.nventa=nticket.getText();
                    String[][] datos=new String[t2.getRowCount()][5];

                    for(int i=0;i<=t2.getRowCount()-1;i++){
                        for(int i2=0;i2<=4;i2++){
                            datos[i][i2]=String.valueOf(t2.getValueAt(i,i2));
                        }
                    }
                    co.datosventa=datos;
                } else {
                    JOptionPane.showMessageDialog(rootPane, "La cantidad pagada no puede ser menor que el total");
                }
            }else{JOptionPane.showMessageDialog(rootPane, "Debe introducir numeros");}
        }else{
            JOptionPane.showMessageDialog(null, "Aún no has escogido ningún producto");
        }
        //Enviar mail con info
        // sendMail mail = new sendMail();
        /* mail.setMyAccount("ventas.agropuntoverde@gmail.com");
        mail.setPassword("agro@verde");
        mail.setAccount("josafatcoronac@gmail.com");
        mail.setText("My mail\n from java app");

        try {
            mail.sendMail();
        } catch (Exception ex) {
            Logger.getLogger(RegistrarCompra.class.getName()).log(Level.SEVERE, null, ex);
        }*/
        // mail.enviarMail();

    }//GEN-LAST:event_finalizarActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        VentasDelDia vd= new VentasDelDia();
        vd.ncajero=cajero.getText();
        vd.idcajero=idcajero;
        vd.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void totalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_totalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_totalActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        BuscarProductos bp;
        bp = new BuscarProductos(this,true);
        bp.ncajero=cajero.getText();
        bp.idcajero=idcajero;
        bp.setVisible(true);
        bp.registrar=this;
        // this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

//GEN-FIRST:event_AgregarActionPerformed
 
//GEN-LAST:event_AgregarActionPerformed

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked

    }//GEN-LAST:event_AgregarMouseClicked
 public static boolean cierra=false;     
     Cobrar co= new Cobrar();  
public String idcajero="";
float cant;
Double cambio;
    private void cuenta(){
        Double cuenta2=0.0;
        int articulos2=0;
        int tama=t2.getRowCount();
        for(int inicio=0;inicio<tama;inicio++){
            cuenta2=cuenta2+Double.parseDouble(String.valueOf(t2.getValueAt(inicio,4)));
            articulos2=articulos2+Integer.parseInt(String.valueOf(t2.getValueAt(inicio,3)));
            System.out.println("cuenta2= "+cuenta2+" celda= " +t2.getValueAt(inicio,4));
            System.out.println("i= "+i+" inicio= "+inicio+" tama= "+ tama+" articulos= "+articulos2);
        }
        //JOptionPane.showMessageDialog(rootPane, "Cuenta: "+cuenta2);
        total.setText(String.valueOf(cuenta2));
        jTextField6.setText(String.valueOf(articulos2));
    }
    private int registrado(String codig){
        int exist=-15;
        for(int inicio=0;inicio<t2.getRowCount();inicio++){
            if(codig.equals(String.valueOf(t2.getValueAt(inicio,0)))){
                exist=inicio;
                break;
            }
        }
        return exist;
    }
    /**     **/
    public boolean esnumero(String cadena){
      try {
		Integer.parseInt(cadena);
		return true;
	} catch (NumberFormatException nfe){
		return false;
	}
  }
   public void AddCompra(){
        this.AgregarActionPerformed(null);
        
    }void datosbd(){
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
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarCompra.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarCompra().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    public javax.swing.JTextField cajero;
    private javax.swing.JTextField cod12;
    private javax.swing.JLabel fecha;
    private javax.swing.JButton finalizar;
    private javax.swing.JLabel hora;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField nticket;
    private javax.swing.JButton regresar;
    private javax.swing.JTable t2;
    private javax.swing.JTextField total;
    // End of variables declaration//GEN-END:variables
  
   
    @Override
    public void run() {
         Thread ct= Thread.currentThread();
        while(ct==h1){
            calcula();
           // fechac=calendario.get(Calendar.YEAR)+"-"+calendario.get(Calendar.MONTH)+"-"+calendario.get(Calendar.DAY_OF_MONTH)+" "+String.valueOf((Integer.parseInt(vhora)+12))+":"+minutos+":"+segundos+".0";
            hora.setText(vhora+":"+minutos+":"+segundos +" "+ampm);
            if(cierra==true){
                this.dispose();
            }           
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
        }
    }

    private void calcula() {
       
        Date fechaHoraActual= new Date();
        Calendar calendario=new GregorianCalendar();
        calendario.setTime(fechaHoraActual);
        ampm=calendario.get(Calendar.AM_PM)==Calendar.AM?"AM":"PM";
        if(ampm.equals("PM")){
            int h=calendario.get(Calendar.HOUR_OF_DAY)-12;
            vhora=h>9?""+h:"0"+h;
           }else{
                vhora= calendario.get(Calendar.HOUR_OF_DAY)>9?""+calendario.get(Calendar.HOUR_OF_DAY):"0"+calendario.get(Calendar.HOUR_OF_DAY);
        } 
        minutos=calendario.get(Calendar.MINUTE)>9?""+calendario.get(Calendar.MINUTE):"0"+calendario.get(Calendar.MINUTE);
        segundos=calendario.get(Calendar.SECOND)>9?""+calendario.get(Calendar.SECOND):"0"+calendario.get(Calendar.SECOND);
        
    }

    private void AgregarActionPerformed(Object object) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
