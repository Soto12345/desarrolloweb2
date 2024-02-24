
package com.mycompany.proyecto_poe;

import javax.swing.table.DefaultTableModel;




public class CancelarPe extends javax.swing.JInternalFrame {

    Pilacliente datoscliente;
    public CancelarPe(Pilacliente datoscliente) {
        initComponents();
        this.datoscliente=datoscliente;
        DefaultTableModel modelotodo=new DefaultTableModel();
        String[]cabecera={"Nombre cliente:","-Forma pago:","Domicilio:","num cuenta:","producto","precio"};
        modelotodo.setColumnIdentifiers(cabecera);
       Cliente aux=datoscliente.datocliente;
        if(datoscliente.datocliente==null){
            
        }else{
            while(aux!=null){
                modelotodo.addRow(new Object[]{aux.getNombre_cliente(),aux.getForma_pago(),aux.getDomicilio(),aux.getNumCuenta(),aux.getProducto(),aux.getPrecio()});
                aux=aux.getAptSiguientecliente();
            }    
        }
        jtabladatos.setModel(modelotodo);
    }

        @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabladatos = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(535, 350));

        jLabel1.setText("CANCELAR PEDIDO:");

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

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 530, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(btnEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(56, 56, 56))
            .addGroup(layout.createSequentialGroup()
                .addGap(204, 204, 204)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addComponent(btnSalir))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
       
        datoscliente.pop();
       DefaultTableModel modelotodo=new DefaultTableModel();
        String[]cabecera={"Nombre cliente:","-Forma pago:","Domicilio:","num cuenta:","producto","precio"};
        modelotodo.setColumnIdentifiers(cabecera);
       Cliente aux=datoscliente.datocliente;
        if(datoscliente.datocliente==null){
            
        }else{
            while(aux!=null){
                modelotodo.addRow(new Object[]{aux.getNombre_cliente(),aux.getForma_pago(),aux.getDomicilio(),aux.getNumCuenta(),aux.getProducto(),aux.getPrecio()});
                aux=aux.getAptSiguientecliente();
            }    
        }
        jtabladatos.setModel(modelotodo);
    }//GEN-LAST:event_btnEliminarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabladatos;
    // End of variables declaration//GEN-END:variables
}
