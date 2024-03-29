/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agenciafiscalDTO;

import com.mycompany.proyecto2_agenciafiscaldominio.Automovil;
import com.mycompany.proyecto2_agenciafiscaldominio.Clientes;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Oley
 */
public class PlacaNuevoDTO {
  
       private String numeroPlacas;
    private String estado;
    private Calendar fechaInactivo;
    private Automovil automovil;

    public PlacaNuevoDTO() {
    }

   public PlacaNuevoDTO(String numeroPlacas, String estado, Automovil automovil, float costo, Clientes cliente) {
    this.numeroPlacas = numeroPlacas;
    this.estado = estado;
    this.automovil = automovil;
}

    public String getNumeroPlacas() {
        return numeroPlacas;
    }

    public void setNumeroPlacas(String numeroPlacas) {
        this.numeroPlacas = numeroPlacas;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Calendar getFechaInactivio() {
        return fechaInactivo;
    }

    public void setFechaInactivio(Calendar fechaInactivo) {
        this.fechaInactivo = fechaInactivo;
    }

    public Automovil getAutomovil() {
        return automovil;
    }

    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }

   
}
