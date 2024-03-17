
package com.mycompany.proyecto2_agenciapersistencias;

import com.mycompany.proyecto2_agenciafiscalDTO.LicenciaNuevaDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Licencia;

/**
 *
 * @author Guillermo
 */
public interface ILicenciaDAO {
    public Licencia agregarLicencia(LicenciaNuevaDTO LicenciaNueva);
}
