package com.mycompany.proyecto_poe;


public class Cliente {
    private String nombre_cliente;
    private String forma_pago;
    private String domicilio;
    private int numCuenta;
    private String producto;
    private float precio;
    private Cliente aptSiguientecliente;

    public Cliente(String nombre_cliente, String forma_pago, String domicilio, int numCuenta,String producto,float precio,Cliente aptSiguientecliente) {
        this.nombre_cliente = nombre_cliente;
        this.forma_pago = forma_pago;
        this.domicilio = domicilio;
        this.numCuenta = numCuenta;
        this.producto=producto;
        this.precio=precio;
        this.aptSiguientecliente = aptSiguientecliente;
    }
    
    public Cliente() {
        this.nombre_cliente = null;
        this.forma_pago = null;
        this.domicilio = null;
        this.numCuenta = 0;
        this.producto=null;
        this.precio=0;
        this.aptSiguientecliente = null;
    }
    
     public Cliente(String nombre_cliente, String forma_pago, String domicilio, int numCuenta,String producto,float precio) {
        this.nombre_cliente = nombre_cliente;
        this.forma_pago = forma_pago;
        this.domicilio = domicilio;
        this.numCuenta = numCuenta;
        this.producto=producto;
        this.precio=precio;
        this.aptSiguientecliente = null;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getForma_pago() {
        return forma_pago;
    }

    public void setForma_pago(String forma_pago) {
        this.forma_pago = forma_pago;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(int numCuenta) {
        this.numCuenta = numCuenta;
    }

    public Cliente getAptSiguientecliente() {
        return aptSiguientecliente;
    }

    public void setAptSiguientecliente(Cliente aptSiguientecliente) {
        this.aptSiguientecliente = aptSiguientecliente;
    }

    public String getProducto() {
        return producto;
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
}
