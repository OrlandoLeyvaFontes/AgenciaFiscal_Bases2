/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

/**
 * Interfaz IConexion
 * @author Oley
 */
public interface IConexion {

    /**
     * Crea y devuelve un EntityManager para gestionar la conexión con la base
     * de datos.
     *
     * @return EntityManager para conexión con la base de datos.
     * @throws PersistenceException si hay un error al crear la conexión.
     */
    public EntityManager crearConexion() throws PersistenceException;
}
