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
 * Clase de LicenciaNuevaDTO
 * @author Oley
 */
public class LicenciaNuevaDTO {
 private Calendar fechaVencida;
    private Calendar fechaExpedi;
    private String vigencia;
    private Float costo;

    // Constructor vacío
    /**
     * Constructor Vacio
     */
    public LicenciaNuevaDTO() {
    }

    // Constructor con parámetros
    /**
     * Constructor con parametros
     * @param fechaVencida Fecha vencida
     * @param fechaExpedi Fecha expedicion
     * @param vigencia Vigencia
     * @param costo Costo
     */
    public LicenciaNuevaDTO(Calendar fechaVencida, Calendar fechaExpedi, String vigencia, Float costo) {
        this.fechaVencida = fechaVencida;
        this.fechaExpedi = fechaExpedi;
        this.vigencia = vigencia;
        this.costo = costo;
    }

    // Getters y setters
    /**
     * Obtiene Fecha vencida
     * @return Fecha vencida
     */
    public Calendar getFechaVencida() {
        return fechaVencida;
    }
    /**
     * Agrega Fecha vencida
     * @param fechaVencida Fecha vencida
     */
    public void setFechaVencida(Calendar fechaVencida) {
        this.fechaVencida = fechaVencida;
    }
    /**
     * Obtiene Fecha expedicion
     * @return Fecha expedicion
     */
    public Calendar getFechaExpedi() {
        return fechaExpedi;
    }
    /**
     * Agrega Fecha expedicion
     * @param fechaExpedi fecha expedicion
     */
    public void setFechaExpedi(Calendar fechaExpedi) {
        this.fechaExpedi = fechaExpedi;
    }
    /**
     * Obtiene Vigencia
     * @return Vigencia
     */
    public String getVigencia() {
        return vigencia;
    }
    /**
     * Agrega Vigencia
     * @param vigencia Vigencia
     */
    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }
    /**
     * Obtiene Costo
     * @return Costo
     */
    public Float getCosto() {
        return costo;
    }
    /**
     * Agrega Costo
     * @param costo Costo
     */
    public void setCosto(Float costo) {
        this.costo = costo;
    }


}
