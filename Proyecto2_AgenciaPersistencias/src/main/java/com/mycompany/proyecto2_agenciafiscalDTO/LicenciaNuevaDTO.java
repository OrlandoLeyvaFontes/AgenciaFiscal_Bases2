/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agenciafiscalDTO;

import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Oley
 */
public class LicenciaNuevaDTO {

    private Calendar fehcaVencida;

    private Calendar fechaExpedi;
    private String vigencia;
    private Float Costo;

    public LicenciaNuevaDTO(Calendar fehcaVencida, Calendar fechaExpedi, String vigencia, Float Costo) {
        this.fehcaVencida = fehcaVencida;
        this.fechaExpedi = fechaExpedi;
        this.vigencia = vigencia;
        this.Costo = Costo;
    }

    public Calendar getFehcaVencida() {
        return fehcaVencida;
    }

    public void setFehcaVencida(Calendar fehcaVencida) {
        this.fehcaVencida = fehcaVencida;
    }

    public Calendar getFechaExpedi() {
        return fechaExpedi;
    }

    public void setFechaExpedi(Calendar fechaExpedi) {
        this.fechaExpedi = fechaExpedi;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public Float getCosto() {
        return Costo;
    }

    public void setCosto(Float Costo) {
        this.Costo = Costo;
    }

    public LicenciaNuevaDTO() {

    }

}
