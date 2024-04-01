/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades_JPA;

import java.io.Serializable;
import java.util.Calendar;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Oley
 */
/**
 * Esta clase representa un cliente en el sistema.
 *
 * La clase está anotada con @Entity para indicar que se mapeará a una tabla en
 * la base de datos. La tabla se llamará "Clientes".
 */
@Entity
@Table(name = "Clientes")
public class Clientes implements Serializable {

    /**
     * Identificador único del cliente. Se generará automáticamente por la base
     * de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idCliente")
    private Long id;

    /**
     * RFC del cliente. Debe ser único y tiene una longitud máxima de 13
     * caracteres.
     */
    @Column(name = "rfc", nullable = false, length = 13, unique = true)
    private String rfc;

    /**
     * Nombre completo del cliente. Tiene una longitud máxima de 200 caracteres.
     */
    @Column(name = "nombreCompleto", nullable = false, length = 200)
    private String nombreCompleto;

    /**
     * Fecha de nacimiento del cliente.
     */
    @Column(name = "FechaNacimiento", nullable = false)
    private Calendar fechaNacimiento;

    /**
     * Número de teléfono del cliente. Debe ser único y tiene una longitud
     * máximo de 12 caracteres.
     */
    @Column(name = "telefono", nullable = false, unique = true, length = 12)
    private String telefono;

    /**
     * Indicador de discapacidad del cliente.
     */
    @Column(name = "discapacitado", nullable = false)
    private Boolean discapacitado;

    /**
     * Constructor por defecto de la clase Clientes.
     */
    public Clientes() {
    }

    /**
     * Constructor de la clase Clientes con parámetros.
     *
     * @param rfc RFC del cliente.
     * @param nombreCompleto Nombre completo del cliente.
     * @param fechaNacimiento Fecha de nacimiento del cliente.
     * @param telefono Número de teléfono del cliente.
     * @param discapacitado Indicador de discapacidad del cliente.
     */
    public Clientes(String rfc, String nombreCompleto, Calendar fechaNacimiento, String telefono, Boolean discapacitado) {
        this.rfc = rfc;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
        this.discapacitado = discapacitado;
    }
    //gets and sets
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
     * Obtiene Fecha de nacimiento
     * @return Fecha de nacimiento
     */
    public Calendar getFechaNacimiento() {
        return fechaNacimiento;
    }
    /**
     * Agrega Fecha de nacimiento
     * @param fechaNacimiento Fecha de nacimiento
     */
    public void setFechaNacimiento(Calendar fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    /**
     * Obtiene Indicador de discapacidad
     * @return Discapacitado
     */
    public Boolean getDiscapacitado() {
        return discapacitado;
    }
    /**
     * Agrega Indicador de discapacidad
     * @param discapacitado Discapacitado
     */
    public void setDiscapacitado(Boolean discapacitado) {
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
