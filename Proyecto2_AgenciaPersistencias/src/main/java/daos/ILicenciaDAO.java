/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import dto.ClienteNuevoDTO;
import dto.LicenciaNuevaDTO;
import entidades_JPA.Licencia;
import java.util.List;

/**
 * Interfaz ILicenciaDAO
 * @author Oley
 */
public interface ILicenciaDAO {
/**
 * Recupera una lista de licencias asociadas a una persona específica mediante su identificador.
 * 
 * @param id Identificador de la persona del que se desean recuperar las licencias.
 * @return Lista de licencias asociadas a la persona especificada por su identificador.
 */
public List<Licencia> listaLicenciaPersona(int id);

/**
 * Recupera una lista de licencias vigentes asociadas a una persona específica mediante su identificador.
 * 
 * @param id Identificador de la persona del que se desean recuperar las licencias vigentes.
 * @return Lista de licencias vigentes asociadas a la persona especificada por su identificador.
 */
public List<Licencia> listaLicenciaPersonaVigentes(int id);

/**
 * Agrega una nueva licencia al sistema.
 * 
 * @param licencia Licencia que se desea agregar al sistema.
 * @return La licencia agregada al sistema.
 */
public Licencia agregaLicencia(Licencia licencia);
}
