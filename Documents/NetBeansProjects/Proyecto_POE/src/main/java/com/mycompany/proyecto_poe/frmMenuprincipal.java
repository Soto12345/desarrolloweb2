
package com.mycompany.proyecto_poe;

import javax.swing.JOptionPane;

public class frmMenuprincipal extends javax.swing.JFrame {

    Colastock datos=new Colastock();
    Pilacliente datoscliente=new Pilacliente();
    public frmMenuprincipal(String u) {
        initComponents();
        txtUsuario.setText(u);
        txtUsuario.setEnabled(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpEscritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();
        btnRegresar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jmiNuevo = new javax.swing.JMenuItem();
        jmiBuscarStock = new javax.swing.JMenuItem();
        jmiModificar = new javax.swing.JMenuItem();
        jmiEliminar = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jmiAgregarpedido = new javax.swing.JMenuItem();
        jmiCancelar = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        jmiVentas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setSize(new java.awt.Dimension(560, 404));

        jdpEscritorio.setBackground(new java.awt.Color(0, 153, 153));
        jdpEscritorio.setForeground(new java.awt.Color(204, 204, 204));
        jdpEscritorio.setPreferredSize(new java.awt.Dimension(535, 373));

        jLabel1.setText("MENU PRINCIPAL:");

        jLabel2.setText("USUARIO:");

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        btnRegresar.setText("Regresar");
        btnRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarActionPerformed(evt);
            }
        });

        jdpEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(txtUsuario, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(btnSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(btnRegresar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpEscritorioLayout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addComponent(btnRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnSalir)
                .addGap(89, 89, 89))
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addGroup(jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpEscritorioLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2)
                        .addGap(91, 91, 91)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jdpEscritorioLayout.createSequentialGroup()
                        .addGap(214, 214, 214)
                        .addComponent(jLabel1)))
                .addContainerGap(141, Short.MAX_VALUE))
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(12, 12, 12)
                .addGroup(jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 241, Short.MAX_VALUE)
                .addGroup(jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSalir)
                    .addComponent(btnRegresar))
                .addGap(84, 84, 84))
        );

        jMenu1.setText("Stock");

        jMenu2.setText("Agregar");

        jmiNuevo.setText("Nuevo producto");
        jmiNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevoActionPerformed(evt);
            }
        });
        jMenu2.add(jmiNuevo);

        jMenu1.add(jMenu2);

        jmiBuscarStock.setText("Buscar y Mostrar");
        jmiBuscarStock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiBuscarStockActionPerformed(evt);
            }
        });
        jMenu1.add(jmiBuscarStock);

        jmiModificar.setText("Modificar");
        jmiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiModificar);

        jmiEliminar.setText("Eliminar");
        jmiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarActionPerformed(evt);
            }
        });
        jMenu1.add(jmiEliminar);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Pedido");

        jmiAgregarpedido.setText("Agregar pedido");
        jmiAgregarpedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAgregarpedidoActionPerformed(evt);
            }
        });
        jMenu3.add(jmiAgregarpedido);

        jmiCancelar.setText("Cancelar pedido");
        jmiCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCancelarActionPerformed(evt);
            }
        });
        jMenu3.add(jmiCancelar);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Venta");

        jmiVentas.setText("Ventas");
        jmiVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiVentasActionPerformed(evt);
            }
        });
        jMenu4.add(jmiVentas);

        jMenuBar1.add(jMenu4);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmiNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevoActionPerformed
        AgregarStock agregar=new AgregarStock(datos);
        jdpEscritorio.add(agregar);
        agregar.show();
    }//GEN-LAST:event_jmiNuevoActionPerformed

    private void btnRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarActionPerformed
       
        this.dispose();
        frmIngreso r=new frmIngreso();
        r.setVisible(true);
    }//GEN-LAST:event_btnRegresarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
       int j=JOptionPane.showConfirmDialog(this, "seguro que quieres salir del programa?");
       if(j==0){
           System.exit(0);
       }
        
    }//GEN-LAST:event_btnSalirActionPerformed

    private void jmiBuscarStockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiBuscarStockActionPerformed
      
        BuscarStock buscar=new BuscarStock(datos);
        jdpEscritorio.add(buscar);
        buscar.show();
        
    }//GEN-LAST:event_jmiBuscarStockActionPerformed

    private void jmiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarActionPerformed
        
        ModificarStock modificar=new ModificarStock(datos);
        jdpEscritorio.add(modificar);
        modificar.show();
    }//GEN-LAST:event_jmiModificarActionPerformed

    private void jmiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarActionPerformed
        EliminarStock eliminar=new EliminarStock(datos);
        jdpEscritorio.add(eliminar);
        eliminar.show();
        
    }//GEN-LAST:event_jmiEliminarActionPerformed

    private void jmiAgregarpedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAgregarpedidoActionPerformed
        AgregarPe apedido=new AgregarPe(datos,datoscliente);
       apedido.setVisible(true);
        
    }//GEN-LAST:event_jmiAgregarpedidoActionPerformed

    private void jmiCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCancelarActionPerformed
        CancelarPe cancelar=new CancelarPe(datoscliente);
        jdpEscritorio.add(cancelar);
        cancelar.show();
    }//GEN-LAST:event_jmiCancelarActionPerformed

    private void jmiVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiVentasActionPerformed
        String vendedor=txtUsuario.getText();
        Ventas v=new Ventas(datoscliente,vendedor);
        jdpEscritorio.add(v);
        v.show();
    }//GEN-LAST:event_jmiVentasActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              //  new frmMenuprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JDesktopPane jdpEscritorio;
    private javax.swing.JMenuItem jmiAgregarpedido;
    private javax.swing.JMenuItem jmiBuscarStock;
    private javax.swing.JMenuItem jmiCancelar;
    private javax.swing.JMenuItem jmiEliminar;
    private javax.swing.JMenuItem jmiModificar;
    private javax.swing.JMenuItem jmiNuevo;
    private javax.swing.JMenuItem jmiVentas;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
