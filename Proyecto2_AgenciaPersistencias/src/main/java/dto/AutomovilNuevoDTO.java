/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import entidades_JPA.Automovil;
import entidades_JPA.Clientes;
import entidades_JPA.Placa;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Oley
 */
/**
 * Esta clase representa un DTO (objeto de transferencia de datos) para la
 * creación de un nuevo automóvil.
 *
 * Un DTO se utiliza para transferir datos entre el cliente y el servidor.
 */
@Entity
public class AutomovilNuevoDTO {

    /**
     * Identificador único del automóvil.
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * Número de serie del automóvil.
     */
    private String numeroSerie;

    /**
     * Marca del automóvil.
     */
    private String marca;

    /**
     * Línea del automóvil.
     */
    private String linea;

    /**
     * Color del automóvil.
     */
    private String color;

    /**
     * Modelo del automóvil.
     */
    private String modelo;

    /**
     * Cliente asociado al automóvil.
     */
    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Clientes cliente;

    /**
     * Lista de placas asociadas al automóvil.
     */
    @OneToMany(mappedBy = "automovil")
    private List<Placa> placas;

    /**
     * Constructor vacío de la clase AutomovilNuevoDTO.
     */
    public AutomovilNuevoDTO() {
        placas = new ArrayList<>();
    }

    /**
     * Constructor de la clase AutomovilNuevoDTO con parámetros.
     *
     * @param numeroSerie Número de serie del automóvil.
     * @param marca Marca del automóvil.
     * @param linea Línea del automóvil.
     * @param color Color del automóvil.
     * @param modelo Modelo del automóvil.
     * @param cliente Cliente asociado al automóvil.
     */
    public AutomovilNuevoDTO(String numeroSerie, String marca, String linea, String color, String modelo, Clientes cliente) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
        this.cliente = cliente;
        placas = new ArrayList<>();
    }
    /**
     * Obtiene Hash
     * @return Hash
     */
    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
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

}
