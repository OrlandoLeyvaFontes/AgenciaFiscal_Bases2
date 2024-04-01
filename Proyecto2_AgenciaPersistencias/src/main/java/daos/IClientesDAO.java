/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import dto.ClienteNuevoDTO;
import dto.ConsultaClienteDTO;
import entidades_JPA.Clientes;
import java.util.List;

/**
 * Interfaz IClientesDAO
 * @author Oley
 */
public interface IClientesDAO {

/**
 * Agrega un nuevo cliente al sistema.
 * 
 * @param clienteNuevo Información del cliente a agregar.
 * @return Cliente agregado al sistema.
 */
public Clientes agregarCliente(ClienteNuevoDTO clienteNuevo);

/**
 * Verifica la existencia de un cliente en el sistema mediante su RFC.
 * 
 * @param rfc RFC del cliente a verificar.
 * @return Cliente con el RFC especificado, o null si no existe.
 */
public Clientes Checar(String rfc);
    
/**
 * Consulta una lista de clientes basada en filtros específicos.
 * 
 * @param filtrosConsulta Filtros de consulta para la búsqueda de clientes.
 * @return Lista de clientes que cumplen con los filtros de consulta.
 */
public List<Clientes> consultar(ConsultaClienteDTO filtrosConsulta);
}
