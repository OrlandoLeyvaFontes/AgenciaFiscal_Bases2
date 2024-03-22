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
private  ClienteNuevoDTO clienteDTO;
private IClientesDAO clientesDAO;
    private ILicenciaDAO ilicenciaDAO;
private Clientes cliente;
    @Override
    public Licencia agregarLicencia(LicenciaNuevaDTO LicenciaNueva) {
        return ilicenciaDAO.agregarLicencia(LicenciaNueva);
    }

    

    @Override
    public ClienteNuevoDTO listaClientes() {
   this.cliente = clientesDAO.Checar(clienteDTO.getRfc());
        if (cliente == null) {
            return null;
        }
        ClienteNuevoDTO clienteDTO = new ClienteNuevoDTO(cliente.getRfc(), cliente.getNombreCompleto(), cliente.getFechaNacimiento(), cliente.getTelefono());
        return clienteDTO;    }

 
  
        
        }

  



