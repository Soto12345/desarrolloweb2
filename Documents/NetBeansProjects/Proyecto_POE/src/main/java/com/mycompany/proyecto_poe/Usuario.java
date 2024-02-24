
package com.mycompany.proyecto_poe;


public class Usuario {
    private String Usuario;
    private String Contraseña;

    public Usuario(String Usuario, String Contraseña) {
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
    }
    
    public Usuario() {
        this.Usuario = null;
        this.Contraseña = null;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }
    
    
}
