/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

/**
 * Clase para conectarse a la base de datos
 * @author Oley
 */
public class ConexionBase implements IConexion {

    /**
     * Constructor
     */
    public ConexionBase() {
    }
    
    /**
     * Crea conexion con la base de datos
     * @return EntityManager
     * @throws PersistenceException Error de conexion
     */
    @Override
    public EntityManager crearConexion() throws PersistenceException {
       EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("AgenciaPU");
        EntityManager entityManager = managerFactory.createEntityManager();
        return entityManager;
    }

}
