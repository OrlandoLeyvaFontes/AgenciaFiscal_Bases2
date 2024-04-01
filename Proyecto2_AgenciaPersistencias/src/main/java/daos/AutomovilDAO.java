/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import dto.AutomovilNuevoDTO;
import entidades_JPA.Automovil;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * Clase AutomovilDAO
 * @author Oley
 */
public class AutomovilDAO implements IAutomovilDAO {
    private IConexion conexionBD;
    /**
     * Constructor
     * @param conexionBD Conexion
     */
    public AutomovilDAO(IConexion conexionBD) {
            this.conexionBD = conexionBD;
    }
//    @Override
//    public Automovil agergarAutomovil(AutomovilNuevoDTO automovilNuevo) {
//        EntityManagerFactory entityManagerFactory = null;
//        EntityManager entityManager = null;
//        EntityTransaction transaction = null;
//        Automovil automovil = null;
//        
//        try {
//            entityManagerFactory = Persistence.createEntityManagerFactory("AgenciaPU");
//            entityManager = entityManagerFactory.createEntityManager();
//            transaction = entityManager.getTransaction();
//            transaction.begin();
//            
//            automovil = new Automovil(
//                automovilNuevo.getNumeroSerie(),
//                automovilNuevo.getMarca(),
//                automovilNuevo.getLinea(),
//                automovilNuevo.getColor(),
//                automovilNuevo.getModelo()
//            );
//            
//            entityManager.persist(automovil);
//            transaction.commit();
//        } catch (Exception e) {
//            if (transaction != null && transaction.isActive()) {
//                transaction.rollback();
//            }
//            e.printStackTrace(); // Manejo de excepciones
//        } finally {
//            if (entityManager != null) {
//                entityManager.close();
//            }
//            if (entityManagerFactory != null) {
//                entityManagerFactory.close();
//            }
//        }
//        
//        return automovil;
//    }
    /**
     * Obtiene una lista de automoviles de la base de datos segun id del cliente
     * @param idCliente ID del Cliente
     * @return Lista de automoviles
     */
    @Override
    public List<Automovil> listaAutosClientes(int idCliente) {
        EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Automovil> query = entityManager.createQuery("SELECT a FROM Automovil a WHERE a.cliente.id = :idCliente", Automovil.class);
        query.setParameter("idCliente", idCliente);
        List<Automovil> listaAutos = query.getResultList();
        entityManager.getTransaction().commit();
        return listaAutos;
    }
    /**
     * Agrega un automovil a la base de datos
     * @param Automovil Automovil
     * @return Automovil
     */
    @Override
    public Automovil agregaAutomovil(Automovil Automovil) {
        EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        try {
            entityManager.persist(Automovil);
        } catch (Exception e) {
            return null;
        }
        entityManager.getTransaction().commit();
        return Automovil;
    }
    /**
     * Obtiene una lista de automoviles de la base de datos
     * @return Lista Automovil
     */
    @Override
    public List<Automovil> listaAutomovil() {
        EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Automovil> query = entityManager.createQuery("SELECT a FROM Automovil a", Automovil.class);
        List<Automovil> listaAuto = query.getResultList();
        entityManager.getTransaction().commit();
        return listaAuto;
    }
    
}
