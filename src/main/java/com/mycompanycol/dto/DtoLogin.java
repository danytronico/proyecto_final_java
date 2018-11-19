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
public class DtoLogin {
    
    public String usuario;
    public String contraseña;

    public DtoLogin() {
    }

    public DtoLogin(String usuario, String contraseñañ) {
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseñañ() {
        return contraseña;
    }

    public void setContraseñañ(String contraseñañ) {
        this.contraseña = contraseña;
    }
            
            
}
