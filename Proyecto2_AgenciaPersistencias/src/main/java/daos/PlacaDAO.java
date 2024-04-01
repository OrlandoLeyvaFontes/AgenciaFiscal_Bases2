/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades_JPA.Placa;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;


/**
 * Clase PlacaDAO
 * @author Oley
 */
public class PlacaDAO implements IPlacasDAO {

    private IConexion conexionBD;
    /**
     * Cosntructor
     * @param conexionBD Conexion
     */
    public PlacaDAO(IConexion conexionBD) {
        this.conexionBD = conexionBD;
    }
    /**
     * Agrega Placa a base de datos
     * @param placa Placa
     * @return Placa
     */
    @Override
    public Placa agregarPlacas(Placa placa) {
        
        String letras = "";
        for (int i=0; i<3; i++){ 
            int codigoAscii = (int)Math.floor(Math.random()*(90 - 65)+65); 
            letras = letras + (char)codigoAscii; 
        }
        letras=letras+"-";
        
        
        EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        try {
            if (placa.getAutomovil() == null) {
                throw new RuntimeException("El objeto Automovil asociado a la placa es nulo.");
            }

            TypedQuery<Placa> query = entityManager.createQuery(
                    "SELECT p FROM Placa p WHERE p.automovil.id = :idAutomovil AND p.estado = :estadoActivo", Placa.class)
                    .setParameter("idAutomovil", placa.getAutomovil().getId())
                    .setParameter("estadoActivo", "ACTIVA");
            List<Placa> placasActivas = query.getResultList();

            if (!placasActivas.isEmpty()) {
                Placa placaActiva = placasActivas.get(0);
                placaActiva.setEstado("INACTIVA");
                placaActiva.setFechaInactivo(new GregorianCalendar());
                entityManager.merge(placaActiva);
            }
            
            entityManager.persist(placa);
            entityManager.flush();
            
            String numPlaca = letras+String.format("%03d", placa.getId());
            placa.setNumeroPlacas(numPlaca);
            entityManager.merge(placa);
            entityManager.flush();
            
            entityManager.refresh(placa);
            entityManager.getTransaction().commit();
            return placa;
        } catch (Exception e) {
            entityManager.getTransaction().rollback();
            throw new RuntimeException("Error al agregar placa", e);
        } finally {
            entityManager.close();
        }
    }
//
//    public Placa agregarPlacas(PlacaNuevoDTO placaNueva) {
//       EntityManagerFactory entityManagerFactory = null;
//        EntityManager entityManager = null;
//        EntityTransaction transaction = null;
//        Placa placa = null;
//
//        try {
//            entityManagerFactory = Persistence.createEntityManagerFactory("AgenciaPU");
//            entityManager = entityManagerFactory.createEntityManager();
//            transaction = entityManager.getTransaction();
//            transaction.begin();
//
//            placa = new Placa(
//                    placaNueva.getNumeroPlacas(),
//                    placaNueva.getEstado(),
//                    placaNueva.getFechaInactivio(),
//                    placaNueva.getAutomovil()
//                  
//            );
//
//            entityManager.persist(placa);
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
//        return placa;
//    }
    /**
     * Lista de placas de un auto
     * @param idAutomovil ID Auto
     * @return Lista placas
     */
    @Override
    public List<Placa> AutoEspecifico(int idAutomovil) {
        EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Placa> query = entityManager.createQuery(
                "SELECT p FROM Placa p WHERE p.automovil.id = :idAutomovil", Placa.class);
        query.setParameter("idAutomovil", idAutomovil);
        List<Placa> listaPlacas = query.getResultList();
        entityManager.getTransaction().commit();
        return listaPlacas;
    }
    /**
     * Obtiene la ultima placa activa del auto
     * @param numPlaca Numero alfanumerico
     * @return Placa
     */
    @Override
    public Placa autoPlaca(String numPlaca) {
        EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Placa> query = entityManager.createQuery(
                "SELECT p FROM Placa p WHERE p.numeroPlacas = :numPlaca", Placa.class);
        query.setParameter("numPlaca", numPlaca);
        List<Placa> listaPlacas = query.getResultList();
        entityManager.getTransaction().commit();
        return listaPlacas.get(0);
    }
    /**
     * Lista de placas
     * @return Lista de placas
     */
    @Override
    public List<Placa> todasPlacas() {
        EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Placa> query = entityManager.createQuery("SELECT p FROM Placa p", Placa.class);
        List<Placa> listaPlacas = query.getResultList();
        entityManager.getTransaction().commit();
        return listaPlacas;    }
}
