/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INegocios;

import dto.ClienteNuevoDTO;
import entidades_JPA.Clientes;

/**
 * Descripción de la interfaz IClienteNegocios.
 * Esta interfaz define los métodos para la lógica de negocio relacionada con los clientes.
 * @author Oley
 */
public interface IClienteNegocios {
  /**
     * Agrega un nuevo cliente al sistema.
     * 
     * @param clienteNuevo Objeto que contiene la información del nuevo cliente.
     * @return El cliente agregado, o null si no se pudo agregar.
     */
public Clientes agregarCliente(ClienteNuevoDTO clienteNuevo);

 /**
     * Verifica la existencia de un cliente en el sistema utilizando su RFC.
     * 
     * @param rfc El RFC del cliente a verificar.
     * @return Un objeto ClienteNuevoDTO con la información del cliente si existe, o null si no se encuentra.
     */
public ClienteNuevoDTO checarCliente(String rfc);

}
