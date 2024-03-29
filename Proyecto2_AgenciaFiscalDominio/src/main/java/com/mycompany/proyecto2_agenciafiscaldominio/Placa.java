/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agenciafiscaldominio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Oley
 */
@Entity
@Table(name = "Placa")
@DiscriminatorValue(value="Placa")
@PrimaryKeyJoinColumn(name="idPlacas")
public class Placa extends Tramite implements Serializable {

  @Column(name="Numero_Placas")
    private String numeroPlacas;
    
    @Column(name="Estado",nullable =  false)
    private String estado;
    
    @Column(name="Fecha_inactivo")
    @Temporal(TemporalType.DATE)
    private Calendar fechaInactivo;
   
    @ManyToOne
    @JoinColumn(name = "idAutomovil")
    private Automovil automovil;

    public Placa() {
    }
 public Placa(String numeroPlacas, String estado , Automovil automovil, float Costo , Clientes cliente) {
        super(Costo,cliente);
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
