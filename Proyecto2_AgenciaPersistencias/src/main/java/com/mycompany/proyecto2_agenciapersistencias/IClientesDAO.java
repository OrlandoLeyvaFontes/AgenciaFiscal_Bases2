/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto2_agenciapersistencias;

import com.mycompany.proyecto2_agenciafiscalDTO.ClienteNuevoDTO;
import com.mycompany.proyecto2_agenciafiscalDTO.ConsultaClienteDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Clientes;
import java.util.List;

/**
 *
 * @author Oley
 */
public interface IClientesDAO {

    public Clientes agregarCliente(ClienteNuevoDTO clienteNuevo);

    public Clientes Checar(String rfc);
    
    public List<Clientes> consultar(ConsultaClienteDTO filtrosConsulta);
}
