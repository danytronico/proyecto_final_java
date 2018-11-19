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
public class DtoCliente {
    
     public int id;
     public String cliente;
     public String direccion;

    public DtoCliente(int id, String cliente, String direccion) {
        this.id = id;
        this.cliente = cliente;
        this.direccion = direccion;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public DtoCliente() {
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
     
     
    
    
}
