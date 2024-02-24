
package com.mycompany.proyecto_poe;


public class Stock {
    private int Numproducto;
    private String Nombreproducto;
    private int Cantstock;
    private float Costo_unitario;
    private String Caracteristicas;
    private String Disponibilidad;
    private Stock aptSiguiente;

    public Stock(int Numproducto, String Nombreproducto, int Cantstock, float Costo_unitario, String Caracteristicas, String Disponibilidad, Stock aptSiguiente) {
        this.Numproducto = Numproducto;
        this.Nombreproducto = Nombreproducto;
        this.Cantstock = Cantstock;
        this.Costo_unitario = Costo_unitario;
        this.Caracteristicas = Caracteristicas;
        this.Disponibilidad = Disponibilidad;
        this.aptSiguiente = aptSiguiente;
    }
    
    public Stock(int Numproducto, String Nombreproducto, int Cantstock, float Costo_unitario, String Caracteristicas, String Disponibilidad) {
        this.Numproducto = Numproducto;
        this.Nombreproducto = Nombreproducto;
        this.Cantstock = Cantstock;
        this.Costo_unitario = Costo_unitario;
        this.Caracteristicas = Caracteristicas;
        this.Disponibilidad = Disponibilidad;
        this.aptSiguiente = null;
    }
    
    public Stock() {
        this.Numproducto = 0;
        this.Nombreproducto = null;
        this.Cantstock = 0;
        this.Costo_unitario = 0;
        this.Caracteristicas = null;
        this.Disponibilidad = null;
        this.aptSiguiente = null;
    }

    public int getNumproducto() {
        return Numproducto;
    }

    public void setNumproducto(int Numproducto) {
        this.Numproducto = Numproducto;
    }

    public String getNombreproducto() {
        return Nombreproducto;
    }

    public void setNombreproducto(String Nombreproducto) {
        this.Nombreproducto = Nombreproducto;
    }

    public int getCantstock() {
        return Cantstock;
    }

    public void setCantstock(int Cantstock) {
        this.Cantstock = Cantstock;
    }

    public float getCosto_unitario() {
        return Costo_unitario;
    }

    public void setCosto_unitario(float Costo_unitario) {
        this.Costo_unitario = Costo_unitario;
    }

    public String getCaracteristicas() {
        return Caracteristicas;
    }

    public void setCaracteristicas(String Caracteristicas) {
        this.Caracteristicas = Caracteristicas;
    }

    public String getDisponibilidad() {
        return Disponibilidad;
    }

    public void setDisponibilidad(String Disponibilidad) {
        this.Disponibilidad = Disponibilidad;
    }

    public Stock getAptSiguiente() {
        return aptSiguiente;
    }

    public void setAptSiguiente(Stock aptSiguiente) {
        this.aptSiguiente = aptSiguiente;
    }
    
    
    
    
}
