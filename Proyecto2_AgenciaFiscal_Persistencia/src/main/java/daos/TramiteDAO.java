/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades_JPA.Tramite;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Oley
 */
public class TramiteDAO implements ITramiteDAO {

    private IConexion conexionBD;

    public TramiteDAO(IConexion conexionBD) {
        this.conexionBD = conexionBD;
    }

//    @Override
//    public Tramite agergarTramite(TramiteNuevoDTO TramiteNuevo) {
//        EntityManagerFactory entityManagerFactory = null;
//        EntityManager entityManager = null;
//        EntityTransaction transaction = null;
//        Tramite tramite = null;
//
//        try {
//            entityManagerFactory = Persistence.createEntityManagerFactory("AgenciaPU");
//            entityManager = entityManagerFactory.createEntityManager();
//            transaction = entityManager.getTransaction();
//            transaction.begin();
//
//            tramite = new Tramite(
//                    TramiteNuevo.getTipoTramite(),
//                    TramiteNuevo.getFechaRealizacion(),
//                    TramiteNuevo.getNombreSolicitante(),
//                    TramiteNuevo.getCosto()
//            );
//
//            entityManager.persist(tramite);
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null && transaction.isActive()) {
//                transaction.rollback();
//            }
//            e.printStackTrace();
//        } finally {
//            if (entityManager != null) {
//                entityManager.close();
//            }
//            if (entityManagerFactory != null) {
//                entityManagerFactory.close();
//            }
//        }
//
//        return tramite;
//    }

    @Override
    public Tramite agergarTramite(Tramite TramiteNuevo) {
  EntityManagerFactory entityManagerFactory = null;
        EntityManager entityManager = null;
        EntityTransaction transaction = null;
        Tramite tramite = null;

        try {
            entityManagerFactory = Persistence.createEntityManagerFactory("AgenciaPU");
            entityManager = entityManagerFactory.createEntityManager();
            transaction = entityManager.getTransaction();
            transaction.begin();

            tramite = new Tramite(
                    TramiteNuevo.getTipoTramite(),
                    TramiteNuevo.getFechaRealizacion(),
                    TramiteNuevo.getNombreSolicitante()
            );

            entityManager.persist(tramite);
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

        return tramite;    }
}
