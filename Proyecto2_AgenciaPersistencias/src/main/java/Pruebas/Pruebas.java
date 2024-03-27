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
    
    
        // Crear instancia de Cliente
        Clientes cliente = new Clientes();
        cliente.setNombreCompleto("roberto medina");
        cliente.setRfc("ABCDE1333456F");
        cliente.setTelefono("1234567890");
        // Puedes establecer más atributos según sea necesario

        // Crear instancia de Licencia
        Licencia licencia = new Licencia();
        licencia.setFechaExpedi(Calendar.getInstance()); // Usar fecha actual
        licencia.setFehcaVencida(Calendar.getInstance()); // Usar fecha actual
        licencia.setVigencia("Vigente"); // Definir la vigencia
        licencia.setCosto(600.0f); // Establecer el costo
        licencia.setCliente(cliente); // Asignar el cliente

        // Imprimir los datos del cliente y la licencia
        System.out.println("Datos del Cliente:");
        System.out.println("Nombre: " + cliente.getNombreCompleto());
        System.out.println("RFC: " + cliente.getRfc());
        System.out.println("Teléfono: " + cliente.getTelefono());

        System.out.println("\nDatos de la Licencia:");
        System.out.println("Fecha de Expedición: " + licencia.getFechaExpedi().getTime());
        System.out.println("Fecha de Vencimiento: " + licencia.getFehcaVencida().getTime());
        System.out.println("Vigencia: " + licencia.getVigencia());
        System.out.println("Costo: " + licencia.getCosto());
    
    
    }
    
}
