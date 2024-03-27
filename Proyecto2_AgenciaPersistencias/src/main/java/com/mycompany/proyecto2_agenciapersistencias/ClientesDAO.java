/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agenciapersistencias;

import com.mycompany.proyecto2_agenciafiscalDTO.ClienteNuevoDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Clientes;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

/**
 *
 * @author Oley
 */
public class ClientesDAO implements IClientesDAO {

    private IConexion conexionBD;

    public ClientesDAO(IConexion conexion) {
        this.conexionBD = conexion;
    }

    @Override
    public Clientes agregarCliente(ClienteNuevoDTO clienteNuevo) {
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AgenciaPU");
        EntityManager entityManager = entityManagerFactory.createEntityManager();
        EntityTransaction transaction = null;
        Clientes cliente = null;

        try {
            transaction = entityManager.getTransaction();
            transaction.begin();

            cliente = new Clientes(
                    clienteNuevo.getRfc(),
                    clienteNuevo.getNombreCompleto(),
                    clienteNuevo.getFechaNacimiento(),
                    clienteNuevo.getTelefono(),
                    clienteNuevo.isDiscapacitado()
            );

            entityManager.persist(cliente);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            e.printStackTrace(); // Manejo de excepciones
        } finally {
            entityManager.close();
            entityManagerFactory.close();
        }

        return cliente;
    }

   @Override
    public Clientes Checar(String rfc) {
        EntityManager entityManager = null;
        try {
            entityManager = conexionBD.crearConexion();
            Query query = entityManager.createQuery("SELECT c FROM Clientes c WHERE c.rfc = :rfc", Clientes.class);
            query.setParameter("rfc", rfc);
            return (Clientes) query.getSingleResult();
        } catch (NoResultException e) {
            return null; // No se encontró ningún cliente con el RFC dado
        } finally {
            if (entityManager != null) {
                entityManager.close();
            }
        }
    }
    
}
