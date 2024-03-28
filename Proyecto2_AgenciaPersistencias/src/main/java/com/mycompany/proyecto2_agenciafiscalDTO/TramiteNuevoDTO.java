/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agenciafiscalDTO;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Oley
 */
public class TramiteNuevoDTO {

      private String tipoTramite;
    private Date fechaRealizacion;
    private String nombreSolicitante;

    // Constructor vacío
    public TramiteNuevoDTO() {
    }

    // Constructor con parámetros
    public TramiteNuevoDTO(String tipoTramite, Date fechaRealizacion, String nombreSolicitante) {
        this.tipoTramite = tipoTramite;
        this.fechaRealizacion = fechaRealizacion;
        this.nombreSolicitante = nombreSolicitante;
    }

    // Getters y setters
    public String getTipoTramite() {
        return tipoTramite;
    }

    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }

    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public String getNombreSolicitante() {
        return nombreSolicitante;
    }

    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }
  
     
}
