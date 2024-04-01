/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import dto.LicenciaNuevaDTO;
import entidades_JPA.Licencia;
import entidades_JPA.Placa;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 * Clase LicenciaDAO
 * @author Oley
 */
public class LicenciaDAO implements ILicenciaDAO {

    private IConexion conexionBD;
    /**
     * Constructor
     * @param conexionBD Conexion
     */
    public LicenciaDAO(IConexion conexionBD) {
        this.conexionBD = conexionBD;
    }

//    @Override
//    public Licencia ListaLicencia(Long id) {
//       EntityManager entityManager = conexionBD.crearConexion();
//        Licencia licencia = null;
//        try {
//            licencia = entityManager.find(Licencia.class, id);
//        } finally {
//            if (entityManager != null) {
//                entityManager.close();
//            }
//        }
//        return licencia;
//
//    }
//
//    @Override
//    public Licencia agregarLicencia(LicenciaNuevaDTO LicenciaNueva) {
//    EntityManager entityManager = null;
//    EntityTransaction transaction = null;
//    Licencia licencia = null;
//
//    try {
//        entityManager = conexionBD.crearConexion();
//        transaction = entityManager.getTransaction();
//        transaction.begin();
//
//        // Validación de parámetros
//        if (LicenciaNueva.getFechaExpedi() == null || LicenciaNueva.getVigencia() == null || !LicenciaNueva.getVigencia().matches("\\d+")) {
//            throw new IllegalArgumentException("La fecha de expedición y la vigencia deben ser proporcionadas y la vigencia debe ser un número válido.");
//        }
//
//        // Calcula la fecha de vencimiento
//        int vigenciaEnDias = Integer.parseInt(LicenciaNueva.getVigencia());
//        Calendar fechaVencimiento = calcularFechaVencimiento(LicenciaNueva.getFechaExpedi(), LicenciaNueva.getVigencia());
//
//        // Crear nueva instancia de Licencia
//        licencia = new Licencia(
//            fechaVencimiento,
//            LicenciaNueva.getFechaExpedi(),
//            LicenciaNueva.getVigencia(),
//            LicenciaNueva.getCosto()
//        );
//
//        entityManager.persist(licencia);
//        transaction.commit();
//    } catch (Exception e) {
//        if (transaction != null && transaction.isActive()) {
//            transaction.rollback();
//        }
//        e.printStackTrace();
//        // Lanzar una excepción personalizada aquí si es necesario
//    } finally {
//        if (entityManager != null) {
//            entityManager.close();
//        }
//    }
//
//    return licencia;
//    }
    /**
     * Lista de licencia de persona
     * @param id Id Cliente
     * @return Lista de licencias
     */
    @Override
    public List<Licencia> listaLicenciaPersona(int id) {
        EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Licencia> query = entityManager.createQuery("SELECT l FROM Licencia l WHERE l.cliente.id = :idCliente", Licencia.class);
        query.setParameter("idCliente", id);
        List<Licencia> listaLicencia = query.getResultList();
        entityManager.getTransaction().commit();
        return listaLicencia;    }
    /**
     * Lista de licencias Vigentes
     * @param id ID cliente
     * @return Lista de licencias
     */
    @Override
    public List<Licencia> listaLicenciaPersonaVigentes(int id) {
        EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Licencia> query = entityManager.createQuery("SELECT l FROM Licencia l "
                + "WHERE l.Cliente.id = :idCliente AND l.FechaVigencia > CURRENT_DATE", Licencia.class);
        query.setParameter("idCliente", id);
        List<Licencia> listaLicencia = query.getResultList();
        entityManager.getTransaction().commit();
        return listaLicencia;    }
    /**
     * Agrega licencia
     * @param licencia Licencia
     * @return Licencia
     */
    @Override
    public Licencia agregaLicencia(Licencia licencia) {
        EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        try {
            entityManager.persist(licencia);
        } catch (Exception e) {
            return null;
        }
        entityManager.getTransaction().commit();
        return licencia;
    }
    
    
}
