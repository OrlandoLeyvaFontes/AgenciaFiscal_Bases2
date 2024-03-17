
package com.mycompany.proyecto2_agenciapersistencias;

import com.mycompany.proyecto2_agenciafiscalDTO.AutomovilNuevoDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Automovil;

/**
 *
 * @author Oley
 */
public interface IAutomovilDAO {
    public Automovil agergarAutomovil(AutomovilNuevoDTO automovilNuevo);
}