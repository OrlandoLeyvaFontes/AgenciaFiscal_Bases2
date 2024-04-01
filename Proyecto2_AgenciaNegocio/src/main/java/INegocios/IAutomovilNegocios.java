/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INegocios;

import entidades_JPA.Automovil;
import entidades_JPA.Clientes;
import java.util.List;

/**
 * Descripción de la interfaz IAutomovilNegocios.
 * Esta interfaz define los métodos para la lógica de negocio relacionada con los automóviles.
 * @author Oley
 */
public interface IAutomovilNegocios {
 
    /**
     * Registra un nuevo automóvil en el sistema.
     * 
     * @param automovil El objeto Automovil que se va a registrar.
     * @return El automóvil registrado, o null si no se pudo registrar.
     */
public Automovil registrarAutomovil(Automovil automovil);

 /**
     * Obtiene una lista de automóviles asociados a un cliente específico.
     * 
     * @param id El identificador del cliente.
     * @return Una lista de objetos Automovil asociados al cliente.
     */
public List<Automovil> listaAutosClientes(int id);


}
