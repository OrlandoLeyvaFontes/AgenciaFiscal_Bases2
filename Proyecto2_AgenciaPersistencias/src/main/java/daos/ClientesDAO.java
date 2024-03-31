/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import dto.ClienteNuevoDTO;
import dto.ConsultaClienteDTO;
import entidades_JPA.Clientes;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;

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
    
    @Override
    public List<Clientes> consultar(ConsultaClienteDTO filtrosConsulta){
        
        EntityManager entityManager = conexionBD.crearConexion();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        
        StringBuilder jpqlQuery = new StringBuilder("SELECT c FROM Clientes c WHERE ");
        StringBuilder and = new StringBuilder("AND ");
        StringBuilder queryNombre = new StringBuilder("c.nombreCompleto LIKE :nombre ");
        StringBuilder queryRfc = new StringBuilder("c.rfc LIKE :rfc ");
        StringBuilder queryNacimiento = new StringBuilder("SUBSTRING(c.fechaNacimiento, 1, 4) = :nacimiento ");
        
        boolean i=false;
        if (filtrosConsulta.getNombre()!=null){
            jpqlQuery.append(queryNombre);
            i=true;
        }
        if (filtrosConsulta.getRfc()!=null){
            if(i){
                jpqlQuery.append(and);
            }
            jpqlQuery.append(queryRfc);
            i=true;
        }
        if (filtrosConsulta.getNacimiento()!=null){
            if(i){
                jpqlQuery.append(and);
            }
            jpqlQuery.append(queryNacimiento);
        }
        TypedQuery<Clientes> query = entityManager.createQuery(jpqlQuery.toString(), Clientes.class);
        if (filtrosConsulta.getNombre()!=null){
            query.setParameter("nombre", "%"+filtrosConsulta.getNombre()+"%");
        }
        if (filtrosConsulta.getRfc()!=null){
            query.setParameter("rfc", "%"+filtrosConsulta.getRfc()+"%");
        }
        if (filtrosConsulta.getNacimiento()!=null){
            query.setParameter("nacimiento", filtrosConsulta.getNacimiento());
        }
        List<Clientes> clientes = query.getResultList();
        entityManager.close();
        
        return clientes;
    }
    
}
