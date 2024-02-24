
package com.mycompany.proyecto_poe;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BuscarStock extends javax.swing.JInternalFrame {

    Colastock datos;
    public BuscarStock(Colastock datos) {
        initComponents();
        this.datos=datos;
       DefaultTableModel modelostock=new DefaultTableModel();
        String[]cabecera={"NumProducto","nombre","Cant_stock","Costounitario","caracteristicas","Disponibilidad"};
        modelostock.setColumnIdentifiers(cabecera);
        jtabladatos.setModel(modelostock);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtabladatos = new javax.swing.JTable();
        mensajebusqueda = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        btnMostrar = new javax.swing.JButton();

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

        mensajebusqueda.setText("BUSQUEDAS:");

        jButton2.setText("Regresar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnMostrar.setText("Mostrar");
        btnMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMostrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 499, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(btnBuscar)
                .addGap(94, 94, 94)
                .addComponent(btnMostrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(51, 51, 51))
            .addGroup(layout.createSequentialGroup()
                .addGap(207, 207, 207)
                .addComponent(mensajebusqueda)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(mensajebusqueda)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(btnBuscar)
                    .addComponent(btnMostrar))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
       DefaultTableModel modeloStock=new DefaultTableModel();
       String[]cabecera={"NumProducto","nombre","Cant_stock","Costounitario","caracteristicas","Disponibilidad"};
       modeloStock.setColumnIdentifiers(cabecera);
       
       Stock aux=datos.cola;
       boolean visto=false;
       if(datos.cola==null){
           JOptionPane.showMessageDialog(this,"no hay stock.");
       }else{
            String respuesta=JOptionPane.showInputDialog(this,"Nombre:");
            while(aux!=null){
                
               if(respuesta.equals(aux.getNombreproducto())){
                 visto=true;
                 modeloStock.addRow(new Object[]{aux.getNumproducto(),aux.getNombreproducto(), aux.getCantstock(),aux.getCosto_unitario(),aux.getCaracteristicas(),aux.getDisponibilidad()});
               
               }
               
                aux=aux.getAptSiguiente();
            }
             mensajebusqueda.setText("BUSQUEDA CON COINCIDENCIA: ");
               jtabladatos.setModel(modeloStock);
             
            if(visto==false){
                JOptionPane.showMessageDialog(this,"no se encontro el producto");
            }
       }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMostrarActionPerformed
        
        DefaultTableModel modelotodo=new DefaultTableModel();
        String[]cabecera={"NumProducto","nombre","Cant_stock","Costounitario","caracteristicas","Disponibilidad"};
        modelotodo.setColumnIdentifiers(cabecera);
       Stock aux=datos.cola;
        if(datos.cola==null){
            JOptionPane.showMessageDialog(null, "no hay stock");
       
        }else{
            while(aux!=null){
                modelotodo.addRow(new Object[]{aux.getNumproducto(),aux.getNombreproducto(), aux.getCantstock(),aux.getCosto_unitario(),aux.getCaracteristicas(),aux.getDisponibilidad()});
                aux=aux.getAptSiguiente();
                mensajebusqueda.setText("TODOS LOS DATOS:");
            }    
        }
        jtabladatos.setModel(modelotodo);
    }//GEN-LAST:event_btnMostrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnMostrar;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabladatos;
    private javax.swing.JLabel mensajebusqueda;
    // End of variables declaration//GEN-END:variables
}
