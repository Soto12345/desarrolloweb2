

package com.mycompany.proyecto_poe;

import com.sun.tools.javac.Main;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Proyecto_POE {

    public static void main(String[] args) {
        Splash r=new Splash();
        r.setVisible(true);
        //cuando la barra se llene
        //se espera 5 segundos y se quita el splash para inicializar la siguiente ventana
        try{
            Thread.sleep(5000);
        }catch(InterruptedException ex){
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE,null,ex);
        }
        
        r.dispose();
        
        frmIngreso ingreso=new frmIngreso();
        ingreso.setVisible(true);
    }
}
