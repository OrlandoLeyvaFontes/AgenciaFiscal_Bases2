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
@Entity
public class AutomovilNuevoDTO {

  
 @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroSerie;
    private String marca;
    private String linea;
    private String color;
    private String modelo;

    @ManyToOne
    @JoinColumn(name = "idCliente")
    private Clientes cliente;

    @OneToMany(mappedBy = "automovil")
    private List<Placa> placas;

    public AutomovilNuevoDTO() {
        placas = new ArrayList<>();
    }

    public AutomovilNuevoDTO(String numeroSerie, String marca, String linea, String color, String modelo, Clientes cliente) {
        this.numeroSerie = numeroSerie;
        this.marca = marca;
        this.linea = linea;
        this.color = color;
        this.modelo = modelo;
        this.cliente = cliente;
        placas = new ArrayList<>();
    }

    // Getters y setters omitidos por brevedad

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;

        AutomovilNuevoDTO that = (AutomovilNuevoDTO) object;

        return id != null ? id.equals(that.id) : that.id == null;
    }

    @Override
    public int hashCode() {
        return id != null ? id.hashCode() : 0;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

}
