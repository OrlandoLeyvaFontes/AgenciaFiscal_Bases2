/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Oley
 */
/**
 * Esta clase representa un DTO (objeto de transferencia de datos) para un nuevo
 * trámite.
 *
 * Un DTO se utiliza para transferir datos entre el cliente y el servidor.
 */
public class TramiteNuevoDTO {

    /**
     * Tipo de trámite.
     */
    private String tipoTramite;

    /**
     * Fecha en que se realizó el trámite.
     */
    private Date fechaRealizacion;

    /**
     * Nombre del solicitante del trámite.
     */
    private String nombreSolicitante;

    /**
     * Constructor vacío de la clase TramiteNuevoDTO.
     */
    public TramiteNuevoDTO() {
    }

    /**
     * Constructor de la clase TramiteNuevoDTO con parámetros.
     *
     * @param tipoTramite Tipo de trámite.
     * @param fechaRealizacion Fecha en que se realizó el trámite.
     * @param nombreSolicitante Nombre del solicitante del trámite.
     */
    public TramiteNuevoDTO(String tipoTramite, Date fechaRealizacion, String nombreSolicitante) {
        this.tipoTramite = tipoTramite;
        this.fechaRealizacion = fechaRealizacion;
        this.nombreSolicitante = nombreSolicitante;
    }

    // Getters y setters
    /**
     * Obtiene Tipo
     * @return Tipo
     */
    public String getTipoTramite() {
        return tipoTramite;
    }
    /**
     * Agrega Tipo
     * @param tipoTramite Tipo
     */
    public void setTipoTramite(String tipoTramite) {
        this.tipoTramite = tipoTramite;
    }
    /**
     * Obtiene Fecha
     * @return Fecha
     */
    public Date getFechaRealizacion() {
        return fechaRealizacion;
    }
    /**
     * Agrega Fecha
     * @param fechaRealizacion Fecha
     */
    public void setFechaRealizacion(Date fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }
    /**
     * Obtiene Nombre
     * @return Nombre
     */
    public String getNombreSolicitante() {
        return nombreSolicitante;
    }
    /**
     * Agrega Nombre
     * @param nombreSolicitante Nombre
     */
    public void setNombreSolicitante(String nombreSolicitante) {
        this.nombreSolicitante = nombreSolicitante;
    }

}
