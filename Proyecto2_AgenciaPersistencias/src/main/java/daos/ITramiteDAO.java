/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import dto.ConsultaTramiteDTO;
import dto.TramiteNuevoDTO;
import entidades_JPA.Clientes;
import entidades_JPA.Tramite;
import java.time.LocalDate;
import java.util.List;

/**
 * Interfaz ITramiteDAO
 * @author Oley
 */
public interface ITramiteDAO {

    /**
     * Recupera una lista de trámites basada en los criterios proporcionados.
     *
     * @param placas Indica si se deben incluir trámites relacionados con
     * placas.
     * @param licencia Indica si se deben incluir trámites relacionados con
     * licencias.
     * @param fechaInicio Fecha de inicio del período para buscar trámites.
     * @param fechaFin Fecha de fin del período para buscar trámites.
     * @return Lista de trámites que cumplen con los criterios de búsqueda.
     */
    public List<Tramite> listaTramite(boolean placas, boolean licencia, LocalDate fechaInicio, LocalDate fechaFin);

    /**
     * Recupera una lista de trámites asociados a un cliente específico.
     *
     * @param clientes Cliente del que se desean recuperar los trámites.
     * @return Lista de trámites asociados al cliente especificado.
     */
    public List<Tramite> listaTramitePersona(Clientes clientes);

    /**
     * Recupera una lista de trámites asociados a un cliente específico mediante
     * su identificador.
     *
     * @param id Identificador del cliente del que se desean recuperar los
     * trámites.
     * @return Lista de trámites asociados al cliente especificado por su
     * identificador.
     */
    public List<Tramite> listaTramitePersona(Long id);

    /**
     * Recupera una lista de trámites basada en los criterios proporcionados en
     * un objeto ConsultaTramiteDTO.
     *
     * @param consulta Objeto ConsultaTramiteDTO que contiene los criterios de
     * búsqueda.
     * @return Lista de trámites que cumplen con los criterios de búsqueda
     * especificados en el objeto ConsultaTramiteDTO.
     */
    public List<Tramite> listaTramiteReporte(ConsultaTramiteDTO consulta);
}
