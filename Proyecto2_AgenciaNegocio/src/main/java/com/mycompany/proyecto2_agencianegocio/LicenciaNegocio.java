/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agencianegocio;

import INegocios.ILicenciaNegocios;
import com.mycompany.proyecto2_agenciafiscalDTO.ClienteNuevoDTO;
import com.mycompany.proyecto2_agenciafiscalDTO.LicenciaNuevaDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Clientes;
import com.mycompany.proyecto2_agenciafiscaldominio.Licencia;
import com.mycompany.proyecto2_agenciapersistencias.IClientesDAO;
import com.mycompany.proyecto2_agenciapersistencias.ILicenciaDAO;
import java.util.List;

/**
 *
 * @author Oley
 */
public class LicenciaNegocio implements ILicenciaNegocios {

   private ClienteNuevoDTO clienteDTO;
    private IClientesDAO clientesDAO;
    private ILicenciaDAO ilicenciaDAO;

    public LicenciaNegocio(ILicenciaDAO licenciaDAO, IClientesDAO clientesDAO, ClienteNuevoDTO clienteDTO) {
        this.ilicenciaDAO = licenciaDAO;
        this.clientesDAO = clientesDAO;
        this.clienteDTO = clienteDTO;
    }

    @Override
    public Licencia agregarLicencia(LicenciaNuevaDTO LicenciaNueva) {
        return ilicenciaDAO.agregarLicencia(LicenciaNueva);
    }
    private Clientes cliente;

    @Override
   public ClienteNuevoDTO listaClientes() {
     this.cliente = clientesDAO.Checar(clienteDTO.getRfc());
    if (cliente == null) {
        return null;
    }
    
    // Crear un nuevo objeto ClienteNuevoDTO a partir de la información del objeto Clientes
    ClienteNuevoDTO clienteDTO = new ClienteNuevoDTO(
        cliente.getRfc(),
        cliente.getNombreCompleto(),
        cliente.getFechaNacimiento(),
        cliente.getTelefono(),
        cliente.isDiscapacitado()
    );

    // Aquí puedes realizar cualquier otra operación con el objeto clienteDTO si es necesario

    return clienteDTO;

}
}
