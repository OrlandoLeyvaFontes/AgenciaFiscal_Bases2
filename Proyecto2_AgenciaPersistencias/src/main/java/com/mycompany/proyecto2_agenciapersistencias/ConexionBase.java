/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agenciapersistencias;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceException;

/**
 *
 * @author Oley
 */
public class ConexionBase implements IConexion {

    @Override
    public EntityManager crearConexion() throws PersistenceException {
       EntityManagerFactory managerFactory = Persistence.createEntityManagerFactory("AgenciaPU");
        EntityManager entityManager = managerFactory.createEntityManager();
        return entityManager;
    }

}
