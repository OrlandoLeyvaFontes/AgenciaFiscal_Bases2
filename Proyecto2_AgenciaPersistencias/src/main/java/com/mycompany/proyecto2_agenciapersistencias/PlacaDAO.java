/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agenciapersistencias;

import com.mycompany.proyecto2_agenciafiscalDTO.PlacaNuevoDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Automovil;
import com.mycompany.proyecto2_agenciafiscaldominio.Placa;
import com.mycompany.proyecto2_agenciafiscaldominio.Tramite;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Join;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Root;

/**
 *
 * @author Oley
 */
public class PlacaDAO implements IPlacasDAO {

    private IConexion conexionBD;

    public PlacaDAO(IConexion conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public Placa agregarPlacas(Placa placas) {
     EntityManager entityManager = this.conexionBD.crearConexion();
    entityManager.getTransaction().begin();
    try {
        // Verificar si el objeto Automovil asociado a la placa es null
        if (placas.getAutomovil() == null) {
            throw new RuntimeException("El objeto Automovil asociado a la placa es nulo.");
        }

        // Buscar si existe una placa activa para el automóvil
        TypedQuery<Placa> query = entityManager.createQuery(
                "SELECT p FROM Placa p WHERE p.automovil.id = :idAutomovil AND p.estado = :estadoActivo", Placa.class)
                .setParameter("idAutomovil", placas.getAutomovil().getId())
                .setParameter("estadoActivo", "ACTIVA");
        List<Placa> placasActivas = query.getResultList();

        // Si existe una placa activa, cambiar su estado a inactivo
        if (!placasActivas.isEmpty()) {
            Placa placaActiva = placasActivas.get(0);
            placaActiva.setEstado("INACTIVA");
            placaActiva.setFechaInactivio(new GregorianCalendar());
            entityManager.merge(placaActiva);
        }

        // Agregar la nueva placa
        entityManager.persist(placas);
        entityManager.flush();
        entityManager.refresh(placas);
        entityManager.getTransaction().commit();
        return placas;
    } catch (Exception e) {
        entityManager.getTransaction().rollback();
        throw new RuntimeException("Error al agregar placa", e);
    } finally {
        entityManager.close();
    }
    }

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
//                    placaNueva.getNumeroAlfaNumerico(),
//                    placaNueva.getFechaEmision(),
//                    placaNueva.getFechaRecepcion(),
//                    placaNueva.getCosto()
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

    @Override
    public List<Placa> AutoEspecifico(int idAutomovil) {
 EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Placa> query = entityManager.createQuery("SELECT a FROM Placa a WHERE a.automovil.id = :idAutomovil", Placa.class);
        query.setParameter("idAutomovil", idAutomovil);
        List<Placa> listaAutos = query.getResultList();
        entityManager.getTransaction().commit();
        return listaAutos;    }

    @Override
    public List<Placa> todasPlacas() {
        EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Placa> query = entityManager.createQuery("SELECT p FROM Placa p", Placa.class);
        List<Placa> listaPlacas = query.getResultList();
        entityManager.getTransaction().commit();
        return listaPlacas;    }
    public List<Automovil> AutomovilesAsociados(int idCliente) {
        EntityManager entityManager = this.conexionBD.crearConexion();
        entityManager.getTransaction().begin();
        TypedQuery<Placa> query = entityManager.createQuery(
            "SELECT p FROM Placa p WHERE p.tramite.cliente.id = :idCliente", Placa.class);
        query.setParameter("idCliente", idCliente);
        List<Placa> listaPlacas = query.getResultList();

        List<Automovil> listaAutos = new ArrayList<>();
        for (Placa placa : listaPlacas) {
            listaAutos.add(placa.getAutomovil());
        }

        entityManager.getTransaction().commit();
        return listaAutos;
    }
}
