/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades_JPA;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Oley
 */
@Entity
@Table(name="licencia")
@DiscriminatorValue(value = "licencia")
public class Licencia extends Tramite implements Serializable {
     
    //Antes usaba los localDate pero e decidido que asi sera mas sencillo
@Temporal(TemporalType.TIMESTAMP)
@Column(name = "fechaVencimiento",nullable = false)
private Calendar fehcaVencida;
@Temporal(TemporalType.TIMESTAMP)
@Column(name = "FechaExpedi",nullable = false)
private  Calendar fechaExpedi;
@Column(name = "Vigencia",nullable = false,length = 50)
private String vigencia;
@Column(name = "costo",nullable = false)
private Float Costo;

    public Licencia(Calendar fehcaVencida, Calendar fechaExpedi, String vigencia, Float Costo) {
        this.fehcaVencida = fehcaVencida;
        this.fechaExpedi = fechaExpedi;
        this.vigencia = vigencia;
        this.Costo = Costo;
    }

    public Calendar getFehcaVencida() {
        return fehcaVencida;
    }

    public void setFehcaVencida(Calendar fehcaVencida) {
        this.fehcaVencida = fehcaVencida;
    }

    public Calendar getFechaExpedi() {
        return fechaExpedi;
    }

    public void setFechaExpedi(Calendar fechaExpedi) {
        this.fechaExpedi = fechaExpedi;
    }

    public String getVigencia() {
        return vigencia;
    }

    public void setVigencia(String vigencia) {
        this.vigencia = vigencia;
    }

    public Float getCosto() {
        return Costo;
    }

    public void setCosto(Float Costo) {
        this.Costo = Costo;
    }



    public Licencia() {
        
    }

  

    

  
    
}
