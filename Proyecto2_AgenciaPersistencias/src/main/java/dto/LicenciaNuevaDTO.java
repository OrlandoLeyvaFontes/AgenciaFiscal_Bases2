/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import entidades_JPA.Clientes;
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
 private Calendar fechaVencida;
    private Calendar fechaExpedi;
    private String vigencia;
    private Float costo;

    // Constructor vacío
    public LicenciaNuevaDTO() {
    }

    // Constructor con parámetros
    public LicenciaNuevaDTO(Calendar fechaVencida, Calendar fechaExpedi, String vigencia, Float costo) {
        this.fechaVencida = fechaVencida;
        this.fechaExpedi = fechaExpedi;
        this.vigencia = vigencia;
        this.costo = costo;
    }

    // Getters y setters
    public Calendar getFechaVencida() {
        return fechaVencida;
    }

    public void setFechaVencida(Calendar fechaVencida) {
        this.fechaVencida = fechaVencida;
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
        return costo;
    }

    public void setCosto(Float costo) {
        this.costo = costo;
    }


}
