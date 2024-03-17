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
import javax.persistence.Persistence;

/**
 *
 * @author Oley
 */
public class ClientesDAO implements IClientesDAO {

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
}


