/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Pruebas;

import com.mycompany.proyecto2_agenciafiscaldominio.Clientes;
import com.mycompany.proyecto2_agenciafiscaldominio.Licencia;
import com.mycompany.proyecto2_agenciapersistencias.ClientesDAO;
import com.mycompany.proyecto2_agenciapersistencias.ConexionBase;
import com.mycompany.proyecto2_agenciapersistencias.IClientesDAO;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author Oley
 */
public class Pruebas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        // Crea una instancia de ClientesDAO con una nueva instancia de ConexionBase
//        IClientesDAO clientesDAO = new ClientesDAO(new ConexionBase());
//
//        // Llama al método Checar con un RFC válido
//        String rfcBuscar = "ABCDE123456F";
//        Clientes clienteEncontrado = clientesDAO.Checar(rfcBuscar);
//
//        // Verifica si se encontró un cliente
//        if (clienteEncontrado != null) {
//            System.out.println("Cliente encontrado: " + clienteEncontrado.getNombreCompleto());
//            System.out.println("Telefono: " + clienteEncontrado.getTelefono());
//        } else {
//            System.out.println("Cliente no encontrado para RFC: " + rfcBuscar);
//        }
    
//    
//        // Crear el EntityManagerFactory utilizando la unidad de persistencia definida en persistence.xml
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AgenciaPU");
//
//        // Obtener el EntityManager
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        // Crear una instancia de Cliente
//        Clientes cliente = new Clientes();
//        cliente.setNombreCompleto("eduardo medina");
//        cliente.setRfc("ABCD32333456F");
//        cliente.setTelefono("123452222");
//
//        // Crear una instancia de Licencia
//        Licencia licencia = new Licencia();
//        licencia.setFechaExpedi(Calendar.getInstance()); // Usar fecha actual
//        licencia.setFehcaVencida(Calendar.getInstance()); // Usar fecha actual
//        licencia.setVigencia("Vigente"); // Definir la vigencia
//        licencia.setCosto(600.0f); // Establecer el costo
//        licencia.setCliente(cliente); // Asignar el cliente
//        
//
//        // Iniciar una transacción
//        EntityTransaction transaction = entityManager.getTransaction();
//        transaction.begin();
//
//        // Persistir el cliente y la licencia
//        entityManager.persist(cliente);
//        entityManager.persist(licencia);
//
//        // Confirmar la transacción
//        transaction.commit();
//
//        // Cerrar el EntityManager y el EntityManagerFactory
//        entityManager.close();
//        entityManagerFactory.close();
//    }
   
// String rfc = "RFC123456789";
//        String nombreCompleto = "Nombre Apellido";
//        Calendar fechaNacimiento = Calendar.getInstance();
//        String telefono = "1234567890";
//        Boolean discapacitado = false;
//
//        Clientes nuevoCliente = new Clientes(rfc, nombreCompleto, fechaNacimiento, telefono, discapacitado);
//
//        // Persistir el cliente en la base de datos
//        EntityManagerFactory emf = Persistence.createEntityManagerFactory("AgenciaPU");
//        EntityManager em = emf.createEntityManager();
//        EntityTransaction transaction = em.getTransaction();
//        
//        try {
//            transaction.begin();
//            em.persist(nuevoCliente);
//            transaction.commit();
//            System.out.println("Cliente creado y guardado en la base de datos.");
//        } catch (Exception e) {
//            if (transaction != null && transaction.isActive()) {
//                transaction.rollback();
//            }
//            System.out.println("Error al guardar el cliente en la base de datos: " + e.getMessage());
//        } finally {
//            em.close();
//            emf.close();
//        }
     Clientes cliente = new Clientes();
        cliente.setNombreCompleto("pedro siaz");
        cliente.setRfc("RFC123996789");
        cliente.setTelefono("1994567890");
        cliente.setDiscapacitado(false); // Asignar un valor apropiado para discapacitado
cliente.setFechaNacimiento(Calendar.getInstance()); // Asignar una fecha válida

        // Crear una instancia de EntityManagerFactory utilizando la unidad de persistencia definida en persistence.xml
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AgenciaPU");

        // Obtener el EntityManager
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        // Iniciar una transacción
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        try {
            // Persistir el cliente
            entityManager.persist(cliente);

            // Confirmar la transacción
            transaction.commit();

            System.out.println("Cliente creado y guardado en la base de datos.");
        } catch (Exception e) {
            if (transaction != null && transaction.isActive()) {
                transaction.rollback();
            }
            System.out.println("Error al guardar el cliente en la base de datos: " + e.getMessage());
        } finally {
            // Cerrar el EntityManager y el EntityManagerFactory
            entityManager.close();
            entityManagerFactory.close();
        }
    
    }
    }
    










