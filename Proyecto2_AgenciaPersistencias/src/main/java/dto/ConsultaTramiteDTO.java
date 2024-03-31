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
public class ConsultaTramiteDTO {
    
    private String nombre;
    private Class tramite;
    private Calendar inicio;
    private Calendar fin;

    public ConsultaTramiteDTO(String nombre, Class tramite, Calendar inicio, Calendar fin) {
        this.nombre = nombre;
        this.tramite = tramite;
        this.inicio = inicio;
        this.fin = fin;
    }

    public String getNombre() {
        return nombre;
    }

    public Class getTramite() {
        return tramite;
    }

    public Calendar getInicio() {
        return inicio;
    }

    public Calendar getFin() {
        return fin;
    }
    
}
