/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

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
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Oley
 */
public class ClientesDAO implements IClientesDAO {
    
    private IConexion conexionBD;

    public ClientesDAO() {
        IConexion conexion = new Conexion();
        this.conexionBD = conexion;
    }
    
    @Override
    public Clientes agregarCliente(Clientes clienteNuevo) {
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

//    @Override
//    public Clientes Checar(String rfc) {
//        EntityManager entity= conexionBD.crearConexion();
//        Query query = entity.createNativeQuery("SELECT * FROM Clientes WHERE rfc = ?", Clientes.class);
//        query.setParameter(1, rfc);
//
//        Clientes cli = null;
//        try {
//            cli = (Clientes) query.getSingleResult();
//        } catch (NoResultException e) {
//            cli = null;
//        }
//        return cli;
//      }
    
    public List<Clientes> consultar(Clientes filtrosConsulta){
        
        EntityManager entityManager = conexionBD.crearConexion();
        CriteriaBuilder builder = entityManager.getCriteriaBuilder();
        
        String nacimiento = null;
        if (filtrosConsulta.getFechaNacimiento()!=null){
            nacimiento = Integer.toString(filtrosConsulta.getFechaNacimiento().getYear());
        }
        
        StringBuilder jpqlQuery = new StringBuilder("SELECT c FROM Clientes c WHERE ");
        StringBuilder and = new StringBuilder("AND ");
        StringBuilder queryNombre = new StringBuilder("c.nombreCompleto LIKE :nombre ");
        StringBuilder queryRfc = new StringBuilder("c.rfc LIKE :rfc ");
        StringBuilder queryNacimiento = new StringBuilder("SUBSTRING(c.fechaNacimiento, 1, 4) = :nacimiento ");
        boolean i=false;
        System.out.println(filtrosConsulta.getNombreCompleto());
        System.out.println(filtrosConsulta.getRfc());
        System.out.println(filtrosConsulta.getFechaNacimiento());
        if (filtrosConsulta.getNombreCompleto()!=null){
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
        if (filtrosConsulta.getFechaNacimiento()!=null){
            if(i){
                jpqlQuery.append(and);
            }
            jpqlQuery.append(queryNacimiento);
        }
        TypedQuery<Clientes> query = entityManager.createQuery(jpqlQuery.toString(), Clientes.class);
        if (filtrosConsulta.getNombreCompleto()!=null){
            query.setParameter("nombre", "%"+filtrosConsulta.getNombreCompleto()+"%");
        }
        if (filtrosConsulta.getRfc()!=null){
            query.setParameter("rfc", "%"+filtrosConsulta.getRfc()+"%");
        }
        if (filtrosConsulta.getFechaNacimiento()!=null){
            query.setParameter("nacimiento", nacimiento);
        }
        List<Clientes> clientes = query.getResultList();
        entityManager.close();
        
        return clientes;
    }
}


