/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import dto.PlacaNuevoDTO;
import entidades_JPA.Placa;
import java.util.List;

/**
 *
 * @author Oley
 */
public interface IPlacasDAO {

    //pudo haber sido por dto ya que lo pienso pero me dormi :/
//    public Placa agregarPlacas(PlacaNuevoDTO placaNuevo);
    public Placa agregarPlacas(Placa placas);

    public List<Placa> AutoEspecifico(int idAutomovil);

    public List<Placa> todasPlacas();

    public Placa autoPlaca(String numPlaca);
}
