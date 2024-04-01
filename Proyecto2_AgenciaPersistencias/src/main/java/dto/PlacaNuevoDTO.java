/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import entidades_JPA.Automovil;
import entidades_JPA.Clientes;
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
/**
 * Esta clase representa un DTO (objeto de transferencia de datos) para una nueva placa.
 * 
 * Un DTO se utiliza para transferir datos entre el cliente y el servidor.
 */
public class PlacaNuevoDTO {
  
    /**
     * Número de placas.
     */
    private String numeroPlacas;
    
    /**
     * Estado de la placa.
     */
    private String estado;
    
    /**
     * Fecha en que la placa se volvió inactiva.
     */
    private Calendar fechaInactivo;
    
    /**
     * Automóvil asociado a la placa.
     */
    private Automovil automovil;

    /**
     * Constructor vacío de la clase PlacaNuevoDTO.
     */
    public PlacaNuevoDTO() {
    }

    /**
     * Constructor de la clase PlacaNuevoDTO con parámetros.
     * 
     * @param numeroPlacas Número de placas.
     * @param estado Estado de la placa.
     * @param automovil Automóvil asociado a la placa.
     * @param costo Costo del trámite de la placa.
     * @param cliente Cliente asociado al trámite de la placa.
     */
    public PlacaNuevoDTO(String numeroPlacas, String estado, Automovil automovil, float costo, Clientes cliente) {
        this.numeroPlacas = numeroPlacas;
        this.estado = estado;
        this.automovil = automovil;
    }
    /**
     * Obtiene Numero alfanumerico
     * @return Numero alfanumerico
     */
    public String getNumeroPlacas() {
        return numeroPlacas;
    }
    /**
     * Agrega Numero alfanumerico
     * @param numeroPlacas Numero alfanumerico
     */
    public void setNumeroPlacas(String numeroPlacas) {
        this.numeroPlacas = numeroPlacas;
    }
    /**
     * Obtiene Estado
     * @return Estado
     */
    public String getEstado() {
        return estado;
    }
    /**
     * Agrega Estado
     * @param estado Estado
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * Obtiene Fecha de desactivacion
     * @return Fecha de desactivacion
     */
    public Calendar getFechaInactivo() {
        return fechaInactivo;
    }
    /**
     * Agrega Fecha de desactivacion
     * @param fechaInactivo Fecha de desactivacion
     */
    public void setFechaInactivo(Calendar fechaInactivo) {
        this.fechaInactivo = fechaInactivo;
    }
    /**
     * Obtiene Automovil
     * @return Automovil
     */
    public Automovil getAutomovil() {
        return automovil;
    }
    /**
     * Agrega Automovil
     * @param automovil Automovil
     */
    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }
   
}
