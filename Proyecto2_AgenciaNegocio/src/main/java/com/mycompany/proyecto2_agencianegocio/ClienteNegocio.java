/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agencianegocio;

import INegocios.IClienteNegocios;
import com.mycompany.proyecto2_agenciafiscalDTO.ClienteNuevoDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Clientes;
import com.mycompany.proyecto2_agenciapersistencias.IClientesDAO;

/**
 *
 * @author Oley
 */
public class ClienteNegocio implements IClienteNegocios {

    private IClientesDAO iclienteDAO;

    @Override
    public Clientes agregarCliente(ClienteNuevoDTO clienteNuevo) {
        return iclienteDAO.agregarCliente(clienteNuevo);
    }

}
