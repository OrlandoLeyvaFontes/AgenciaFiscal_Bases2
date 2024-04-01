/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INegocios;

/**
 * Esta interfaz define los métodos para realizar consultas relacionadas con clientes.
 * Contiene métodos para consultar clientes por diferentes criterios.
 * 
 * @author Gui26
 */
public interface IConsultaClientes {

    /**
 * Realiza una consulta utilizando el nombre, RFC y fecha de nacimiento como parámetros.
 * 
 * @param nombre El nombre del cliente a consultar.
 * @param rfc El RFC del cliente a consultar.
 * @param nacimiento La fecha de nacimiento del cliente a consultar en formato AAAA-MM-DD.
 * @return Un arreglo bidimensional que contiene la información de los clientes que coinciden con los criterios de consulta.
 *         Cada fila del arreglo representa un cliente y las columnas representan los siguientes atributos:
 *         - ID del cliente
 *         - Nombre completo del cliente
 *         - RFC del cliente
 *         - Fecha de nacimiento del cliente (en formato AAAA-MM-DD)
 *         - Teléfono del cliente
 */
    public Object[][] consulta(String nombre, String rfc, String nacimiento);
}
