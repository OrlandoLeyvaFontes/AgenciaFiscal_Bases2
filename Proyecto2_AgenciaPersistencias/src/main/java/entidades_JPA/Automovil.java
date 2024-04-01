/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades_JPA;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Oley
 */
/**
 * Esta clase representa un automóvil en el sistema.
 *
 * La clase está anotada con @Entity para indicar que se mapeará a una tabla en
 * la base de datos. La tabla se llamará "Automovil".
 */
@Entity
@Table(name = "Automovil")
public class Automovil implements Serializable {

    /**
     * Identificador único del automóvil. Se generará automáticamente por la
     * base de datos.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    /**
     * Número de serie del automóvil. Debe ser único y tiene una longitud máxima
     * de 17 caracteres.
     */
    @Column(name = "numeroSerie", nullable = false, unique = true, length = 17)
    private String numeroSerie;
    /**
     * Marca del automóvil. Tiene una longitud máxima de 100 caracteres.
     */
    @Column(name = "Marca", nullable = false, unique = false, length = 100)
    private String marca;
    /**
     * Línea del automóvil. Tiene una longitud máxima de 200 caracteres.
     */
    @Column(name = "Linea", nullable = false, unique = false, length = 200)
    private String linea;
    /**
     * Color del automóvil. Tiene una longitud máxima de 50 caracteres.
     */
    @Column(name = "color", nullable = false, unique = false, length = 50)
    private String color;

    /**
     * Modelo del automóvil.
     */
    @Column(name = "modelo", nullable = false, unique = false)
    private String modelo;
    /**
     * Cliente al que pertenece el automóvil. La relación es de muchos
     * automóviles a un solo cliente.
     */
    @ManyToOne()
    @JoinColumn(name = "idCliente", nullable = false)
    private Clientes cliente;

//    @OneToMany(mappedBy = "automovil")
//    private List<Placa> placas;
    /**
     * Constructor por defecto de la clase Automovil.
     */
    public Automovil() {
    }
    /**
     * Constructor de la clase Automovil con parámetros.
     *
     * @param numeroSerie Número de serie del automóvil.
     * @param marca Marca del automóvil.
     * @param linea Línea del automóvil.
     * @param color Color del automóvil.
     * @param modelo Modelo del automóvil.
     * @param cliente Cliente al que pertenece el automóvil.
     */
    public Automovil(String numeroSerie, String marca, String linea, String color, String modelo, Clientes cliente) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
        this.cliente = cliente;
    }
    //gets and sets
    /**
     * Obtiene Numero de serie
     * @return Numero de serie
     */
    public String getNumeroSerie() {
        return numeroSerie;
    }
    /**
     * Agrega Numero de serie
     * @param numeroSerie Numero de serie
     */
    public void setNumeroSerie(String numeroSerie) {
        this.numeroSerie = numeroSerie;
    }
    /**
     * Obtiene Marca
     * @return Marca
     */
    public String getMarca() {
        return marca;
    }
    /**
     * Agrega Marca
     * @param marca Marca
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }
    /**
     * Obtiene Linea
     * @return Linea
     */
    public String getLinea() {
        return linea;
    }
    /**
     * Agrega Linea
     * @param linea Linea
     */
    public void setLinea(String linea) {
        this.linea = linea;
    }
    /**
     * Obtiene Color
     * @return Color
     */
    public String getColor() {
        return color;
    }
    /**
     * Agrega Color
     * @param color Color
     */
    public void setColor(String color) {
        this.color = color;
    }
    /**
     * Obtiene Modelo
     * @return Modelo
     */
    public String getModelo() {
        return modelo;
    }
    /**
     * Agrega Modelo
     * @param modelo Modelo
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
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
     * Obtiene Cliente
     * @return Cliente
     */
    public Clientes getCliente() {
        return cliente;
    }
    /**
     * Agrega Cliente
     * @param cliente Cliente
     */
    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

//    public List<Placa> getPlacas() {
//        return placas;
//    }
//
//    public void setPlacas(List<Placa> placas) {
//        this.placas = placas;
//    }
    /**
     * Método equals para comparar dos objetos de tipo Automovil.
     *
     * @param object Objeto a comparar.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Automovil)) {
            return false;
        }
        Automovil other = (Automovil) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

}
