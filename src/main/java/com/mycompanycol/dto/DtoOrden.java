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
public class DtoOrden {
    
    public int orden;
    public int idCliente;
    public int idUsuario;
    public String comentario;

    public DtoOrden(int orden, int idCliente, int idUsuario, String comentario) {
        this.orden = orden;
        this.idCliente = idCliente;
        this.idUsuario = idUsuario;
        this.comentario = comentario;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }
    
    
    
}
