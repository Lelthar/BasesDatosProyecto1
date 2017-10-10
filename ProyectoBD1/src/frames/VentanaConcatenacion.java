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
import proyectobd1.Tabla;

/**
 *
 * @author Gerald
 */
public class VentanaConcatenacion extends javax.swing.JFrame {

    OperacionesAlgebraRelacional ventanaOperaciones;
    /**
     * Creates new form VentanaSeleccion
     */
    public VentanaConcatenacion(OperacionesAlgebraRelacional pVentanaOperaciones) {
        initComponents();
        this.ventanaOperaciones = pVentanaOperaciones;
        this.setTitle("Realización de Intersección");
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
        txfNombreTabla1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txfTablaResultado = new javax.swing.JTextField();
        txfNombreTabla2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txAResultAlgebraR = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txAResultSQL = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTableResultado = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ejecutarBtn.setText("Ejecutar");
        ejecutarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ejecutarBtnActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre Tabla 1: ");

        jLabel2.setText("Predicado:");

        jLabel3.setText("Tabla Resultante:");

        jLabel4.setText("Nombre Tabla 2: ");

        jButton1.setText("Atras");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        txAResultAlgebraR.setColumns(20);
        txAResultAlgebraR.setRows(5);
        jScrollPane2.setViewportView(txAResultAlgebraR);

        txAResultSQL.setColumns(20);
        txAResultSQL.setRows(5);
        jScrollPane3.setViewportView(txAResultSQL);

        jLabel5.setText("Equivalente en Álgebra relacional");

        jLabel6.setText("Equivalente en SQL");

        jTableResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(jTableResultado);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ejecutarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(txfNombreTabla1, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txfTablaResultado, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txfPredicado)
                                    .addComponent(txfNombreTabla2)))))
                    .addComponent(jLabel3))
                .addGap(69, 69, 69)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 336, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1)
                    .addComponent(ejecutarBtn)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfNombreTabla1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txfNombreTabla2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txfPredicado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txfTablaResultado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ejecutarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ejecutarBtnActionPerformed
        // TODO add your handling code here:
        if(!txfTablaResultado.getText().isEmpty()){
            if(Singleton.getInstance().getConexionServidor().existeTablaP(txfNombreTabla1.getText()) && Singleton.getInstance().getConexionServidor().existeTablaP(txfNombreTabla2.getText())){
                    String nombreTabla1;
                    String nombreTabla2;
                    if(Singleton.getInstance().getConexionServidor().esTablaTemporalP(txfNombreTabla1.getText())){
                        nombreTabla1 = "#"+txfNombreTabla1.getText();
                    }else{
                        nombreTabla1 = txfNombreTabla1.getText();
                    }
                    if(Singleton.getInstance().getConexionServidor().esTablaTemporalP(txfNombreTabla2.getText())){
                        nombreTabla2 = "#"+txfNombreTabla2.getText();
                    }else{
                        nombreTabla2 = txfNombreTabla2.getText();
                    }
                    if(!Singleton.getInstance().getConexionServidor().existeTablaP(txfTablaResultado.getText())){
                        try {
                            ArrayList<String> lista2 = Singleton.getInstance().getConexionServidor().atributosSinRepetir(Singleton.getInstance().getConexionServidor().obtenerAtributos(nombreTabla1), Singleton.getInstance().getConexionServidor().obtenerAtributos(nombreTabla2));
                            String selectString = Singleton.getInstance().getConexionServidor().construirSelectString(Singleton.getInstance().getConexionServidor().obtenerAtributos(nombreTabla1),nombreTabla1,lista2,nombreTabla2);
                            Singleton.getInstance().getConexionServidor().realizarInstruccionSql(1,"SELECT "+selectString+" INTO  #"+txfTablaResultado.getText()+" FROM "+nombreTabla1+" INNER JOIN "+nombreTabla2+ " ON("+txfPredicado.getText()+")");
                            //Singleton.getInstance().getConexionServidor().realizarInstruccionSql(0,"SELECT * FROM #"+txfTablaResultado.getText());
                            Singleton.getInstance().getConexionServidor().setRs(null);
                            String consulta = "SELECT * FROM #"+txfTablaResultado.getText();
                            Singleton.getInstance().getConexionServidor().realizarInstruccionSql(0, consulta);
                            Tabla nuevaTabla = new Tabla(txfTablaResultado.getText(),true,Singleton.getInstance().getConexionServidor().convertirVector2ArrayList(Singleton.getInstance().getConexionServidor().atributosCosulta()));
                            Singleton.getInstance().getConexionServidor().agregarNombreTabla(nuevaTabla);
                            //Funcion que hace la llamada para ver en la interfaz
                            
                            Singleton.getInstance().getAdministrador().tablaConcatenacion(this);

                            String consultaSql = "SELECT * FROM "+txfNombreTabla1.getText()+" INNER JOIN "+txfNombreTabla2.getText()+" ON ("+txfPredicado.getText()+")"+"\n\nNombre de la tabla resultado: "+txfTablaResultado.getText();
                            String consultaAlgebra = txfTablaResultado.getText()+"<- "+txfNombreTabla1.getText()+" ⋈ ("+txfPredicado.getText()+") "+txfNombreTabla2.getText();

                            txAResultSQL.setText(consultaSql);
                            txAResultAlgebraR.setText(consultaAlgebra);
                        
                        } catch (SQLException ex) {
                            //Logger.getLogger(VentanaUnion.class.getName()).log(Level.SEVERE, null, ex);
                            JOptionPane.showMessageDialog(this, "El predicado está incorrecto, porfavor reviselo", "Error inesperado", JOptionPane.ERROR_MESSAGE);
                         }  
                    
                    }else{
                        JOptionPane.showMessageDialog(this, "La tabla resultado ya existe, introduzca un diferente nombre", "Error tabla ya existe", JOptionPane.ERROR_MESSAGE);
                    }

           }else{
               JOptionPane.showMessageDialog(this, "Una de las dos tablas no existe", "Error tabla no existe", JOptionPane.ERROR_MESSAGE);
           }  
       }else{
           if(Singleton.getInstance().getConexionServidor().existeTablaP(txfNombreTabla1.getText()) && Singleton.getInstance().getConexionServidor().existeTablaP(txfNombreTabla2.getText())){
                String nombreTabla1;
                String nombreTabla2;
                if(Singleton.getInstance().getConexionServidor().esTablaTemporalP(txfNombreTabla1.getText())){
                    nombreTabla1 = "#"+txfNombreTabla1.getText();
                }else{
                    nombreTabla1 = txfNombreTabla1.getText();
                }
                if(Singleton.getInstance().getConexionServidor().esTablaTemporalP(txfNombreTabla2.getText())){
                    nombreTabla2 = "#"+txfNombreTabla2.getText();
                }else{
                    nombreTabla2 = txfNombreTabla2.getText();
                }
                   
                try {
                    ArrayList<String> lista2 = Singleton.getInstance().getConexionServidor().atributosSinRepetir(Singleton.getInstance().getConexionServidor().obtenerAtributos(nombreTabla1), Singleton.getInstance().getConexionServidor().obtenerAtributos(nombreTabla2));
                    String selectString = Singleton.getInstance().getConexionServidor().construirSelectString(Singleton.getInstance().getConexionServidor().obtenerAtributos(nombreTabla1),nombreTabla1,lista2,nombreTabla2);
                    
                    Singleton.getInstance().getConexionServidor().realizarInstruccionSql(0,"SELECT "+selectString+" FROM "+nombreTabla1+" INNER JOIN "+nombreTabla2+" ON("+txfPredicado.getText()+")");
                    //Funcion que hace la llamada para ver en la interfaz
                    
                    Singleton.getInstance().getAdministrador().tablaConcatenacion(this);

                    String consultaSql = "SELECT * FROM "+txfNombreTabla1.getText()+" INNER JOIN "+txfNombreTabla2.getText()+" ON("+txfPredicado.getText()+")"+"\n\nNombre de la tabla resultado: "+txfTablaResultado.getText();
                    String consultaAlgebra = txfTablaResultado.getText()+"<- "+txfNombreTabla1.getText()+" ⋈ ("+txfPredicado.getText()+") "+txfNombreTabla2.getText();

                    txAResultSQL.setText(consultaSql);
                    txAResultAlgebraR.setText(consultaAlgebra);
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(this, "El predicado está incorrecto, porfavor reviselo", "Error inesperado", JOptionPane.ERROR_MESSAGE);
                }  
                    
            
           }else{
               JOptionPane.showMessageDialog(this, "Una de las dos tablas no existe", "Error tabla no existe", JOptionPane.ERROR_MESSAGE);
           }
       }
    }//GEN-LAST:event_ejecutarBtnActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.ventanaOperaciones.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ejecutarBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    public javax.swing.JTable jTableResultado;
    private javax.swing.JTextArea txAResultAlgebraR;
    private javax.swing.JTextArea txAResultSQL;
    private javax.swing.JTextField txfNombreTabla1;
    private javax.swing.JTextField txfNombreTabla2;
    private javax.swing.JTextField txfPredicado;
    private javax.swing.JTextField txfTablaResultado;
    // End of variables declaration//GEN-END:variables
}
