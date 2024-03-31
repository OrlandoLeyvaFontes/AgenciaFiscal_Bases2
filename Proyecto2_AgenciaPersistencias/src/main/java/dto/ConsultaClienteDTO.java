/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

/**
 *
 * @author Gui26
 */
public class ConsultaClienteDTO {
    
    private String nombre;
    private String rfc;
    private String nacimiento;

    public ConsultaClienteDTO(String nombre, String rfc, String nacimiento) {
        this.nombre = nombre;
        this.rfc = rfc;
        this.nacimiento = nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRfc() {
        return rfc;
    }

    public String getNacimiento() {
        return nacimiento;
    }
    
}
