/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanycol.dto;

/**
 *
 * @author desarrollo4
 */
public class DtoDetalle {
    
   public int no;
   public String idProducto;
   public int cantidad;
   public double precio;
   public double costo;
   public double itbis;
   
     public DtoDetalle(int no, String idProducto, int cantidad, double precio, double costo, double itbis) {
        this.no = no;
        this.idProducto = idProducto;
        this.cantidad = cantidad;
        this.precio = precio;
        this.costo = costo;
        this.itbis = itbis;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(String idProducto) {
        this.idProducto = idProducto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getItbis() {
        return itbis;
    }

    public void setItbis(double itbis) {
        this.itbis = itbis;
    }
     
     
   
   
}
