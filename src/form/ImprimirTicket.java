
package form;

import br.com.adilson.util.Extenso;
import br.com.adilson.util.PrinterMatrix;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.print.Doc;
import javax.print.DocFlavor;
import javax.print.DocPrintJob;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.print.SimpleDoc;
import javax.print.attribute.HashPrintRequestAttributeSet;
import javax.print.attribute.PrintRequestAttributeSet;


public class ImprimirTicket extends javax.swing.JFrame {
    public ImprimirTicket() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        no = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(350, 500));
        setUndecorated(true);
        getContentPane().setLayout(null);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/LOGO.png"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 30, 190, 110);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("La venta se realizó correctamente  ");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(70, 150, 220, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 0));
        jLabel10.setText("IMPRIMIR TICKET");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(60, 180, 310, 44);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setText("Si");
        jButton1.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(100, 280, 130, 40);

        no.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        no.setText("No");
        no.setBorder(javax.swing.BorderFactory.createTitledBorder(""));
        no.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                noMouseClicked(evt);
            }
        });
        no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                noActionPerformed(evt);
            }
        });
        getContentPane().add(no);
        no.setBounds(100, 370, 130, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/qq.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(-80, -30, 430, 770);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    String idcajero;
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      generarticket();
      Principal p=new Principal();
      p.jLabel2.setText(usuario);
      p.cajero=idcajero;
      p.setVisible(true);
      RegistrarCompra.cierra=true;      
      /**/      
      this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_noActionPerformed
            
    }//GEN-LAST:event_noActionPerformed

    private void noMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_noMouseClicked
      Principal p=new Principal();
      p.jLabel2.setText(usuario);
      p.cajero=idcajero;
      p.setVisible(true);
      RegistrarCompra.cierra=true;      
      /**/      
      this.dispose();
    }//GEN-LAST:event_noMouseClicked

   
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
            java.util.logging.Logger.getLogger(ImprimirTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImprimirTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImprimirTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImprimirTicket.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImprimirTicket().setVisible(true);
            }
        });
    }
    public String emision="", fecha="",usuario="", direccion="", nventa="",cel="2471192013";
    int nceldas=0, articulos,total ;
    double pago=0,cambio=0;
    public String[][] datosventa=new String[nceldas][5];
    
    private void generarticket() {

        int filas = nceldas+3;
        PrinterMatrix printer = new PrinterMatrix();
        Extenso e = new Extenso();
        e.setNumber(101.85);

        //Definir el tamanho del papel para la impresion  aca 25 lineas y 80 columnas
        printer.setOutSize(filas+18, 80);
        //Imprimir * de la 2da linea a 25 en la columna 1;
        // printer.printCharAtLin(2, 25, 1, "*");
        //Imprimir * 1ra linea de la columa de 1 a 80
//        printer.printCharAtCol(1, 1, 80, "=");
        //Imprimir Encabezado nombre del La EMpresa
        for (int i = 0; i <= filas+17; i++) {
           // printer.printTextWrap(i, 1, 2, 3, "|"); //DESCRIPCION
            //printer.printTextWrap(i, 1, 79, 80, "|"); //DESCRIPCION

        }
        for (int i = 10; i <= filas+10; i++) {
            //printer.printTextWrap(i, 1, 10, 11, "|"); //DESCRIPCION
            //printer.printTextWrap(i, 1, 50, 51, "|"); //DESCRIPCION
            //printer.printTextWrap(i, 1, 59, 60, "|"); //DESCRIPCION
            //printer.printTextWrap(i, 1, 69, 70, "|"); //DESCRIPCION

        }
        String tienda=" AGRO PUNTO VERDE ";
        String[] datos=new String[4];
        datos=recuperardatos();
        printer.printTextWrap(0, 1, 3, 79, "--------------PEDIDO DE VENTA---------------");
        printer.printTextWrap(1, 1, 3, 79,"             "+tienda+"              ");
        //printer.printTextWrap(linI, linE, colI, colE, null);
       // printer.printTextWrap(2, 2, 3, 79, "Cliente: " + "tx_cli.getText()");
        printer.printTextWrap(2, 3, 3, 79, "Emision: " + fecha.substring(0,10)+"    "+"Pedido Nro.: " + nventa);//si
        //printer.printTextWrap(3, 3, 3, 79, "RUC/C.I: " + "tx_ruc.getText()");
        printer.printTextWrap(3, 3, 3, 79, "Hora: " + fecha.substring(10,19));//si
        printer.printTextWrap(4, 3, 3, 79, "Tel.: "+ datos[0]);//si
        printer.printTextWrap(5, 3, 3, 79, "Usuario: " + usuario);//si
        //printer.printTextWrap(5, 2, 3, 79, "Zona: " + "tx_zona.getText()");
        printer.printTextWrap(6, 3, 3, 79, "Direccion: "+datos[1]);//si
        printer.printTextWrap(7, 2, 3, 79, "Ciudad: "+ datos[2] );
        printer.printTextWrap(8, 3, 3, 79, "Moneda: Pesos");
        printer.printTextWrap(8, 2, 3, 79, "=============================================");

        printer.printTextWrap(9, 2, 3, 30, "ID");
        printer.printTextWrap(9, 2, 15, 25, "Nombre");
        printer.printTextWrap(9, 2, 26, 30, "Cant.");
        printer.printTextWrap(9, 2, 31, 40, "P.Unit.");
        printer.printTextWrap(9, 2, 41, 60, "Importe");
        printer.printTextWrap(10, 2, 3, 79, "---------------------------------------------");

        for (int i = 0; i < nceldas; i++) {

            printer.printTextWrap(11 + i, 10, 2, 3, ""); //DESCRIPCION
//            printer.printTextWrap(10 + i, 10, 9, 10, "¦"); //DESCRIPCION
            printer.printTextWrap(11 + i, 10, 4, 9, datosventa[i][0]); //CODIGO
            printer.printTextWrap(11 + i, 10, 11, 25, datosventa[i][1].replace("Ñ", "N").replace("É", "E")); //DESCRIPCION

            printer.printTextWrap(11 + i, 26, 30 - datosventa[i][3].length(), 59,  datosventa[i][3]);//CANTIDAD
            printer.printTextWrap(11 + i, 31, 35 -  datosventa[i][2].length(), 69,  datosventa[i][2]);//PRECIO
            printer.printTextWrap(11 + i, 34, 45 -  datosventa[i][4].length(), 69,  datosventa[i][4]);//IMPORTE
            total+=Integer.parseInt(datosventa[i][4]);
        }
        printer.printTextWrap(filas+8, 10, 3, 79, "=============================================");
        printer.printTextWrap(filas+9, 10, 3, 40, "No. articulos : "+ articulos);
       // printer.printTextWrap(filas+12, 10, 24 - String.valueOf(articulos).length(), 24, String.valueOf(articulos));
        printer.printTextWrap(filas+10, 10, 3, 40, "TOTAL : "+ total);
       // printer.printTextWrap(filas+12, 10, 79 - String.valueOf(total).length(), 79, String.valueOf(total));
        printer.printTextWrap(filas+11, 10, 3, 40, "Su pago: "+ pago+" "+" | "+ "Su Cambio: "+cambio);
       // printer.printTextWrap(filas+13, 10, 24 - tx_descuento.getText().length(), 24, tx_descuento.getText());
        //printer.printTextWrap(filas+15, 10, 3, 79, "Su cambio: ");
        printer.printTextWrap(filas+12, 10, 3, 79, "      "+datos[3]);
//        printer.printTextWrap(28, 10, 3, 79, "1234567891234567891234567891234567891234567891234567891234567891234567891234567");
        printer.printTextWrap(filas+13, 10, 3, 79, "============================================");

        printer.printTextWrap(filas+17, 10, 3, 79, "Esta boleta no tiene valor fiscal, solo para uso interno");
//        printer.printTextWrap(30, 10, 3, 79, "                    **GRACIAS POR LA PREFERENCIA**");
        printer.toFile("impresion.txt");

        FileInputStream inputStream = null;
        try {
            inputStream = new FileInputStream("impresion.txt");
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        }
        if (inputStream == null) {
            return;
        }

        DocFlavor docFormat = DocFlavor.INPUT_STREAM.AUTOSENSE;
        Doc document = new SimpleDoc(inputStream, docFormat, null);

        PrintRequestAttributeSet attributeSet = new HashPrintRequestAttributeSet();

        PrintService defaultPrintService = PrintServiceLookup.lookupDefaultPrintService();

        if (defaultPrintService != null) {
            DocPrintJob printJob = defaultPrintService.createPrintJob();
            try {
                printJob.print(document, attributeSet);

            } catch (Exception ex) {
                ex.printStackTrace();
            }
        } else {
            System.err.println("No existen impresoras instaladas");
        }

        //inputStream.close();
    }
    public String[] recuperardatos(){
         File archivo = null;
         String[] datos=new String[4];
         FileReader fr = null;
         BufferedReader br = null;
      try {
         // Apertura del fichero y creacion de BufferedReader para poder
         // hacer una lectura comoda (disponer del metodo readLine()).
         archivo = new File ("datos.txt");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);
         // Lectura del fichero
         String linea;
         int i=0;
         while((linea=br.readLine())!=null){
             datos[i]=linea;
             i++;
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         // En el finally cerramos el fichero, para asegurarnos
         // que se cierra tanto si todo va bien como si salta 
         // una excepcion.
         try{                    
            if( null != fr ){   
               fr.close();     
            }                  
         }catch (Exception e2){ 
            e2.printStackTrace();
         }
      }
      return datos;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JButton no;
    // End of variables declaration//GEN-END:variables
}
