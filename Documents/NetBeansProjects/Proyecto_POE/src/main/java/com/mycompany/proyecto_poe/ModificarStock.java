
package com.mycompany.proyecto_poe;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ModificarStock extends javax.swing.JInternalFrame {

    Colastock datos;
    public ModificarStock(Colastock datos) {
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
        btnmodificar = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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

        btnmodificar.setText("Modificar");
        btnmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmodificarActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jLabel1.setText("DATOS A MODIFICAR: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnmodificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addGap(40, 40, 40))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(7, 7, 7)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegresar)
                    .addComponent(btnmodificar))
                .addGap(0, 39, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       this.dispose();
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmodificarActionPerformed

    DefaultTableModel modeloStock=new DefaultTableModel();
       String[]cabecera={"NumProducto","nombre","Cant_stock","Costounitario","caracteristicas","Disponibilidad"};
       modeloStock.setColumnIdentifiers(cabecera);
       
       Stock aux=datos.cola;
       boolean visto=false;
       if(datos.cola==null){
           JOptionPane.showMessageDialog(this,"no hay stock.");
       }else{
            String respuesta=JOptionPane.showInputDialog(this,"numero producto:");
            int r=Integer.parseInt(respuesta);
            while(aux!=null){
                
               if(r==aux.getNumproducto()){
                 
                 visto=true;
                 String cant=JOptionPane.showInputDialog(this,"cantidad stock nueva:");
                 int c=Integer.parseInt(cant);
                 String precio=JOptionPane.showInputDialog(this,"precio nuevo:");
                 int p=Integer.parseInt(precio);
                 aux.setCantstock(c);
                 aux.setCosto_unitario(p);
               }
               modeloStock.addRow(new Object[]{aux.getNumproducto(),aux.getNombreproducto(), aux.getCantstock(),aux.getCosto_unitario(),aux.getCaracteristicas(),aux.getDisponibilidad()});
                jtabladatos.setModel(modeloStock);
                aux=aux.getAptSiguiente();
            }
            
              
             
            if(visto==false){
                JOptionPane.showMessageDialog(this,"no se encontro el producto");
            }
       }
    }//GEN-LAST:event_btnmodificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnModificar1;
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabladatos;
    // End of variables declaration//GEN-END:variables
}
