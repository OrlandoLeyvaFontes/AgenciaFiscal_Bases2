/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades_JPA;

import java.io.Serializable;
import java.util.Calendar;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Oley
 */
/**
 * Esta clase representa un trámite en el sistema.
 *
 * La clase está anotada con @Entity para indicar que se mapeará a una tabla en
 * la base de datos. La tabla se llamará "Tramite". También se utiliza
 *
 * //@DiscriminatorColumn para especificar la columna que se utilizara como
 * discriminador en las subclases. Y @Inheritance con estrategia JOINED para
 * indicar una estrategia de herencia con tablas separadas para cada clase
 * concreta.
 */
@Entity
@Table(name = "Tramite")
@DiscriminatorColumn(name = "tipo")
@Inheritance(strategy = InheritanceType.JOINED)
public class Tramite implements Serializable {

    /**
     * Identificador único del trámite.
     */
    @Id
    @Column(name = "idTramite")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * Costo del trámite.
     */
    @Column(name = "Costo")
    private float Costo;

    /**
     * Fecha en que se realizó el trámite.
     */
    @Column(name = "Fecha_Tramite", nullable = true)
    @Temporal(TemporalType.DATE)
    private Calendar fechaTramite;

    /**
     * Cliente asociado al trámite.
     */
    @ManyToOne()
    @JoinColumn(name = "idCliente", nullable = false)
    private Clientes cliente;

    /**
     * Constructor por defecto de la clase Tramite.
     */
    public Tramite() {

    }

    /**
     * Constructor de la clase Tramite con parámetros.
     *
     * @param Costo Costo del trámite.
     * @param cliente Cliente asociado al trámite.
     */
    public Tramite(float Costo, Clientes cliente) {
        this.Costo = Costo;
        this.cliente = cliente;
        this.fechaTramite = Calendar.getInstance();
    }
    //gets and sets
    /**
     * Obtiene id
     * @return ID
     */
    public Integer getId() {
        return id;
    }
    /**
     * Agrega id
     * @param id ID
     */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
     * Obtiene Costo
     * @return Costo
     */
    public float getCosto() {
        return Costo;
    }
    /**
     * Agrega Costo
     * @param Costo Costo
     */
    public void setCosto(float Costo) {
        this.Costo = Costo;
    }
    /**
     * Obtiene Fecha de tramite
     * @return Fecha de tramite
     */
    public Calendar getFechaTramite() {
        return fechaTramite;
    }
    /**
     * Agrega Fecha de tramite
     * @param fechaTramite Fecha de tramite
     */
    public void setFechaTramite(Calendar fechaTramite) {
        this.fechaTramite = fechaTramite;
    }
    /**
     * Obtiene Cliente
     * @return Cliente
     */
    public Clientes getCliente() {
        return cliente;
    }
    /**
     * Agrega cliente
     * @param cliente Cliente
     */
    public void setPersona(Clientes cliente) {
        this.cliente = cliente;
    }
    /**
     * Obtiene hash
     * @return Hash
     */
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }
    /**
     * Obtiene si el Tramite es igual al objeto
     * @param object Tramite
     * @return True si el tramite coincide, false en caso contrario
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Tramite)) {
            return false;
        }
        Tramite other = (Tramite) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }
    
    /**{
     * Obtiene Tipo de tramite
     * @return Tipo de tramite
     */
    @Transient
    public String getDecriminatorValue() {
        return this.getClass().getAnnotation(DiscriminatorValue.class).value();
    }

}
