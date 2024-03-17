/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agenciafiscaldominio;

import java.io.Serializable;
import java.util.Date;
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
@Entity
@Table(name="Clientes")
public class Clientes implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="IDCLIENTE")
    private Long id;
    @Column(name = "rfc", nullable = false, length = 13, unique = true)
    private String rfc;
    @Column(name = "nombreCompleto", nullable = false, length = 200)
    private String nombreCompleto;
    @Column(name = "FechaNacimiento", nullable = false)
    private Date fechaNacimiento;
    @Column(name = "telefono", nullable = false, unique = true, length = 12)
    private String telefono;

    public Clientes() {
    }

    public Clientes(String rfc, String nombreCompleto, Date fechaNacimiento, String telefono) {
        this.rfc = rfc;
        this.nombreCompleto = nombreCompleto;
        this.fechaNacimiento = fechaNacimiento;
        this.telefono = telefono;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
