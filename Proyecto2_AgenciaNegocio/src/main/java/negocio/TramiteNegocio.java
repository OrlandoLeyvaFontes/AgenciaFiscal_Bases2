/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import INegocios.ILicenciaNegocios;
import INegocios.ITramiteNegocio;
import dto.LicenciaNuevaDTO;
import dto.TramiteNuevoDTO;
import entidades_JPA.Clientes;
import entidades_JPA.Licencia;
import entidades_JPA.Tramite;
import daos.ITramiteDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase que implementa la interfaz ITramiteNegocio para manejar operaciones relacionadas con trámites.
 *
 * @author Oley
 */
public class TramiteNegocio implements ITramiteNegocio{
    private ITramiteDAO itramiteDAO;
    /**
     * Constructor
     */
    public TramiteNegocio() {
    }


//    @Override
//    public Tramite agregarTramite(TramiteNuevoDTO TramiteNuevo) {
//        return itramiteDAO.agergarTramite(TramiteNuevo);
//    }
/**
 * Obtiene una lista de trámites asociados a un cliente específico.
 * 
 * @param clientes El objeto Clientes para el cual se desean obtener los trámites.
 * @return Una lista de objetos Tramite que representan los trámites asociados al cliente.
 */
    @Override
    public List<Tramite> listaTramitePersona(Clientes clientes) {
           return itramiteDAO.listaTramitePersona(clientes);

    }
/**
 * Obtiene una lista de trámites filtrados según los criterios especificados.
 * 
 * @param placas Indica si se deben incluir trámites relacionados con placas.
 * @param licencia Indica si se deben incluir trámites relacionados con licencias.
 * @param fechaInicio La fecha de inicio del intervalo de tiempo para el filtro.
 * @param fechaFin La fecha de fin del intervalo de tiempo para el filtro.
 * @param filtro El filtro para buscar trámites por nombre de cliente.
 * @return Una lista de objetos Tramite que representan los trámites filtrados.
 */
    @Override
    public List<Tramite> listaTramite(boolean placas, boolean licencia, LocalDate fechaInicio, LocalDate fechaFin, String filtro) {
  List<Tramite> listaTramiteFiltrada = itramiteDAO.listaTramite(placas, licencia, fechaInicio, fechaFin);
    
    if (!filtro.isEmpty()) {
        List<Tramite> listaPorNombre = new ArrayList<>();

        for (Tramite tramite : listaTramiteFiltrada) {
            String nombreCompleto = tramite.getCliente().getNombreCompleto();
            if (nombreCompleto.toLowerCase().contains(filtro.toLowerCase())) {
                listaPorNombre.add(tramite);
            }
        }
        
        listaTramiteFiltrada = listaPorNombre;
    }
    
    return listaTramiteFiltrada;
    
    }
   
    
    }
