/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades_JPA;

import java.io.Serializable;
import java.time.LocalDate;
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
@Table(name = "placa")
public class Placa implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "numeroAlfaNumerico", nullable = false, unique = true, length = 200)
    private String numeroAlfaNumerico;
    @Column(name = "fechaEmision", nullable = false)
    private Date fechaEmision;
    @Column(name = "FechaRecepcion", nullable = false)
    private Date fechaRecepcion;
    @Column(name = "costo", nullable = false)
    private float costo;

    public Placa() {
    }

    public Placa(String numeroAlfaNumerico, Date fechaEmision, Date fechaRecepcion, float costo) {
        this.numeroAlfaNumerico = numeroAlfaNumerico;
        this.fechaEmision = fechaEmision;
        this.fechaRecepcion = fechaRecepcion;
        this.costo = costo;
    }

    public String getNumeroAlfaNumerico() {
        return numeroAlfaNumerico;
    }

    public void setNumeroAlfaNumerico(String numeroAlfaNumerico) {
        this.numeroAlfaNumerico = numeroAlfaNumerico;
    }

    public Date getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaRecepcion() {
        return fechaRecepcion;
    }

    public void setFechaRecepcion(Date fechaRecepcion) {
        this.fechaRecepcion = fechaRecepcion;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

  
}
