/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import daos.ClientesDAO;
import daos.IClientesDAO;
import dto.ConsultaClientesDTO;
import entidades.Clientes;
import java.time.LocalDate;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class ConsultaClientes implements IConsultaClientes{
    @Override
    public Object[][] consulta(String nombre, String rfc, String nacimiento){
        Clientes consulta;
        if (nacimiento!=null){
            consulta = new Clientes(nombre, rfc, LocalDate.parse(nacimiento+"-01-01"));
        } else{
            consulta = new Clientes(nombre, rfc, null);
        }
        IClientesDAO clienteDAO = new ClientesDAO();
        List<Clientes> clientes = clienteDAO.consultar(consulta);
        
        Clientes cliente;
        Object[][] listaClientes = new Object[clientes.size()][5];
        ListIterator<Clientes> lista = clientes.listIterator();
        int i = 0;
        while (lista.hasNext()) {
            cliente = lista.next();
            listaClientes[i][0]=cliente.getId();
            listaClientes[i][1]=cliente.getNombreCompleto();
            listaClientes[i][2]=cliente.getRfc();
            listaClientes[i][3]=cliente.getFechaNacimiento();
            listaClientes[i][4]=cliente.getTelefono();
            i++;
        }
        
        return listaClientes;
    }
}
