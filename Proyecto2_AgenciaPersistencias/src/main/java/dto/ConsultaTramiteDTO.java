/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.util.Calendar;

/**
 *
 * @author Gui26
 */
/**
 * Esta clase representa un DTO (objeto de transferencia de datos) para consultar trámites.
 * 
 * Un DTO se utiliza para transferir datos entre el cliente y el servidor.
 */
public class ConsultaTramiteDTO {
    
    /**
     * Nombre asociado a la consulta.
     */
    private String nombre;
    
    /**
     * Clase del trámite a consultar.
     */
    private Class tramite;
    
    /**
     * Fecha de inicio para la consulta.
     */
    private Calendar inicio;
    
    /**
     * Fecha de fin para la consulta.
     */
    private Calendar fin;

    /**
     * Constructor de la clase ConsultaTramiteDTO con parámetros.
     * 
     * @param nombre Nombre asociado a la consulta.
     * @param tramite Clase del trámite a consultar.
     * @param inicio Fecha de inicio para la consulta.
     * @param fin Fecha de fin para la consulta.
     */
    public ConsultaTramiteDTO(String nombre, Class tramite, Calendar inicio, Calendar fin) {
        this.nombre = nombre;
        this.tramite = tramite;
        this.inicio = inicio;
        this.fin = fin;
    }
    /**
     * Obtiene Nombre
     * @return Nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Obtiene Tramite
     * @return Tramite
     */
    public Class getTramite() {
        return tramite;
    }
    /**
     * Obtiene Fecha Inicio
     * @return Fecha Inicio
     */
    public Calendar getInicio() {
        return inicio;
    }
    /**
     * Obtiene Fecha Fin
     * @return Fecha Fin
     */
    public Calendar getFin() {
        return fin;
    }
    
}
