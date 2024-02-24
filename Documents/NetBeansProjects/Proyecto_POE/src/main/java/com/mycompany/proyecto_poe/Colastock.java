
package com.mycompany.proyecto_poe;

import javax.swing.JOptionPane;


public class Colastock {
    
    public Stock cola;
    
    public Colastock(){
        cola=null;
    }
    
     public void encolar(int Nump,String Nomp,int Cs,float Cu,String Carac,String Disp){
        Stock nuevo=new Stock(Nump,Nomp,Cs,Cu,Carac,Disp);
        
        if(cola==null){
            cola=nuevo;
        }else{
            Stock aux=cola;
            
            
            while(aux.getAptSiguiente()!=null){
                aux=aux.getAptSiguiente();
            }
            aux.setAptSiguiente(nuevo);
        }
    }
     
     public void desencolar(){
        Stock aux=cola;
    if(cola==null){
        JOptionPane.showMessageDialog(null, "No hay stock");
    }else{
      if(aux.getAptSiguiente()==null){
          cola=null;
          JOptionPane.showMessageDialog(null, "Todos los datos han sido borrados correctamente");
      }else{
        cola=aux.getAptSiguiente();
      }  
    }
    
    }
     
   
}

