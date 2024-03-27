/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INegocios;

import com.mycompany.proyecto2_agenciafiscalDTO.ClienteNuevoDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Clientes;

/**
 *
 * @author Oley
 */
public interface IClienteNegocios {
    public Clientes agregarCliente(ClienteNuevoDTO clienteNuevo);
    public ClienteNuevoDTO checarCliente(String rfc);

}
