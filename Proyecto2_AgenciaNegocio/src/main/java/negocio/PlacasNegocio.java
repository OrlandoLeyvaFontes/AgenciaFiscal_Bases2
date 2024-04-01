/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import INegocios.IPlacasNegocios;
import entidades_JPA.Automovil;
import entidades_JPA.Placa;
import daos.PlacaDAO;
import java.util.List;

/**
 * Clase que implementa la interfaz IPlacasNegocios para manejar operaciones relacionadas con placas de vehículos.
 *
 * @author Oley
 */
public class PlacasNegocio implements IPlacasNegocios {

    /**
     * DAO para acceder a la capa de datos de placas.
     */
    private PlacaDAO placasDAO;
    /**
     * Cosntructor
     * @param placasDAO PlacaDAO
     */
    public PlacasNegocio(PlacaDAO placasDAO) {
        this.placasDAO = placasDAO;
    }

     /**
     * Busca placas asociadas a un automóvil específico.
     *
     * @param id Identificador del automóvil del que se desean buscar las placas.
     * @return Lista de placas asociadas al automóvil especificado.
     */
    @Override
    public List<Placa> BuscarPorAuto(int id) {
        List<Placa> listaPlacaAuto = placasDAO.AutoEspecifico(id);
        return listaPlacaAuto;
    }
/**
 * Registra una nueva placa en el sistema.
 *
 * @param placas La placa que se desea registrar.
 * @return La placa registrada en el sistema.
 */
    @Override
    public Placa registrarPlaca(Placa placas) {
        List<Placa> lista = placasDAO.todasPlacas();
        for (int i = 0; i < lista.size(); i++) {
            if (placas.getNumeroPlacas() == null) {
                i = lista.size();
            } else if (placas.getNumeroPlacas().equals(lista.get(i).getNumeroPlacas())) {
                System.err.println("La placa ya existe");
                return null;
            }
        }

        Placa placaAgregada = placasDAO.agregarPlacas(placas);
        if (placaAgregada == null) {
            System.err.println("No se pudo agregar la placa");
            return null;
        }

        return placaAgregada;

//
//    @Override
//    public List<Automovil> buscaPorAuto(int idAutomovil) {
//        return placasDAO.AutomovilesAsociados(idAutomovil);
//    }
    }
}
