
package com.mycompany.proyecto_poe;

import javax.swing.JOptionPane;


public class Pilacliente {
    Cliente datocliente;
    public Pilacliente(){
        datocliente=null;
    }
    public void push( String nombre_cliente,String forma_pago,String domicilio,int numCuenta,String producto,float precio)
   {
 Cliente nuevo=new Cliente(nombre_cliente,forma_pago,domicilio,numCuenta,producto,precio);
 if (datocliente==null){
     datocliente=nuevo;

 }else
 {
     Cliente aux=datocliente;
     datocliente=nuevo;
     
     nuevo.setAptSiguientecliente(aux);
     
 }
}
    
    public void pop(){
    Cliente aux=datocliente;
    if(datocliente==null){
        System.out.println("no hay clientes");
    }else{
      if(aux.getAptSiguientecliente()==null){
          datocliente=null;
           JOptionPane.showMessageDialog(null, "Todos los datos han sido borrados");
      }else{
        datocliente=aux.getAptSiguientecliente();
      }
      
    }
    
}
}
