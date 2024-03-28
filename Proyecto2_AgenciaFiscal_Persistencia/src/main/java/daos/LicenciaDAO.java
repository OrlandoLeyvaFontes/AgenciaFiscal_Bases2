/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades_JPA.Licencia;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

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
    public Licencia agregarLicencia(Licencia LicenciaNueva) {
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
