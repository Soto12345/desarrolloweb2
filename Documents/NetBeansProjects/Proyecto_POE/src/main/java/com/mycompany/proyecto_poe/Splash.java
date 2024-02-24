 

package com.mycompany.proyecto_poe;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.Timer;


public class Splash extends javax.swing.JFrame {

   
    public Splash(){
        initComponents();
      
        //aqui se agrega la imagen principal del menu
        //definiendo un objeto con la ruta archivo
        ImageIcon imagenIconprincipal=new ImageIcon("src/main/java/Imagenes/imagen_splash.JPG");
        //transformar imagen
        Image imagenprincipal=imagenIconprincipal.getImage();
        //escalar la imagen a un tamaño personalizado (250x250)
        Image imagenescaladaImageprincipal=imagenprincipal.getScaledInstance(400, 250, java.awt.Image.SCALE_SMOOTH);
        //actualizar imagen de icono
        imagenIconprincipal=new ImageIcon(imagenescaladaImageprincipal);
        //asignar etiqueta
        txtimagen.setIcon(imagenIconprincipal);
       barraProgreso();
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtimagen = new javax.swing.JLabel();
        txtmensaje = new javax.swing.JLabel();
        barraprogreso = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(179, 228, 235));
        setForeground(new java.awt.Color(51, 0, 255));
        setUndecorated(true);

        txtmensaje.setFont(new java.awt.Font("Microsoft Sans Serif", 0, 12)); // NOI18N
        txtmensaje.setText("conectando...");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtmensaje)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(barraprogreso, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(txtimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(3, 3, 3)
                .addComponent(txtmensaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(barraprogreso, javax.swing.GroupLayout.DEFAULT_SIZE, 21, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void barraProgreso(){
        Timer timer=new Timer(45,(ActionEvent e)->{
            barraprogreso.setValue(barraprogreso.getValue()+1);
            barraprogreso.setBackground(Color.orange);
            barraprogreso.setStringPainted(true);
 
            if(barraprogreso.getValue()==30){
                txtmensaje.setText("generando paquetes...");
            }else if(barraprogreso.getValue()==70){
                txtmensaje.setText("cargando paquetes...");
            }else if(barraprogreso.getValue()==90){
                 txtmensaje.setText("inicializando...");
            }
            
            
        });
        timer.start();
    }
    
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Splash().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar barraprogreso;
    private javax.swing.JLabel txtimagen;
    private javax.swing.JLabel txtmensaje;
    // End of variables declaration//GEN-END:variables

}
