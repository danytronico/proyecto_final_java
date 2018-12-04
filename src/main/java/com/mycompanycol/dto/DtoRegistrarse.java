/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompanycol.dto;

import java.util.Date;


/**
 *
 * @author Daniel
 */
public class DtoRegistrarse {
  
    public String usuario;
    public String clave;
    public boolean activo;
    

    public DtoRegistrarse(String usuario, String clave, boolean activo) {
        this.usuario = usuario;
        this.clave = clave;
        this.activo = activo;
    }
    
    public DtoRegistrarse() {
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    
    
    
}
