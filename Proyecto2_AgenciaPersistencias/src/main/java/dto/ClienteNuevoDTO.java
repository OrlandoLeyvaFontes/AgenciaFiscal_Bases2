/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Oley
 */
/**
 * Esta clase representa un DTO (objeto de transferencia de datos) para la
 * creación de un nuevo cliente.
 *
 * Un DTO se utiliza para transferir datos entre el cliente y el servidor.
 */
public class ClienteNuevoDTO {

    /**
     * Identificador único del cliente.
     */
    private Long id;

    /**
     * RFC del cliente.
     */
    private String rfc;

    /**
     * Nombre completo del cliente.
     */
    private String nombreCompleto;

    /**
     * Fecha de nacimiento del cliente.
     */
    private Calendar fechaNacimiento;

    /**
     * Número de teléfono del cliente.
     */
    private String telefono;

    /**
     * Indicador de discapacidad del cliente.
     */
    private boolean discapacitado;

    /**
     * Constructor vacío de la clase ClienteNuevoDTO.
     */
    public ClienteNuevoDTO() {
    }

    /**
     * Constructor de la clase ClienteNuevoDTO con parámetros.
     *
     * @param rfc RFC del cliente.
     * @param nombreCompleto Nombre completo del cliente.
     * @param fechaNacimiento Fecha de nacimiento del cliente.
     * @param telefono Número de teléfono del cliente.
     * @param discapacitado Indicador de discapacidad del cliente.
     */
    public ClienteNuevoDTO(String rfc, String nombreCompleto, Calendar fechaNacimiento, String telefono, boolean discapacitado) {
        this.rfc = rfc;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.discapacitado = discapacitado;
    }
    /**
     * Obtiene RFC
     * @return RFC
     */
    public String getRfc() {
        return rfc;
    }
    /**
     * Agrega RFC
     * @param rfc RFC
     */
    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
    /**
     * Obtiene Nombre
     * @return Nombre
     */
    public String getNombreCompleto() {
        return nombreCompleto;
    }
    /**
     * Agrega Nombre
     * @param nombreCompleto Nombre
     */
    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }
    /**
     * Obtiene ID
     * @return ID
     */
    public Long getId() {
        return id;
    }
    /**
     * Agrega ID
     * @param id ID
     */
    public void setId(Long id) {
        this.id = id;
    }
    /**
     * Obtiene Fecha nacimiento
     * @return Fecha nacimiento
     */
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }
    /**
     * Agrega Fecha nacimiento
     * @param fechaNacimiento Fecha nacimiento
     */
    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * Obtiene Indicador de Discapacitado
     * @return Indicador de Discapacitado
     */
    public boolean isDiscapacitado() {
        return discapacitado;
    }
    /**
     * Agrega Indicador de Discapacitado
     * @param discapacitado Indicador de Discapacitado
     */
    public void setDiscapacitado(boolean discapacitado) {
        this.discapacitado = discapacitado;
    }
    /**
     * Obtiene Telefono
     * @return Telefono
     */
    public String getTelefono() {
        return telefono;
    }
    /**
     * Agrega Telefono
     * @param telefono Telefono
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
