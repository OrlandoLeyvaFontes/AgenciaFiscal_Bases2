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
/**
 * Esta clase representa una licencia en el sistema.
 * 
 * La clase está anotada con @Entity para indicar que se mapeará a una tabla en la base de datos.
 * La tabla se llamará "licencia".
 * También se utiliza @DiscriminatorValue para especificar el valor del discriminador para esta entidad.
 * Y @PrimaryKeyJoinColumn para indicar que se utilizará una clave primaria compartida con la superclase.
 */
@Entity
@Table(name="licencia")
@DiscriminatorValue(value = "licencia")
@PrimaryKeyJoinColumn(name="idLicencia")
public class Licencia extends Tramite implements Serializable {
    
    /**
     * Constructor de la clase Licencia con parámetros.
     * 
     * @param añosVigencia Años de vigencia de la licencia.
     * @param FechaVigencia Fecha de vigencia de la licencia.
     * @param Costo Costo del trámite de la licencia.
     * @param cliente Cliente asociado a la licencia.
     */
    public Licencia(int añosVigencia, Calendar FechaVigencia, float Costo, Clientes cliente) {
        super(Costo, cliente);
        this.añosVigencia = añosVigencia;
        this.FechaVigencia = FechaVigencia;
    }
    
    /**
     * Constructor por defecto de la clase Licencia.
     */
    public Licencia(){
        
    }
    
    /**
     * Años de vigencia de la licencia.
     */
    @Column(name="años_Vigencia",nullable =  false)
    private int añosVigencia;
    
    /**
     * Fecha de vigencia de la licencia.
     */
    @Column(name="FechaVigencia",nullable =  false)
    @Temporal(TemporalType.DATE)
    private Calendar FechaVigencia;

    //gets and sets

    /**
     * Método getter para obtener los años de vigencia de la licencia.
     * 
     * @return Años de vigencia de la licencia.
     */
    public int getAñosVigencia() {
        return añosVigencia;
    }

    /**
     * Método setter para establecer los años de vigencia de la licencia.
     * 
     * @param añosVigencia Años de vigencia de la licencia.
     */
    public void setAñosVigencia(int añosVigencia) {
        this.añosVigencia = añosVigencia;
    }

    /**
     * Método getter para obtener la fecha de vigencia de la licencia.
     * 
     * @return Fecha de vigencia de la licencia.
     */
    public Calendar getFechaVigencia() {
        return FechaVigencia;
    }

    /**
     * Método setter para establecer la fecha de vigencia de la licencia.
     * 
     * @param FechaVigencia Fecha de vigencia de la licencia.
     */
    public void setFechaVigencia(Calendar FechaVigencia) {
        this.FechaVigencia = FechaVigencia;
    }
     
}
