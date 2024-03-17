
package com.mycompany.proyecto2_agenciapersistencias;

import com.mycompany.proyecto2_agenciafiscalDTO.PlacaNuevoDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Placa;

/**
 *
 * @author Oley
 */
public interface IPlacasDAO {
    public Placa agregarPlacas(PlacaNuevoDTO placaNuevo);
}
