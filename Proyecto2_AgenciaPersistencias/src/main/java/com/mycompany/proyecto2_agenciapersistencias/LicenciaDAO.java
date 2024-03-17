
package com.mycompany.proyecto2_agenciapersistencias;

import com.mycompany.proyecto2_agenciafiscalDTO.LicenciaNuevaDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Licencia;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Guillermo
 */
public class LicenciaDAO implements ILicenciaDAO {
    
    public Licencia agregarLicencia(LicenciaNuevaDTO licenciaNueva) {
       EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction transaction = null;
        Licencia licencia = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("AgenciaPU");
            entityManager = entityManagerFactory.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();

            licencia = new Licencia(
                    licenciaNueva.getFechaEmision(),
                    licenciaNueva.getFechaVigencia(),
                    licenciaNueva.getCosto()
            );

            entityManager.persist(licencia);
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

        return licencia;
    }
    
}
