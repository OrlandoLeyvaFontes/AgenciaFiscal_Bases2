/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import daos.ClientesDAO;
import daos.IClientesDAO;
import dto.ClienteNuevoDTO;
import entidades.Clientes;
import java.time.LocalDate;

/**
 *
 * @author Gui26
 */
public class Agregar20 implements IAgregar20{
    @Override
    public void agrega20(){
        IClientesDAO veinte = new ClientesDAO();
        Clientes cliente1 = new Clientes("Juan","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente2 = new ClienteNuevoDTO("Francisco","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente3 = new ClienteNuevoDTO("Jose","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente4 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente5 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente6 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente7 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente8 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente9 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente10 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente11 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente12 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente13 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente14 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente15 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente16 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente17 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente18 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente19 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
//        ClienteNuevoDTO cliente20 = new ClienteNuevoDTO("prueba","test",LocalDate.parse("2000-01-01"),"123");
        veinte.agregarCliente(cliente1);
//        veinte.agregarCliente(cliente2);
//        veinte.agregarCliente(cliente3);
//        veinte.agregarCliente(cliente4);
//        veinte.agregarCliente(cliente5);
//        veinte.agregarCliente(cliente6);
//        veinte.agregarCliente(cliente7);
//        veinte.agregarCliente(cliente8);
//        veinte.agregarCliente(cliente9);
//        veinte.agregarCliente(cliente10);
//        veinte.agregarCliente(cliente11);
//        veinte.agregarCliente(cliente12);
//        veinte.agregarCliente(cliente13);
//        veinte.agregarCliente(cliente14);
//        veinte.agregarCliente(cliente15);
//        veinte.agregarCliente(cliente16);
//        veinte.agregarCliente(cliente17);
//        veinte.agregarCliente(cliente18);
//        veinte.agregarCliente(cliente19);
//        veinte.agregarCliente(cliente20);
    }
}
