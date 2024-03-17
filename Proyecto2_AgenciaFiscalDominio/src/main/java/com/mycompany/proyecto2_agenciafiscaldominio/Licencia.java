
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
 * @author Guillermo
 */
@Entity
@Table(name = "licencia")
public class Licencia implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(name = "fechaEmision", nullable = false)
    private Date fechaEmision;
    
    @Column(name = "FechaVigencia", nullable = false)
    private Date fechaVigencia;
    
    @Column(name = "costo", nullable = false)
    private float costo;
    
    public Date getFechaEmision() {
        return fechaEmision;
    }

    public Licencia() {
    }

    public Licencia(Date fechaEmision, Date fechaVigencia, float costo) {
        this.fechaEmision = fechaEmision;
        this.fechaVigencia = fechaVigencia;
        this.costo = costo;
    }

    public Licencia(Long id, Date fechaEmision, Date fechaVigencia, float costo) {
        this.id = id;
        this.fechaEmision = fechaEmision;
        this.fechaVigencia = fechaVigencia;
        this.costo = costo;
    }

    public void setFechaEmision(Date fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public Date getFechaVigencia() {
        return fechaVigencia;
    }

    public void setFechaVigencia(Date fechaVigencia) {
        this.fechaVigencia = fechaVigencia;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }
    
}
