
package com.mycompany.proyecto2_agenciapersistencias;

import com.mycompany.proyecto2_agenciafiscalDTO.ClienteNuevoDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Clientes;

/**
 *
 * @author Oley
 */
public interface IClientesDAO {
            public Clientes agregarCliente(ClienteNuevoDTO clienteNuevo);

}
