
package com.mycompany.proyecto_poe;


public class AgregarPe extends javax.swing.JFrame {
    Colastock datos;
    Pilacliente datoscliente;
    public AgregarPe(Colastock datos,Pilacliente datoscliente) {
        initComponents();
        this.datos=datos;
        this.datoscliente=datoscliente;
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jdpEscritorio = new javax.swing.JDesktopPane();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDomicilio = new javax.swing.JTextField();
        rdTarjeta = new javax.swing.JRadioButton();
        rdContado = new javax.swing.JRadioButton();
        btnAgregar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpEscritorio.setBackground(new java.awt.Color(0, 153, 153));
        jdpEscritorio.setForeground(new java.awt.Color(204, 204, 204));

        jLabel5.setText("AGREGAR PEDIDO:");

        jLabel6.setText("Nombre Cliente:");

        jLabel7.setText("Domicilio:");

        jLabel8.setText("Metodo de pago:");

        buttonGroup1.add(rdTarjeta);
        rdTarjeta.setText("Tarjeta");

        buttonGroup1.add(rdContado);
        rdContado.setText("Contado");

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

        jdpEscritorio.setLayer(jLabel5, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(jLabel6, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(jLabel7, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(jLabel8, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(txtNombre, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(txtDomicilio, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(rdTarjeta, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(rdContado, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(btnAgregar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpEscritorio.setLayer(btnSalir, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addGroup(jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpEscritorioLayout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addGroup(jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                                .addGroup(jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtDomicilio, javax.swing.GroupLayout.DEFAULT_SIZE, 326, Short.MAX_VALUE)
                                    .addComponent(txtNombre)))
                            .addComponent(rdTarjeta)
                            .addComponent(rdContado)
                            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                                .addGroup(jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnAgregar)
                                    .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 208, Short.MAX_VALUE)
                                .addComponent(btnSalir)
                                .addGap(60, 60, 60))))
                    .addGroup(jdpEscritorioLayout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtDomicilio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdTarjeta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(rdContado)
                .addGap(28, 28, 28)
                .addGroup(jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAgregar)
                    .addComponent(btnSalir))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdpEscritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        this.dispose();
      
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed

      int numero=(int)(Math.random()*(100));
      String nombre_cliente=txtNombre.getText();
      String Domicilio=txtDomicilio.getText();
       
      if(rdTarjeta.isSelected()){
          String dato="Tarjeta";
          AgregarPe2 apedido2=new AgregarPe2(datos,datoscliente,nombre_cliente,Domicilio,dato,numero);
        jdpEscritorio.add(apedido2);
        apedido2.show();
      }else if(rdContado.isSelected()){
          String dato="Contado";
         AgregarPe2 apedido2=new AgregarPe2(datos,datoscliente,nombre_cliente,Domicilio,dato,numero);
        jdpEscritorio.add(apedido2);
        apedido2.show();
      }
      
    }//GEN-LAST:event_btnAgregarActionPerformed

    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
              
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnSalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    public static javax.swing.JDesktopPane jdpEscritorio;
    private javax.swing.JRadioButton rdContado;
    private javax.swing.JRadioButton rdTarjeta;
    private javax.swing.JTextField txtDomicilio;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
