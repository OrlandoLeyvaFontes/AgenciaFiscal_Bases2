/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INegocios;

import dto.ClienteNuevoDTO;
import dto.LicenciaNuevaDTO;
import entidades_JPA.Clientes;
import entidades_JPA.Licencia;
import entidades_JPA.Tramite;
import java.time.LocalDate;
import java.util.List;

/**
 * Esta interfaz define los métodos para la lógica de negocio relacionada con las licencias.
 * Contiene métodos para gestionar licencias de conducir.
 * 
 * @author Oley
 */
public interface ILicenciaNegocios {
  
 /**
     * Obtiene una lista de licencias asociadas a una persona específica.
     * 
     * @param id El identificador único de la persona para la cual se desean obtener las licencias.
     * @return Una lista de objetos Licencia que representan las licencias asociadas a la persona identificada por el ID.
     */
public List<Licencia> listaLicenciaPersona(int id);


    /**
     * Obtiene una lista de licencias vigentes asociadas a una persona específica.
     * 
     * @param id El identificador único de la persona para la cual se desean obtener las licencias vigentes.
     * @return Una lista de objetos Licencia que representan las licencias vigentes asociadas a la persona identificada por el ID.
     */
public List<Licencia> listaLicenciaPersonaVigentes(int id);
/**
     * Agrega una nueva licencia al sistema.
     * 
     * @param licencia El objeto Licencia que se desea agregar al sistema.
     * @return La licencia agregada al sistema.
     */
    public Licencia agregaLicencia(Licencia licencia);
}
