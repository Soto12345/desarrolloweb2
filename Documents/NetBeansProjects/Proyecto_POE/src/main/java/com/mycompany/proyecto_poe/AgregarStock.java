
package com.mycompany.proyecto_poe;

import javax.swing.JOptionPane;



public class AgregarStock extends javax.swing.JInternalFrame {

   Colastock datos;
   
    public AgregarStock(Colastock datos) {
        initComponents();
        this.datos=datos;
        txtpiezaproducto.setEnabled(false);
        txtcostounitario.setEnabled(false);
        txtcaracteristicas.setEnabled(false);
        btnAgregar.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtnumproducto = new javax.swing.JTextField();
        txtnombreproducto = new javax.swing.JTextField();
        txtpiezaproducto = new javax.swing.JTextField();
        txtcostounitario = new javax.swing.JTextField();
        txtcaracteristicas = new javax.swing.JTextField();
        btnRegresar = new javax.swing.JButton();

        setClosable(true);
        setResizable(true);

        jLabel1.setText("NUEVO PRODUCTO:");

        btnAgregar.setText("Agregar nuevo");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        jLabel2.setText("Numero producto:");

        jLabel3.setText("Nombre: ");

        jLabel4.setText("piezas producto");

        jLabel5.setText("Costo Unitario:");

        jLabel6.setText("Caracteristicas:");

        txtnumproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnumproductoKeyReleased(evt);
            }
        });

        txtnombreproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnombreproductoKeyReleased(evt);
            }
        });

        txtpiezaproducto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtpiezaproductoKeyReleased(evt);
            }
        });

        txtcostounitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcostounitarioKeyReleased(evt);
            }
        });

        txtcaracteristicas.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtcaracteristicasKeyReleased(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(57, 57, 57))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcostounitario, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                            .addComponent(txtnombreproducto)
                            .addComponent(txtpiezaproducto)
                            .addComponent(txtcaracteristicas)
                            .addComponent(txtnumproducto)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(136, 136, 136)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtnumproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtnombreproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(txtpiezaproducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(txtcostounitario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(txtcaracteristicas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnRegresar))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        
        this.dispose();
        
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int n=Integer.parseInt(txtnumproducto.getText());
        txtnombreproducto.getText();
        int c=Integer.parseInt(txtpiezaproducto.getText());
        int cu=Integer.parseInt(txtcostounitario.getText()); 
        datos.encolar(n, txtnombreproducto.getText(), c, cu, txtcaracteristicas.getText(), "si");
        this.dispose();
        JOptionPane.showMessageDialog(this, "datos registrados correctamente");
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void txtnumproductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnumproductoKeyReleased
    
        txtnombreproducto.setEnabled(txtnumproducto.getText().length() != 0);   
    }//GEN-LAST:event_txtnumproductoKeyReleased

    private void txtnombreproductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombreproductoKeyReleased
        txtpiezaproducto.setEnabled(txtnombreproducto.getText().length() != 0);
    }//GEN-LAST:event_txtnombreproductoKeyReleased

    private void txtcostounitarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcostounitarioKeyReleased
        
        txtcaracteristicas.setEnabled(txtcostounitario.getText().length() != 0);
    }//GEN-LAST:event_txtcostounitarioKeyReleased

    private void txtcaracteristicasKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcaracteristicasKeyReleased
        btnAgregar.setEnabled(txtcostounitario.getText().length() != 0);
    }//GEN-LAST:event_txtcaracteristicasKeyReleased

    private void txtpiezaproductoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtpiezaproductoKeyReleased

        txtcostounitario.setEnabled(txtpiezaproducto.getText().length() != 0);
    }//GEN-LAST:event_txtpiezaproductoKeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtcaracteristicas;
    private javax.swing.JTextField txtcostounitario;
    private javax.swing.JTextField txtnombreproducto;
    private javax.swing.JTextField txtnumproducto;
    private javax.swing.JTextField txtpiezaproducto;
    // End of variables declaration//GEN-END:variables
}
