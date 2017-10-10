/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

import java.sql.SQLException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import proyectobd1.Singleton;
import proyectobd1.Tabla;

/**
 *
 * @author Gerald
 */
public class VentanaSeleccion extends javax.swing.JFrame {
    
    public OperacionesAlgebraRelacional ventanaOperaciones;
    /**
     * Creates new form VentanaSeleccion
     */
    public VentanaSeleccion(OperacionesAlgebraRelacional pVentanaOperaciones) {
        initComponents();
        this.ventanaOperaciones = pVentanaOperaciones;
        this.setTitle("Realización de Selección");
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ejecutarBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txfPredicado = new javax.swing.JTextField();
        txfNombreTabla = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfTablaResultado = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableSelecc = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txAResultadoAlgebraR = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txAResultSQL = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));

        jPanel1.setDoubleBuffered(false);
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 525));

        ejecutarBtn.setText("Ejecutar");
        ejecutarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre Tabla: ");

        jLabel2.setText("Predicado:");

        jLabel3.setText("Tabla Resultante:");

        txfTablaResultado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txfTablaResultadoActionPerformed(evt);
            }
        });

        jTableSelecc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(jTableSelecc);

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txAResultadoAlgebraR.setColumns(20);
        txAResultadoAlgebraR.setRows(5);
        jScrollPane1.setViewportView(txAResultadoAlgebraR);

        txAResultSQL.setColumns(20);
        txAResultSQL.setRows(5);
        jScrollPane3.setViewportView(txAResultSQL);

        jLabel4.setText("Equivalente Álgebra Relacional");

        jLabel5.setText("Equivalente en SQL");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 727, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(ejecutarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel1))
                                            .addGap(18, 18, 18)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(txfPredicado)
                                                .addComponent(txfNombreTabla)
                                                .addComponent(txfTablaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(ejecutarBtn)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfNombreTabla, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfPredicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txfTablaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 808, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 558, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ejecutarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarBtnActionPerformed
        // TODO add your handling code here:
        if(!txfTablaResultado.getText().isEmpty()){
            if(Singleton.getInstance().getConexionServidor().existeTablaP(txfNombreTabla.getText())){
                try {
                    String nombreTabla;
                    if(Singleton.getInstance().getConexionServidor().esTablaTemporalP(txfNombreTabla.getText())){
                        nombreTabla = "#"+txfNombreTabla.getText();
                    }else{
                        nombreTabla = txfNombreTabla.getText();
                    }
                    if(!Singleton.getInstance().getConexionServidor().existeTablaP(txfTablaResultado.getText())){
                        
                        Singleton.getInstance().getConexionServidor().realizarInstruccionSql(1,"SELECT * INTO  #"+txfTablaResultado.getText()+" FROM "+nombreTabla+" where "+txfPredicado.getText());
                        Singleton.getInstance().getConexionServidor().realizarInstruccionSql(0,"SELECT * FROM #"+txfTablaResultado.getText());
                        Singleton.getInstance().getConexionServidor().setRs(null);

                        String consulta = "SELECT * FROM #"+txfTablaResultado.getText();
                        Singleton.getInstance().getConexionServidor().realizarInstruccionSql(0, consulta);
                        Tabla nuevaTabla = new Tabla(txfTablaResultado.getText(),true,Singleton.getInstance().getConexionServidor().convertirVector2ArrayList(Singleton.getInstance().getConexionServidor().atributosCosulta()));
                        Singleton.getInstance().getConexionServidor().agregarNombreTabla(nuevaTabla);

                        //Funcion que hace la llamada para ver en la interfaz
                        Singleton.getInstance().getAdministrador().tablaSeleccion(this);
                        
                        String consultaSql = "SELECT * FROM "+txfNombreTabla.getText()+" WHERE "+txfPredicado.getText()+"\n\nNombre de la tabla resultado: "+txfTablaResultado.getText();
                        String consultaAlgebra = txfTablaResultado.getText()+"<- σ "+txfPredicado.getText()+" ("+txfNombreTabla.getText()+")";
                        
                        txAResultSQL.setText(consultaSql);
                        txAResultadoAlgebraR.setText(consultaAlgebra);
                    }else{
                        JOptionPane.showMessageDialog(this, "La tabla resultado ya existe, introduzca un diferente nombre", "Error tabla ya existe", JOptionPane.ERROR_MESSAGE);
                    }
      
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "El predicado o el tipo de datos de la tablas, no coinciden, porfavor revise los valores", "Error inesperado", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "La tabla introducida no existe o escribió mal el nombre", "Error tabla no existe", JOptionPane.ERROR_MESSAGE);
            }
            
        }else{
            if(Singleton.getInstance().getConexionServidor().existeTablaP(txfNombreTabla.getText())){
                try {
                    String nombreTabla;
                    if(Singleton.getInstance().getConexionServidor().esTablaTemporalP(txfNombreTabla.getText())){
                        nombreTabla = "#"+txfNombreTabla.getText();
                    }else{
                        nombreTabla = txfNombreTabla.getText();
                    }
                    
                    Singleton.getInstance().getConexionServidor().realizarInstruccionSql(0,"SELECT * FROM "+nombreTabla+" WHERE "+txfPredicado.getText());
                    Singleton.getInstance().getAdministrador().tablaSeleccion(this);
                    
                    String consultaSql = "SELECT * FROM "+txfNombreTabla.getText()+" WHERE "+txfPredicado.getText();
                    String consultaAlgebra = "σ "+txfPredicado.getText()+" ("+txfNombreTabla.getText()+")";
                        
                    txAResultSQL.setText(consultaSql);
                    txAResultadoAlgebraR.setText(consultaAlgebra);
                    
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "El predicado o el tipo de datos de la tablas, no coinciden, porfavor revise los valores", "Error inesperado", JOptionPane.ERROR_MESSAGE);
                }
            }else{
                JOptionPane.showMessageDialog(this, "La tabla introducida no existe o escribió mal el nombre", "Error tabla no existe", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_ejecutarBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.ventanaOperaciones.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txfTablaResultadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txfTablaResultadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txfTablaResultadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ejecutarBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    public javax.swing.JTable jTableSelecc;
    private javax.swing.JTextArea txAResultSQL;
    private javax.swing.JTextArea txAResultadoAlgebraR;
    private javax.swing.JTextField txfNombreTabla;
    private javax.swing.JTextField txfPredicado;
    private javax.swing.JTextField txfTablaResultado;
    // End of variables declaration//GEN-END:variables
}
