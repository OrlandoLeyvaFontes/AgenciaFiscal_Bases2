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
 *
 * @author Oley
 */
public class Conexion implements IConexion {

    @Override
    public EntityManager crearConexion() throws PersistenceException {
        EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("AgenciaPU");
        EntityManager entityManager = managerFactory.createEntityManager();
        return entityManager;
    }

}
