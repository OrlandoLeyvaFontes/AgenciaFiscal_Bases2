/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agenciafiscaldominio;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@PrimaryKeyJoinColumn(name="idLicencia")
public class Licencia extends Tramite implements Serializable {
    
    public Licencia(int añosVigencia, Calendar FechaVigencia, float Costo, Clientes cliente) {
        super(Costo, cliente);
        this.añosVigencia = añosVigencia;
        this.FechaVigencia = FechaVigencia;
    }
    public Licencia(){
        
    }
    @Column(name="años_Vigencia",nullable =  false)
    private int añosVigencia;
    
    @Column(name="FechaVigencia",nullable =  false)
    @Temporal(TemporalType.DATE)
    private Calendar FechaVigencia;

    public int getAñosVigencia() {
        return añosVigencia;
    }

    public void setAñosVigencia(int añosVigencia) {
        this.añosVigencia = añosVigencia;
    }

    public Calendar getFechaVigencia() {
        return FechaVigencia;
    }

    public void setFechaVigencia(Calendar FechaVigencia) {
        this.FechaVigencia = FechaVigencia;
    }
    
}
