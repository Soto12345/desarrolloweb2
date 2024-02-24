
package com.mycompany.proyecto_poe;


import javax.swing.table.DefaultTableModel;


public class EliminarStock extends javax.swing.JInternalFrame {

    
    Colastock datos;
    public EliminarStock(Colastock datos) {
        initComponents();
        this.datos=datos;
        DefaultTableModel modelotodo=new DefaultTableModel();
        String[]cabecera={"NumProducto","nombre","Cant_stock","Costounitario","caracteristicas","Disponibilidad"};
        modelotodo.setColumnIdentifiers(cabecera);
       Stock aux=datos.cola;
        if(datos.cola==null){
    
        }else{
            while(aux!=null){
                modelotodo.addRow(new Object[]{aux.getNumproducto(),aux.getNombreproducto(), aux.getCantstock(),aux.getCosto_unitario(),aux.getCaracteristicas(),aux.getDisponibilidad()});
                aux=aux.getAptSiguiente();
            }    
        }
        jtabladatos.setModel(modelotodo);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtabladatos = new javax.swing.JTable();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnEliminarprimero = new javax.swing.JButton();

        jtabladatos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtabladatos);

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setText("ELIMINAR DATOS:");

        btnEliminarprimero.setText("Eliminar");
        btnEliminarprimero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarprimeroActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(btnEliminarprimero)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(39, 39, 39))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 460, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(187, 187, 187)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegresar)
                    .addComponent(btnEliminarprimero))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnEliminarprimeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarprimeroActionPerformed
       DefaultTableModel modelotodo=new DefaultTableModel();
        String[]cabecera={"NumProducto","nombre","Cant_stock","Costounitario","caracteristicas","Disponibilidad"};
        modelotodo.setColumnIdentifiers(cabecera);
        datos.desencolar();
       Stock aux=datos.cola;
        if(datos.cola==null){
            
        }else{
            while(aux!=null){
                modelotodo.addRow(new Object[]{aux.getNumproducto(),aux.getNombreproducto(), aux.getCantstock(),aux.getCosto_unitario(),aux.getCaracteristicas(),aux.getDisponibilidad()});
                aux=aux.getAptSiguiente();
            }    
        }
        jtabladatos.setModel(modelotodo);
    }//GEN-LAST:event_btnEliminarprimeroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarprimero;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabladatos;
    // End of variables declaration//GEN-END:variables
}
