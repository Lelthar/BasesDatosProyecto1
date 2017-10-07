/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectobd1.Singleton;

/**
 *
 * @author mailon2
 */
public class tablaBaseDatos extends javax.swing.JFrame {

    /**
     * Creates new form tablaBaseDatos
     */
    private int actual;
    ArrayList<String> tablas;
    public tablaBaseDatos() {
        initComponents();
        this.setTitle("Visor de definición de tabla");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.actual = 0;
        this.tablas = new ArrayList<>();
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButtonSalir = new javax.swing.JButton();
        jButtonEje = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldTabla = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableResul = new javax.swing.JTable();
        jButtonAnterior = new javax.swing.JButton();
        jButtonSigue = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelTablaAct = new javax.swing.JLabel();

        jButton1.setText("jButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButtonSalir.setText("Salir");

        jButtonEje.setText("Ejecutar");
        jButtonEje.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEjeActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre Tabla:");

        jTableResul.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre Atributo", "Tipo Dato", "Not Null", "Primary Key", "Foreign Key", "Unique", "Check"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.Boolean.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTableResul);

        jButtonAnterior.setText("Anterior");
        jButtonAnterior.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAnteriorActionPerformed(evt);
            }
        });

        jButtonSigue.setText("Siguiente");
        jButtonSigue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSigueActionPerformed(evt);
            }
        });

        jLabel2.setText("Si desea todas las tablas escribir: TODAS");

        jLabel3.setText("Tabla:");

        jLabelTablaAct.setText(" ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonAnterior)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonSigue))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButtonSalir)
                                    .addGap(54, 54, 54)
                                    .addComponent(jButtonEje))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jTextFieldTabla)))
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelTablaAct, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 735, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonSalir)
                    .addComponent(jButtonEje))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jLabelTablaAct, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonAnterior)
                    .addComponent(jButtonSigue))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonEjeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEjeActionPerformed
        try {
            // TODO add your handling code here:
            String tabla = this.jTextFieldTabla.getText();
            tablas.clear();
            if(!tabla.isEmpty()){
                if(!tabla.equals("TODAS")){
                    if(Singleton.getInstance().getConexionServidor().existeTablaP(jTextFieldTabla.getText())){
                        String nombreTabla ="";
                        //if(Singleton.getInstance().getConexionServidor().esTablaTemporalP(jTextFieldTabla.getText())){
                          //  nombreTabla = "#"+jTextFieldTabla.getText();
                        //}else{
                            nombreTabla = jTextFieldTabla.getText();
                        //}
                        ArrayList<ArrayList<String>> result =Singleton.getInstance().getConexionServidor().definicionTabla(nombreTabla);
                        //System.out.println(result.size()+" -> "+nombreTabla );
                        Singleton.getInstance().getAdministrador().tablaAtributos(this, result);
                        jLabelTablaAct.setText(jTextFieldTabla.getText());
                        jTextFieldTabla.setText("");
                        System.out.println("Consutal lista");
                    }else{
                        JOptionPane.showMessageDialog(this, "Error la tabla: "
                                +tabla+" no existe.", "No existe tabla", JOptionPane.ERROR_MESSAGE);
                    }
                }else{
                    System.out.println("TODAS");
                    tablas = Singleton.getInstance().getConexionServidor().nombreTablas();
                    ArrayList<ArrayList<String>> result =Singleton.getInstance().getConexionServidor().definicionTabla(tablas.get(actual));
                        //System.out.println(result.size()+" -> "+nombreTabla );
                        Singleton.getInstance().getAdministrador().tablaAtributos(this, result);
                    jLabelTablaAct.setText(tablas.get(actual));
                    actual+=1;
                    jTextFieldTabla.setText("");
                    
                }
            }else{
                JOptionPane.showMessageDialog(this, "El nombre de la tabla se encuentra vacio"
                                        , "Nombre tabla vacio", JOptionPane.ERROR_MESSAGE);
            }
        } catch (SQLException ex) {
            System.out.println("Algun error");
        }
    }//GEN-LAST:event_jButtonEjeActionPerformed

    private void jButtonAnteriorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAnteriorActionPerformed
        // TODO add your handling code here:
        if(!tablas.isEmpty()){    
            if(actual>=1){
                try {
                    actual-=1;
                    ArrayList<ArrayList<String>> result =Singleton.getInstance().getConexionServidor().definicionTabla(tablas.get(actual));
                    //System.out.println(result.size()+" -> "+nombreTabla );
                    Singleton.getInstance().getAdministrador().tablaAtributos(this, result);
                    jLabelTablaAct.setText(tablas.get(actual));
                    jTextFieldTabla.setText("");
                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(this, "Existe algún problema cargando la siguiente tabla"
                                            , "Error carga tabla", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "No existe una tabla anterior"
                                            , "Error tabla", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No se selecciono la opción: TODAS"
                                            , "Opción incorrecta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonAnteriorActionPerformed

    private void jButtonSigueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSigueActionPerformed
        // TODO add your handling code here:
        if(!tablas.isEmpty()){
            if(actual<tablas.size()-1){
                try {
                    actual+=1;
                    ArrayList<ArrayList<String>> result =Singleton.getInstance().getConexionServidor().definicionTabla(tablas.get(actual));
                    //System.out.println(result.size()+" -> "+nombreTabla );
                    Singleton.getInstance().getAdministrador().tablaAtributos(this, result);
                    jLabelTablaAct.setText(tablas.get(actual));
                    jTextFieldTabla.setText("");
                } catch (SQLException ex) {
                   JOptionPane.showMessageDialog(this, "Existe algún problema cargando la siguiente tabla"
                                            , "Error carga tabla", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "No existe una tabla siguiente"
                                            , "Error tabla", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(this, "No se selecciono la opción: TODAS"
                                            , "Opción incorrecta", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jButtonSigueActionPerformed

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
            java.util.logging.Logger.getLogger(tablaBaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tablaBaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tablaBaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tablaBaseDatos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tablaBaseDatos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonAnterior;
    private javax.swing.JButton jButtonEje;
    private javax.swing.JButton jButtonSalir;
    private javax.swing.JButton jButtonSigue;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelTablaAct;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable jTableResul;
    private javax.swing.JTextField jTextFieldTabla;
    // End of variables declaration//GEN-END:variables
}
