/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import dto.PlacaNuevoDTO;
import entidades_JPA.Placa;
import java.util.List;

/**
 * Interfaz IPlacasDAO
 * @author Oley
 */
public interface IPlacasDAO {

    //pudo haber sido por dto ya que lo pienso pero me dormi :/
//    public Placa agregarPlacas(PlacaNuevoDTO placaNuevo);
    /**
     * Agrega placa
     * @param placas Placa
     * @return Placa
     */
    public Placa agregarPlacas(Placa placas);

    /**
     * Recupera una lista de placas asociadas a un automóvil específico.
     *
     * @param idAutomovil Identificador del automóvil del que se desean
     * recuperar las placas.
     * @return Lista de placas asociadas al automóvil especificado.
     */
    public List<Placa> AutoEspecifico(int idAutomovil);

    /**
     * Recupera una lista de todas las placas almacenadas en el sistema.
     *
     * @return Lista de todas las placas almacenadas en el sistema.
     */
    public List<Placa> todasPlacas();

    /**
     * Recupera la placa asociada a un automóvil mediante su número de placa.
     *
     * @param numPlaca Número de placa del automóvil del que se desea recuperar
     * la información.
     * @return Placa asociada al automóvil especificado por su número de placa.
     */
    public Placa autoPlaca(String numPlaca);
}
