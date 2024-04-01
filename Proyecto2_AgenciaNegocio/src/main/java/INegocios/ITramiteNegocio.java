/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INegocios;

import dto.ClienteNuevoDTO;
import dto.TramiteNuevoDTO;
import entidades_JPA.Clientes;
import entidades_JPA.Tramite;
import java.time.LocalDate;
import java.util.List;
/**
 * Esta interfaz define los métodos para la lógica de negocio relacionada con los trámites.
 * Contiene métodos para gestionar los trámites realizados en la agencia.
 * 
 * @author Oley
 */
public interface ITramiteNegocio {
 /**
 * Recupera una lista de trámites asociados a un cliente específico.
 * 
 * @param clientes Cliente del que se desean recuperar los trámites.
 * @return Lista de trámites asociados al cliente especificado.
 */
public List<Tramite> listaTramitePersona(Clientes clientes);

/**
 * Recupera una lista de trámites según diferentes filtros.
 * 
 * @param placas Indica si se deben incluir trámites relacionados con placas.
 * @param licencia Indica si se deben incluir trámites relacionados con licencias.
 * @param fechaInicio Fecha de inicio del periodo de tiempo en el que se desean buscar trámites.
 * @param fechaFin Fecha de fin del periodo de tiempo en el que se desean buscar trámites.
 * @param filtro Filtro adicional para la búsqueda de trámites (opcional).
 * @return Lista de trámites que cumplen con los criterios de búsqueda especificados.
 */
    public List<Tramite> listaTramite(boolean placas, boolean licencia, LocalDate fechaInicio, LocalDate fechaFin,String filtro);
}
