/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import dto.AutomovilNuevoDTO;
import entidades_JPA.Automovil;
import java.util.List;

/**
 * Interfaz IAutomoviliDAO
 * @author Oley
 */
public interface IAutomovilDAO {
//    public Automovil agergarAutomovil(AutomovilNuevoDTO automovilNuevo);

/**
 * Obtiene una lista de automóviles asociados a un cliente específico.
 * 
 * @param id Identificador del cliente del que se desean obtener los automóviles.
 * @return Lista de automóviles asociados al cliente especificado.
 */
public List<Automovil> listaAutosClientes(int id);

/**
 * Agrega un nuevo automóvil al sistema.
 * 
 * @param automovil Automóvil que se desea agregar.
 * @return El automóvil agregado al sistema.
 */
public Automovil agregaAutomovil(Automovil automovil);

/**
 * Obtiene una lista de todos los automóviles almacenados en el sistema.
 * 
 * @return Lista de todos los automóviles almacenados en el sistema.
 */
public List<Automovil> listaAutomovil();

}
