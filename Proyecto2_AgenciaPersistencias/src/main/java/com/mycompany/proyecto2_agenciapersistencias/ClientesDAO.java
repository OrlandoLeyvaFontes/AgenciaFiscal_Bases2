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
                    clienteNuevo.getTelefono()
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
EntityManager entity= conexionBD.crearConexion();
 Query query = entity.createNativeQuery("SELECT * FROM Clientes WHERE rfc = ?", Clientes.class);
        query.setParameter(1, rfc);

        Clientes cli = null;
        try {
            cli = (Clientes) query.getSingleResult();
        } catch (NoResultException e) {
            cli = null;
        }
        return cli;
        }

   
}


