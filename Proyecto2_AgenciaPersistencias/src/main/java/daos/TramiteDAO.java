/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import dto.ConsultaTramiteDTO;
import dto.TramiteNuevoDTO;
import entidades_JPA.Clientes;
import entidades_JPA.Licencia;
import entidades_JPA.Placa;
import entidades_JPA.Tramite;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

/**
 *
 * @author Oley
 */
/**
 * Esta clase implementa la interfaz ITramiteDAO y proporciona funcionalidades
 * para acceder y manipular los datos de los trámites en la base de datos.
 */
public class TramiteDAO implements ITramiteDAO {

    /**
     * Objeto para la gestión de la conexión a la base de datos.
     */
    private IConexion conexionBD;

    /**
     * Constructor de la clase TramiteDAO.
     *
     * @param conexionBD Objeto para la gestión de la conexión a la base de
     * datos.
     */
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
//    @Override
//    public Tramite agergarTramite(TramiteNuevoDTO TramiteNuevo) {
//  EntityManagerFactory entityManagerFactory = null;
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
//                    TramiteNuevo.getNombreSolicitante()
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
//        return tramite;    }
    /**
     * Recupera una lista de trámites basada en los criterios proporcionados.
     *
     * @param tipo1 Indica si se deben incluir trámites de tipo 1.
     * @param tipo2 Indica si se deben incluir trámites de tipo 2.
     * @param fechaInicio Fecha de inicio del período para buscar trámites.
     * @param fechaFin Fecha de fin del período para buscar trámites.
     * @return Lista de trámites que cumplen con los criterios de búsqueda.
     */
    @Override
    public List<Tramite> listaTramite(boolean tipo1, boolean tipo2, LocalDate fechaInicio, LocalDate fechaFin) {
        EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Tramite> criteriaQuery = criteriaBuilder.createQuery(Tramite.class);
        Root<Tramite> tramite = criteriaQuery.from(Tramite.class);
        criteriaQuery.select(tramite);

        Join<Tramite, Clientes> persona = tramite.join("persona");

        List<Predicate> predicados = new ArrayList<Predicate>();

        if (tipo1 && !tipo2) {
            Predicate p1 = criteriaBuilder.equal(criteriaBuilder.literal(Licencia.class), tramite.type());
            predicados.add(p1);
        } else if (tipo2 && !tipo1) {
            Predicate p2 = criteriaBuilder.equal(criteriaBuilder.literal(Placa.class), tramite.type());
            predicados.add(p2);
        } else if (tipo1 && tipo2) {
            Predicate p1 = criteriaBuilder.equal(criteriaBuilder.literal(Licencia.class), tramite.type());
            Predicate p2 = criteriaBuilder.equal(criteriaBuilder.literal(Placa.class), tramite.type());
            predicados.add(criteriaBuilder.or(p1, p2));
        }
        if (fechaInicio != null && fechaFin != null) {
            java.sql.Date fechaInicioSQL = java.sql.Date.valueOf(fechaInicio);
            java.sql.Date fechaFinSQL = java.sql.Date.valueOf(fechaFin);
            predicados.add(criteriaBuilder.between(tramite.get("fechaTramite"), fechaInicioSQL, fechaFinSQL));
        }

        if (!predicados.isEmpty()) {
            criteriaQuery.where(criteriaBuilder.and(predicados.toArray(new Predicate[predicados.size()])));
        }

        TypedQuery<Tramite> query = entityManager.createQuery(criteriaQuery);
        List<Tramite> listaTramites = query.getResultList();
        entityManager.getTransaction().commit();

        return listaTramites;
    }

    /**
     * Recupera una lista de trámites asociados a un cliente específico.
     *
     * @param clientes Cliente del que se desean recuperar los trámites.
     * @return Lista de trámites asociados al cliente especificado.
     */
    @Override
    public List<Tramite> listaTramitePersona(Clientes clientes) {
        EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Tramite> query = entityManager.createQuery("SELECT t FROM Tramite t WHERE t.persona.id = :idCliente", Tramite.class);
        query.setParameter("idCliente", clientes.getId());
        List<Tramite> listaTramite = query.getResultList();
        entityManager.getTransaction().commit();
        return listaTramite;
    }
 /**
     * Recupera una lista de trámites asociados a un cliente específico mediante su identificador.
     * 
     * @param id Identificador del cliente del que se desean recuperar los trámites.
     * @return Lista de trámites asociados al cliente especificado por su identificador.
     */
    @Override
    public List<Tramite> listaTramitePersona(Long id) {
        EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Tramite> query = entityManager.createQuery("SELECT t FROM Tramite t WHERE t.cliente.id = :id", Tramite.class);
        query.setParameter("id", id);
        List<Tramite> listaTramite = query.getResultList();
        entityManager.getTransaction().commit();
        entityManager.close();
        return listaTramite;
    }
  /**
     * Recupera una lista de trámites basada en los criterios proporcionados en un objeto ConsultaTramiteDTO.
     * 
     * @param consulta Objeto ConsultaTramiteDTO que contiene los criterios de búsqueda.
     * @return Lista de trámites que cumplen con los criterios de búsqueda especificados en el objeto ConsultaTramiteDTO.
     */
    @Override
    public List<Tramite> listaTramiteReporte(ConsultaTramiteDTO consulta) {
        EntityManager entityManager = this.conexionBD.crearConexion();
        StringBuilder jpqlQuery = new StringBuilder("SELECT t FROM Tramite t WHERE ");
        StringBuilder and = new StringBuilder("AND ");
        StringBuilder queryNombre = new StringBuilder("t.cliente.nombreCompleto LIKE :nombre ");
        StringBuilder queryTramite = new StringBuilder("TYPE(t) = :tipo ");
        StringBuilder queryPeriodo = new StringBuilder("t.fechaTramite > :inicio AND t.fechaTramite <= :fin");

        boolean i = false;
        if (consulta.getNombre() != null) {
            jpqlQuery.append(queryNombre);
            i = true;
        }
        if (consulta.getTramite() != null) {
            if (i) {
                jpqlQuery.append(and);
            }
            jpqlQuery.append(queryTramite);
            i = true;
        }
        if (consulta.getInicio() != null && consulta.getFin() != null) {
            if (i) {
                jpqlQuery.append(and);
            }
            jpqlQuery.append(queryPeriodo);
        }

        TypedQuery<Tramite> query = entityManager.createQuery(jpqlQuery.toString(), Tramite.class);
        if (consulta.getNombre() != null) {
            query.setParameter("nombre", "%" + consulta.getNombre() + "%");
        }
        if (consulta.getTramite() != null) {
            query.setParameter("tipo", consulta.getTramite());
        }
        if (consulta.getInicio() != null && consulta.getFin() != null) {
            query.setParameter("inicio", consulta.getInicio());
            query.setParameter("fin", consulta.getFin());
        }
        List<Tramite> listaTramite = query.getResultList();
        entityManager.close();
        return listaTramite;
    }

}
