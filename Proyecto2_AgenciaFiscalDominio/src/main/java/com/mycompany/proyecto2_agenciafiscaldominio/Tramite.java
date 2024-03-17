/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agenciafiscaldominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Oley
 */
@Entity
public class Tramite implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "tipoTramite", nullable = false, unique = false, length = 200)
    private String tipoTramite;
    @Column(name = "FechaRealizacion", nullable = false)
    private Date fechaRealizacion;
    @Column(name = "nombreSolicitante", nullable = false, unique = false, length = 200)
    private String nombreSolicitante;
    @Column(name = "costo", nullable = false)
    private float costo;

    public Tramite() {
    }

    public Tramite(String tipoTramite, Date fechaRealizacion, String nombreSolicitante, float costo) {
        this.tipoTramite = tipoTramite;
        this.fechaRealizacion = fechaRealizacion;
        this.nombreSolicitante = nombreSolicitante;
        this.costo = costo;
    }

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

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

}
