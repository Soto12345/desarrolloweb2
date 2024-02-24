
package com.mycompany.proyecto_poe;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class AgregarPe2 extends javax.swing.JInternalFrame {

    Colastock datos;
    Pilacliente datoscliente;
    String nombre_cliente;
    String Domicilio;
    String dato;
    int numero;
    public AgregarPe2(Colastock datos,Pilacliente datoscliente,String nombre_cliente,String Domicilio,String dato,int numero) {
        initComponents();
        this.datos=datos;
        this.datoscliente=datoscliente;
        this.dato=dato;
        this.nombre_cliente=nombre_cliente;
        this.Domicilio=Domicilio;
        this.numero=numero;
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

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabladatos = new javax.swing.JTable();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        jLabel1.setText("PRODUCTOS:");

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

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
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
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(btnAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnSalir))
                .addContainerGap(50, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

      DefaultTableModel modeloStock=new DefaultTableModel();
       String[]cabecera={"NumProducto","nombre","Cant_stock","Costounitario","caracteristicas","Disponibilidad"};
       modeloStock.setColumnIdentifiers(cabecera);
       
       Stock aux=datos.cola;
       boolean visto=false;
       if(datos.cola==null){
           JOptionPane.showMessageDialog(this,"no hay stock.");
       }else{
            String respuesta=JOptionPane.showInputDialog(this,"escribe el nombre del producto que quieres:");
            while(aux!=null){
                
               if(respuesta.equals(aux.getNombreproducto())){
                 visto=true;
                 modeloStock.addRow(new Object[]{aux.getNumproducto(),aux.getNombreproducto(), aux.getCantstock(),aux.getCosto_unitario(),aux.getCaracteristicas(),aux.getDisponibilidad()});
                 datoscliente.push(nombre_cliente, dato, Domicilio, numero,aux.getNombreproducto(),aux.getCosto_unitario());
                 JOptionPane.showMessageDialog(this, "se ha registrado el pedido exitosamente");
                 this.dispose();
               }
               
                aux=aux.getAptSiguiente();
            }
               jtabladatos.setModel(modeloStock);
             
            if(visto==false){
                JOptionPane.showMessageDialog(this,"no se encontro el producto");
                DefaultTableModel modelotodo=new DefaultTableModel();
                modelotodo.setColumnIdentifiers(cabecera);
        if(datos.cola==null){
            
        }else{
            while(aux!=null){
                modelotodo.addRow(new Object[]{aux.getNumproducto(),aux.getNombreproducto(), aux.getCantstock(),aux.getCosto_unitario(),aux.getCaracteristicas(),aux.getDisponibilidad()});
                aux=aux.getAptSiguiente();
            }    
        }
        jtabladatos.setModel(modelotodo);
            }
       }
    }//GEN-LAST:event_btnAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtabladatos;
    // End of variables declaration//GEN-END:variables
}
