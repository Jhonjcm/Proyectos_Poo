/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte_1;

import javax.swing.JOptionPane;

/**
 *
 * @author jhonj
 */
public class jfCuadradas extends javax.swing.JFrame {

    private int rango;

    /**
     * Creates new form jfCuadradas
     */
    public jfCuadradas() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtRango = new javax.swing.JTextField();
        bnAceptar = new javax.swing.JButton();
        bnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtRaices = new javax.swing.JLabel();
        txtCuadrados = new javax.swing.JLabel();
        txtCubos = new javax.swing.JLabel();
        bnReiniciar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese cantidad de numeros a operar:");

        txtRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRangoActionPerformed(evt);
            }
        });

        bnAceptar.setText("Aceptar");
        bnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAceptarActionPerformed(evt);
            }
        });

        bnAgregar.setText("Agregar");
        bnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnAgregarActionPerformed(evt);
            }
        });

        jLabel2.setText("Raices");

        jLabel3.setText("Cuadrados");

        jLabel4.setText("Cubos");

        bnReiniciar.setText("Reiniciar");
        bnReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bnReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bnAgregar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4))))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtRaices, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtCuadrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtRango, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(bnAceptar)
                                .addGap(0, 59, Short.MAX_VALUE))
                            .addComponent(txtCubos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bnReiniciar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtRango, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bnAceptar))
                .addComponent(bnAgregar)
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtRaices, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtCuadrados, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCubos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bnReiniciar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRangoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRangoActionPerformed

    private void bnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAceptarActionPerformed
        // TODO add your handling code here:
        rango = Integer.parseInt(txtRango.getText());
    }//GEN-LAST:event_bnAceptarActionPerformed

    private void bnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnAgregarActionPerformed
        // TODO add your handling code here:
        int i;
        double[] lista = new double[rango];
        i = 0;
        
        while(i < rango){
            String dato = JOptionPane.showInputDialog(this, "Ingrese número "+(i+1));
              
            lista[i] = Double.parseDouble(dato);
            

            i += 1;
        }bnAgregar.setEnabled(false);
         bnAceptar.setEnabled(false);
        
        cuadradas operaciones = new cuadradas(rango);
        
        String listaRaices, listaCuadrados, listaCubos;
        listaRaices = "[ ";
        listaCuadrados ="[ ";
        listaCubos = "[ ";
        
        
        for (int j = 0; j < rango; j += 1){
            listaRaices +=" |";
            listaRaices += String.valueOf(operaciones.calcularRaiz(lista[j]));            
        } listaRaices += " ]";
        
        for (int j = 0; j < rango; j += 1){
            listaCuadrados +=" |";
            listaCuadrados += String.valueOf(operaciones.calcularCuadrado(lista[j]));
        } listaCuadrados += " ]";
        
        
        for (int j = 0; j < rango; j += 1){
            listaCubos +=" |";
            listaCubos += String.valueOf(operaciones.calcularCubo(lista[j]));
        } listaCubos += " ]";
        
        txtRaices.setText(listaRaices);
        txtCuadrados.setText(listaCuadrados);
        txtCubos.setText(listaCubos);
       
        
    }//GEN-LAST:event_bnAgregarActionPerformed

    private void bnReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bnReiniciarActionPerformed
        // TODO add your handling code here:
        txtCuadrados.setText("");
        txtCubos.setText("");
        txtRaices.setText("");
        txtRango.setText("");
        
        bnAgregar.setEnabled(true);
        bnAceptar.setEnabled(true);
    }//GEN-LAST:event_bnReiniciarActionPerformed
   
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
            java.util.logging.Logger.getLogger(jfCuadradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jfCuadradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jfCuadradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jfCuadradas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new jfCuadradas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bnAceptar;
    private javax.swing.JButton bnAgregar;
    private javax.swing.JButton bnReiniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel txtCuadrados;
    private javax.swing.JLabel txtCubos;
    private javax.swing.JLabel txtRaices;
    private javax.swing.JTextField txtRango;
    // End of variables declaration//GEN-END:variables
}
