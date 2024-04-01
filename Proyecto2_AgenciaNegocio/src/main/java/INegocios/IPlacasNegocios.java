/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INegocios;

import entidades_JPA.Automovil;
import entidades_JPA.Placa;
import java.util.List;

/**
 * Esta interfaz define los métodos para la lógica de negocio relacionada con las placas de vehículos.
 * Contiene métodos para gestionar las placas de vehículos.
 * 
 * @author Oley
 */
public interface IPlacasNegocios {

   /**
     * Busca placas asociadas a un automóvil específico.
     *
     * @param id Identificador del automóvil del que se desean buscar las
     * placas.
     * @return Lista de placas asociadas al automóvil especificado.
     */
    public List<Placa> BuscarPorAuto(int id);

/**
     * Registra una nueva placa en el sistema.
     *
     * @param placas La placa que se desea registrar.
     * @return La placa registrada en el sistema.
     */
    public Placa registrarPlaca(Placa placas);
//    List<Automovil> buscaPorAuto(int idCliente);

}
