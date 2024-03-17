
package com.mycompany.proyecto2_agenciafiscalDTO;

import java.util.Date;

/**
 *
 * @author Guillermo
 */
public class LicenciaNuevaDTO {
    
    private Date fechaEmision;
    private Date fechaVigencia;
    private float costo;

    public LicenciaNuevaDTO() {
    }

    public LicenciaNuevaDTO(Date fechaEmision, Date fechaVigencia, float costo) {
        this.fechaEmision = fechaEmision;
        this.fechaVigencia = fechaVigencia;
        this.costo = costo;
    }

    public Date getFechaEmision() {
        return fechaEmision;
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
