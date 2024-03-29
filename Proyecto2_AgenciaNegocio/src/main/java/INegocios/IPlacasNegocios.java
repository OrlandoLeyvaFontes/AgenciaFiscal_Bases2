/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INegocios;

import com.mycompany.proyecto2_agenciafiscaldominio.Placa;
import java.util.List;

/**
 *
 * @author Oley
 */
public interface IPlacasNegocios {

    public List<Placa> BuscarPorAuto(int id);

    public Placa registrarPlaca(Placa placas);

}
