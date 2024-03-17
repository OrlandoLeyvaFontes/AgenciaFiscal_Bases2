/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agenciapersistencias;

import com.mycompany.proyecto2_agenciafiscalDTO.PlacaNuevoDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Placa;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Oley
 */
public class PlacaDAO implements IPlacasDAO {

    public Placa agregarPlacas(PlacaNuevoDTO placaNueva) {
       EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction transaction = null;
        Placa placa = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("AgenciaPU");
            entityManager = entityManagerFactory.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();

            placa = new Placa(
                    placaNueva.getNumeroAlfaNumerico(),
                    placaNueva.getFechaEmision(),
                    placaNueva.getFechaRecepcion(),
                    placaNueva.getCosto()
            );

            entityManager.persist(placa);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }

        return placa;
    }

}
