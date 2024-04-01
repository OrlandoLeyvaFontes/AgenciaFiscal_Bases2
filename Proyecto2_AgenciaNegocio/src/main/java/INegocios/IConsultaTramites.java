/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INegocios;

import java.util.Calendar;
/**
 * Esta interfaz define los métodos para realizar consultas relacionadas con los trámites.
 * Contiene métodos para consultar información sobre trámites realizados.
 * 
 * @author Gui26
 */
public interface IConsultaTramites {

    /**
     * Realiza una consulta utilizando un identificador único.
     *
     * @param id Identificador para la consulta.
     * @return Matriz de objetos que representa el resultado de la consulta.
     */
    public Object[][] consulta(Long id);

    /**
     * Realiza una consulta utilizando varios parámetros de búsqueda.
     *
     * @param nombre Nombre para la búsqueda.
     * @param tramite Tipo de trámite para la búsqueda.
     * @param inicio Fecha de inicio del periodo de búsqueda.
     * @param fin Fecha de fin del periodo de búsqueda.
     * @return Matriz de objetos que representa el resultado de la consulta.
     */
    public Object[][] consulta(String nombre, String tramite, Calendar inicio, Calendar fin);
}
