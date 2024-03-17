/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agenciafiscalDTO;

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
  
    private String numeroAlfaNumerico;
    private Date fechaEmision;
    private Date fechaRecepcion;
    private float costo;

    public PlacaNuevoDTO() {
    }

    public PlacaNuevoDTO(String numeroAlfaNumerico, Date fechaEmision, Date fechaRecepcion, float costo) {
        this.numeroAlfaNumerico = numeroAlfaNumerico;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
        this.costo = costo;
    }

    public String getNumeroAlfaNumerico() {
        return numeroAlfaNumerico;
    }

    public void setNumeroAlfaNumerico(String numeroAlfaNumerico) {
        this.numeroAlfaNumerico = numeroAlfaNumerico;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

   
}
