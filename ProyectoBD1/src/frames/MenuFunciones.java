/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package frames;

/**
 *
 * @author Gerald
 */
public class MenuFunciones extends javax.swing.JFrame {

    /**
     * Creates new form menuFunciones
     */
    public MenuFunciones() {
        initComponents();
        this.setTitle("Menu de operaciones del programa");
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
        ayudaBtn = new javax.swing.JButton();
        operacionesBtn = new javax.swing.JButton();
        tablasBaseDatosBtn = new javax.swing.JButton();
        tablasTemporalesBDBtn1 = new javax.swing.JButton();
        verReferenciaCruzadaAtributoTablaBtn = new javax.swing.JButton();
        acercaDeBtn = new javax.swing.JButton();
        salirBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ayudaBtn.setText("Ayuda");
        ayudaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ayudaBtnActionPerformed(evt);
            }
        });

        operacionesBtn.setText("Operaciones álgebra relacional");
        operacionesBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                operacionesBtnActionPerformed(evt);
            }
        });

        tablasBaseDatosBtn.setText("Ver tablas de la base de datos");
        tablasBaseDatosBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablasBaseDatosBtnActionPerformed(evt);
            }
        });

        tablasTemporalesBDBtn1.setText("Ver tablas temporales BD");
        tablasTemporalesBDBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tablasTemporalesBDBtn1ActionPerformed(evt);
            }
        });

        verReferenciaCruzadaAtributoTablaBtn.setText("Ver referencia cruzada A/T");
        verReferenciaCruzadaAtributoTablaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verReferenciaCruzadaAtributoTablaBtnActionPerformed(evt);
            }
        });

        acercaDeBtn.setText("Acerca de");
        acercaDeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acercaDeBtnActionPerformed(evt);
            }
        });

        salirBtn.setText("Salir");
        salirBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(acercaDeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(verReferenciaCruzadaAtributoTablaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tablasTemporalesBDBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tablasBaseDatosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(operacionesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ayudaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(operacionesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(tablasBaseDatosBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(tablasTemporalesBDBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(verReferenciaCruzadaAtributoTablaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(ayudaBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(acercaDeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(salirBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
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

    private void ayudaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ayudaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ayudaBtnActionPerformed

    private void operacionesBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_operacionesBtnActionPerformed
        // TODO add your handling code here:
        OperacionesAlgebraRelacional ventana = new OperacionesAlgebraRelacional();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_operacionesBtnActionPerformed

    private void tablasBaseDatosBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablasBaseDatosBtnActionPerformed
        // TODO add your handling code here:
        tablaBaseDatos ventana = new tablaBaseDatos();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tablasBaseDatosBtnActionPerformed

    private void tablasTemporalesBDBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tablasTemporalesBDBtn1ActionPerformed
        // TODO add your handling code here:
        tablaTempoBaseDatos ventana = new tablaTempoBaseDatos();
        ventana.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_tablasTemporalesBDBtn1ActionPerformed

    private void verReferenciaCruzadaAtributoTablaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verReferenciaCruzadaAtributoTablaBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_verReferenciaCruzadaAtributoTablaBtnActionPerformed

    private void acercaDeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acercaDeBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_acercaDeBtnActionPerformed

    private void salirBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirBtnActionPerformed
        // TODO add your handling code here:
        dispose();
        System.exit(0);                   
    }//GEN-LAST:event_salirBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MenuFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuFunciones.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuFunciones().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acercaDeBtn;
    private javax.swing.JButton ayudaBtn;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton operacionesBtn;
    private javax.swing.JButton salirBtn;
    private javax.swing.JButton tablasBaseDatosBtn;
    private javax.swing.JButton tablasTemporalesBDBtn1;
    private javax.swing.JButton verReferenciaCruzadaAtributoTablaBtn;
    // End of variables declaration//GEN-END:variables
}
