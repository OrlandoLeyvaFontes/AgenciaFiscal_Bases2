/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import INegocios.IClienteNegocios;
import dto.ClienteNuevoDTO;
import entidades_JPA.Clientes;
import daos.IClientesDAO;

/**
 * Gestiona operaciones relacionadas con clientes en la agencia.
 * Permite agregar nuevos clientes y verificar su existencia en la base de datos.
 * Esta clase depende de una implementación de IClientesDAO.
 * @author Oley
 */
public class ClienteNegocio implements IClienteNegocios {

   private IClientesDAO iclienteDAO;

    /**
     * Constructor de la clase ClienteNegocio.
     *
     * @param iclienteDAO Objeto que implementa la interfaz IClientesDAO para acceder a la capa de datos.
     */
    public ClienteNegocio(IClientesDAO iclienteDAO) {
        this.iclienteDAO = iclienteDAO;
    }

    /**
     * Agrega un nuevo cliente.
     *
     * @param clienteNuevo Objeto que contiene la información del nuevo cliente.
     * @return El cliente agregado.
     */
    @Override
    public Clientes agregarCliente(ClienteNuevoDTO clienteNuevo) {
        return iclienteDAO.agregarCliente(clienteNuevo);
    }

    /**
     * Verifica si un cliente existe en la base de datos y devuelve su información en un objeto ClienteNuevoDTO.
     *
     * @param rfc El RFC del cliente a verificar.
     * @return El objeto ClienteNuevoDTO con la información del cliente si existe, o null si no se encuentra.
     */
    @Override
    public ClienteNuevoDTO checarCliente(String rfc) {
        Clientes cliente = iclienteDAO.Checar(rfc);
        if (cliente != null) {
            // Convertir el objeto Cliente a ClienteNuevoDTO
            ClienteNuevoDTO clienteDTO = convertirClienteAClienteNuevoDTO(cliente);
            return clienteDTO;
        } else {
            return null;
        }
    }

    /**
     * Convierte un objeto Cliente a un objeto ClienteNuevoDTO.
     *
     * @param cliente El cliente a convertir.
     * @return El objeto ClienteNuevoDTO creado a partir del cliente.
     */
    private ClienteNuevoDTO convertirClienteAClienteNuevoDTO(Clientes cliente) {
        ClienteNuevoDTO clienteDTO = new ClienteNuevoDTO();
        clienteDTO.setRfc(cliente.getRfc());
        clienteDTO.setNombreCompleto(cliente.getNombreCompleto());
        clienteDTO.setFechaNacimiento(cliente.getFechaNacimiento());
        clienteDTO.setTelefono(cliente.getTelefono());
        clienteDTO.setDiscapacitado(cliente.getDiscapacitado());
        return clienteDTO;
    }
}
