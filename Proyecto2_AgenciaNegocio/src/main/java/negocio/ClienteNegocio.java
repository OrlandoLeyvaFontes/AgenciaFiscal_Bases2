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
 *
 * @author Oley
 */
public class ClienteNegocio implements IClienteNegocios {

  private IClientesDAO iclienteDAO;

    // Constructor
    public ClienteNegocio(IClientesDAO iclienteDAO) {
        this.iclienteDAO = iclienteDAO;
    }

    @Override
    public Clientes agregarCliente(ClienteNuevoDTO clienteNuevo) {
        return iclienteDAO.agregarCliente(clienteNuevo);
    }

 
    @Override
    public ClienteNuevoDTO checarCliente(String rfc) {
  Clientes cliente = iclienteDAO.Checar(rfc);
        if (cliente != null) {
            // Convertir el objeto Cliente a ClienteNuevoDTO
            ClienteNuevoDTO clienteDTO = convertirClienteAClienteNuevoDTO(cliente);
            return clienteDTO;
        } else {
            return null;
        }    }
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
