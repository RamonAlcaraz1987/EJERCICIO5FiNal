
package Vistas;

import Entidades.Producto;
import Entidades.Rubro;
import java.util.TreeSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ejercicio5 extends javax.swing.JFrame {
    private TreeSet<Producto> productos= new TreeSet<>();
    private DefaultTableModel modelo = new DefaultTableModel();

    public Ejercicio5() {
        initComponents();
        llenarCombo();
        armarCabecera();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCRubro = new javax.swing.JComboBox<>();
        jBAgregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jTDescripcion = new javax.swing.JTextField();
        jTPrecio = new javax.swing.JTextField();
        jTStock = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTTabla = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jBAgregar.setText("AGREGAR");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Rubro");

        jLabel2.setText("Stock");

        jLabel3.setText("Descripcion");

        jLabel4.setText("Codigo");

        jLabel5.setText("Precio");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Gestion Productos");

        jTTabla.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jTTabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTTabla.setToolTipText("");
        jScrollPane1.setViewportView(jTTabla);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(172, 172, 172))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 78, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBAgregar)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTCodigo)
                                    .addComponent(jTDescripcion)
                                    .addComponent(jTPrecio)
                                    .addComponent(jTStock)
                                    .addComponent(jCRubro, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(121, 121, 121))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCRubro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(29, 29, 29)
                .addComponent(jBAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
        int codigo;
        Rubro rubro;
        String descripcion;
        double precio;
        int stock;
        
        if(validaEntero(jTCodigo.getText()))
        {
             codigo= Integer.parseInt(jTCodigo.getText());
        
        }
        else{
        
            JOptionPane.showMessageDialog(this, "ingrese un numero entero en CODIGO");
            jTCodigo.requestFocus();
            jTCodigo.setText("");
            return;
            
           }
        
        rubro = (Rubro)jCRubro.getSelectedItem();
        
        
        if(validaReal(jTPrecio.getText()))
        {
            precio=Double.parseDouble(jTPrecio.getText());
        
        }
        else{
        
            JOptionPane.showMessageDialog(this, "ingrese un numero en PRECIO");
            jTPrecio.requestFocus();
            jTPrecio.setText("");

            return;
            
        
        }
        
        if(!jTDescripcion.getText().isEmpty())
        {
        
            descripcion=jTDescripcion.getText();
           
        
        }
        else 
        {
            JOptionPane.showMessageDialog(this,"ingrese una descripcion para el prod");
             jTDescripcion.requestFocus();
             jTDescripcion.setText("");

            return;
        
        }
        if(validaEntero(jTStock.getText()))
        {
             stock= Integer.parseInt(jTStock.getText());
        
        }
        else{
        
            JOptionPane.showMessageDialog(this, "ingrese un numero entero en:STOCK");
            jTStock.requestFocus();
            jTStock.setText("");
            return;
            
            
           }
        
           Producto prod = new Producto(codigo,descripcion,precio,rubro,stock);
           if(productos.add(prod)){
                
                cargarFila(prod);
           
            }
            else
            {
                JOptionPane.showMessageDialog(this, "El producto que quiere ingresar tiene el mismo CODIGO. cambie el Campo");
                 jTCodigo.setText("");
                 jTCodigo.requestFocus();
            }
           
 
    }//GEN-LAST:event_jBAgregarActionPerformed
    private void cargarFila(Producto prod)
            
         {
       
            modelo.addRow(new Object[]{prod.getCodigo(), prod.getDescripcion(), prod.getPrecio(), prod.getStock(), prod.getRubro()});
                                    limpiar();
             
        }
          
    
    private void armarCabecera(){
    
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        modelo.addColumn("Rubro");
        
        jTTabla.setModel(modelo);
        
        
    
    }
    
    

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
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicio5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Ejercicio5().setVisible(true);
            }
        });
    }
    
        
    
        private void llenarCombo()
        {
            Rubro comestible = new Rubro(1,"Comestible");
            Rubro limpieza = new Rubro(2,"Limpieza");
            Rubro perfumeria = new Rubro(3,"Perfumeria");
            
            jCRubro.addItem(comestible);
            jCRubro.addItem(limpieza);
            jCRubro.addItem(perfumeria);
        
        
        }
        private void limpiar()
        {
            jCRubro.setSelectedIndex(1);
            jTCodigo.setText("");
            jTDescripcion.setText("");
            jTPrecio.setText("");
            jTStock.setText("");
                  
        
        }
        private boolean validaEntero(String nro)
        {
            Pattern patron=Pattern.compile("^[0-9]+$");
            Matcher m=patron.matcher(nro);
            return m.matches();
        }
        private boolean validaReal(String nro)
        {
            Pattern patron = Pattern.compile("^\\d+(\\.\\d+)?$");
            Matcher m = patron.matcher(nro);
            return m.matches();
        
        
        }        
        
        
        
        

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JComboBox<Rubro> jCRubro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTDescripcion;
    private javax.swing.JTextField jTPrecio;
    private javax.swing.JTextField jTStock;
    private javax.swing.JTable jTTabla;
    // End of variables declaration//GEN-END:variables
}
