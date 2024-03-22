/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INegocios;

import com.mycompany.proyecto2_agenciafiscalDTO.ClienteNuevoDTO;
import com.mycompany.proyecto2_agenciafiscalDTO.LicenciaNuevaDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Licencia;
import java.util.List;

/**
 *
 * @author Oley
 */
public interface ILicenciaNegocios {
   public Licencia agregarLicencia(LicenciaNuevaDTO LicenciaNueva);
     public ClienteNuevoDTO listaClientes();
}
