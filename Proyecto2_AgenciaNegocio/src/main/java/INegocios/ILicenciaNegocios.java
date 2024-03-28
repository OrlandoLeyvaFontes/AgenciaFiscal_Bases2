/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INegocios;

import com.mycompany.proyecto2_agenciafiscalDTO.ClienteNuevoDTO;
import com.mycompany.proyecto2_agenciafiscalDTO.LicenciaNuevaDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Clientes;
import com.mycompany.proyecto2_agenciafiscaldominio.Licencia;
import com.mycompany.proyecto2_agenciafiscaldominio.Tramite;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Oley
 */
public interface ILicenciaNegocios {
  
    public List<Licencia> listaLicenciaPersona(int id);

    public List<Licencia> listaLicenciaPersonaVigentes(int id);

    public Licencia agregaLicencia(Licencia licencia);
}
