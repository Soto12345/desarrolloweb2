
package com.mycompany.proyecto_poe;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class Ventas extends javax.swing.JInternalFrame {
  
    Pilacliente datoscliente;
    String vendedor;
    public Ventas(Pilacliente datoscliente,String vendedor) {
        initComponents();
        this.datoscliente=datoscliente;
        this.vendedor=vendedor;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jtabladatos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnSacarventa = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtresultados = new javax.swing.JTextArea();

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

        jLabel1.setText("VENTAS:");

        btnSacarventa.setText("Sacar venta");
        btnSacarventa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSacarventaActionPerformed(evt);
            }
        });

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        txtresultados.setColumns(20);
        txtresultados.setRows(5);
        jScrollPane2.setViewportView(txtresultados);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 521, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(btnSacarventa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(67, 67, 67))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(91, 91, 91)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 141, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSacarventa)
                    .addComponent(btnSalir))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnSacarventaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSacarventaActionPerformed
        
        DefaultTableModel modeloStock=new DefaultTableModel();
       String[]cabecera={"NumProducto","nombre","Cant_stock","Costounitario","caracteristicas","Disponibilidad"};
       modeloStock.setColumnIdentifiers(cabecera);
       
       Cliente aux=datoscliente.datocliente;
       boolean visto=false;
       if(datoscliente.datocliente==null){
           JOptionPane.showMessageDialog(this,"no hay Clientes.");
       }else{
            String respuesta=JOptionPane.showInputDialog(this,"escribe el nombre del cliente: ");
            while(aux!=null){
                
               if(respuesta.equals(aux.getNombre_cliente())){
                 visto=true;
                 txtresultados.append("----------------------------\n");
                 txtresultados.append("\nNombre del cliente: "+aux.getNombre_cliente()+"\n");
                 txtresultados.append("Forma de pago: "+aux.getForma_pago()+"\n");
                 txtresultados.append("Producto: "+aux.getProducto()+"\n");
                 txtresultados.append("Subtotal: "+aux.getPrecio()+"\n");
                 txtresultados.append("IVA: 16%\n");
                 double total=(aux.getPrecio()*.16)+aux.getPrecio();
                 txtresultados.append("Total: "+total+"\n");
                 txtresultados.append("lo Atendio: "+vendedor);
                 modeloStock.addRow(new Object[]{aux.getNombre_cliente(),aux.getForma_pago(),aux.getDomicilio(),aux.getNumCuenta(),aux.getProducto(),aux.getPrecio()});
               }
               
                aux=aux.getAptSiguientecliente();
            }
               jtabladatos.setModel(modeloStock);
             
            if(visto==false){
                JOptionPane.showMessageDialog(this,"no se encontro el cliente");
                DefaultTableModel modelotodo=new DefaultTableModel();
                modelotodo.setColumnIdentifiers(cabecera);
        if(datoscliente.datocliente==null){
            
        }else{
            while(aux!=null){
                modelotodo.addRow(new Object[]{aux.getNombre_cliente(),aux.getForma_pago(),aux.getDomicilio(),aux.getNumCuenta(),aux.getProducto(),aux.getPrecio()});
                aux=aux.getAptSiguientecliente();
            }    
        }
        jtabladatos.setModel(modelotodo);
            }
       }
    
    }//GEN-LAST:event_btnSacarventaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSacarventa;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jtabladatos;
    private javax.swing.JTextArea txtresultados;
    // End of variables declaration//GEN-END:variables
}
