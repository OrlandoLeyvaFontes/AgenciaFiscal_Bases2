/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades_JPA;

import java.io.Serializable;
import java.time.LocalDate;
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
 * Esta clase representa una placa en el sistema.
 * 
 * La clase está anotada con @Entity para indicar que se mapeará a una tabla en la base de datos.
 * La tabla se llamará "Placa".
 * También se utiliza @DiscriminatorValue para especificar el valor del discriminador para esta entidad.
 * Y @PrimaryKeyJoinColumn para indicar que se utilizará una clave primaria compartida con la superclase.
 */
@Entity
@Table(name = "Placa")
@DiscriminatorValue(value="Placa")
@PrimaryKeyJoinColumn(name="idPlacas")
public class Placa extends Tramite implements Serializable {

    /**
     * Número de placas.
     */
    @Column(name="Numero_Placas")
    private String numeroPlacas;
    
    /**
     * Estado de la placa.
     */
    @Column(name="Estado",nullable =  false)
    private String estado;
    
    /**
     * Fecha en que la placa se volvió inactiva.
     */
    @Column(name="Fecha_inactivo")
    @Temporal(TemporalType.DATE)
    private Calendar fechaInactivo;
    
    /**
     * Automóvil asociado a la placa.
     */
    @ManyToOne()
    @JoinColumn(name="idAutomovil", nullable = false)
    private Automovil automovil;

    /**
     * Constructor por defecto de la clase Placa.
     */
    public Placa() {
    }
    
    /**
     * Constructor de la clase Placa con parámetros.
     * 
     * @param numeroPlacas Número de placas.
     * @param estado Estado de la placa.
     * @param automovil Automóvil asociado a la placa.
     * @param Costo Costo del trámite de la placa.
     * @param cliente Cliente asociado al trámite de la placa.
     */
    public Placa(String numeroPlacas, String estado, Automovil automovil, float Costo, Clientes cliente) {
        super(Costo, cliente);
        this.numeroPlacas = numeroPlacas;
        this.estado = estado;
        this.automovil = automovil;
    }
    
    /**
     * Constructor alternativo de la clase Placa con parámetros.
     * 
     * @param estado Estado de la placa.
     * @param automovil Automóvil asociado a la placa.
     * @param Costo Costo del trámite de la placa.
     */
    public Placa(String estado, Automovil automovil, float Costo) {
        super(Costo, automovil.getCliente());
        this.estado = estado;
        this.automovil = automovil;
    }
    //gets and sets
    /**
     * Obtiene Numero alfanumerico
     * @return Numero alfanumerico
     */
    public String getNumeroPlacas() {
        return numeroPlacas;
    }
    /**
     * Agrega Numero alfanumerico
     * @param numeroPlacas Numero alfanumerico
     */
    public void setNumeroPlacas(String numeroPlacas) {
        this.numeroPlacas = numeroPlacas;
    }
    /**
     * Obtiene Estado de la placa
     * @return Estado de la placa
     */
    public String getEstado() {
        return estado;
    }
    /**
     * Agrega Estado de la placa
     * @param estado Estado de la placa
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }
    /**
     * Obtiene Automovil
     * @return Automovil
     */
    public Automovil getAutomovil() {
        return automovil;
    }
    /**
     * Agrega Automovil
     * @param automovil Automovil
     */
    public void setAutomovil(Automovil automovil) {
        this.automovil = automovil;
    }
    /**
     * Obtiene Fecha inactivo
     * @return Fecha en que se desactivo
     */
    public Calendar getFechaInactivo() {
        return fechaInactivo;
    }
    /**
     * Agrega Fecha inactivo
     * @param fechaInactivo Fecha en que se desactiva
     */
    public void setFechaInactivo(Calendar fechaInactivo) {
        this.fechaInactivo = fechaInactivo;
    }

//    public Tramite getTramite() {
//        return tramite;
//    }
//
//    public void setTramite(Tramite tramite) {
//        this.tramite = tramite;
//    }
    
  
}
