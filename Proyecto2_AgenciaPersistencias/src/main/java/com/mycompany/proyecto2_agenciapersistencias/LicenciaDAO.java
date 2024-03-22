/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agenciapersistencias;

import com.mycompany.proyecto2_agenciafiscalDTO.LicenciaNuevaDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Licencia;
import com.mycompany.proyecto2_agenciafiscaldominio.Placa;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

/**
 *
 * @author Oley
 */
public class LicenciaDAO implements ILicenciaDAO {

    private IConexion conexionBD;

    public LicenciaDAO(IConexion conexionBD) {
        this.conexionBD = conexionBD;
    }

    @Override
    public Licencia ListaLicencia(Long id) {
        EntityManager entityManager = conexionBD.crearConexion();
        Licencia lice = entityManager.find(Licencia.class, id);
        entityManager.getTransaction().begin();
        entityManager.close();
        return lice;

    }

    @Override
    public Licencia agregarLicencia(LicenciaNuevaDTO LicenciaNueva) {
        EntityManager entityManager = null;
        EntityTransaction transaction = null;
        Licencia licencia = null;

        try {
            entityManager = conexionBD.crearConexion();
            transaction = entityManager.getTransaction();
            transaction.begin();

            licencia = new Licencia(
                    LicenciaNueva.getFehcaVencida(),
                    LicenciaNueva.getFechaExpedi(),
                    LicenciaNueva.getVigencia(),
                    LicenciaNueva.getCosto()
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
        }

        return licencia;
    }

}
