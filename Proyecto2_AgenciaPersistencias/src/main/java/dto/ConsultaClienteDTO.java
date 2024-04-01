/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Gui26
 */
/**
 * Esta clase representa un DTO (objeto de transferencia de datos) para consultar clientes.
 * 
 * Un DTO se utiliza para transferir datos entre el cliente y el servidor.
 */
public class ConsultaClienteDTO {
    
    /**
     * Nombre del cliente para la consulta.
     */
    private String nombre;
    
    /**
     * RFC del cliente para la consulta.
     */
    private String rfc;
    
    /**
     * Fecha de nacimiento del cliente para la consulta.
     */
    private String nacimiento;

    /**
     * Constructor de la clase ConsultaClienteDTO con parámetros.
     * 
     * @param nombre Nombre del cliente para la consulta.
     * @param rfc RFC del cliente para la consulta.
     * @param nacimiento Fecha de nacimiento del cliente para la consulta.
     */
    public ConsultaClienteDTO(String nombre, String rfc, String nacimiento) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.nacimiento = nacimiento;
    }
    /**
     * Obtiene Nombre
     * @return Nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Obtiene RFC
     * @return RFC
     */
    public String getRfc() {
        return rfc;
    }
    /**
     * Obtiene Fecha de nacimiento
     * @return Fecha de nacimiento
     */
    public String getNacimiento() {
        return nacimiento;
    }
    
}
