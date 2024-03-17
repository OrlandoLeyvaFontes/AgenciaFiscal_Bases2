
package com.mycompany.proyecto2_agenciapersistencias;

import com.mycompany.proyecto2_agenciafiscalDTO.AutomovilNuevoDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Automovil;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Oley
 */
public class AutomovilDAO implements IAutomovilDAO {

    @Override
    public Automovil agergarAutomovil(AutomovilNuevoDTO automovilNuevo) {
        EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction transaction = null;
        Automovil automovil = null;
        
        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("AgenciaPU");
            entityManager = entityManagerFactory.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();
            
            automovil = new Automovil(
                automovilNuevo.getNumeroSerie(),
                automovilNuevo.getMarca(),
                automovilNuevo.getLinea(),
                automovilNuevo.getColor(),
                automovilNuevo.getModelo()
            );
            
            entityManager.persist(automovil);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace(); // Manejo de excepciones
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
            if (entityManagerFactory != null) {
                entityManagerFactory.close();
            }
        }
        
        return automovil;
    }
}
