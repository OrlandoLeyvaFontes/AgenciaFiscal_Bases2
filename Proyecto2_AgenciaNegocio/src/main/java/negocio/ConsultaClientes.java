/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import INegocios.IConsultaClientes;
import dto.ConsultaClienteDTO;
import entidades_JPA.Clientes;
import daos.ClientesDAO;
import daos.ConexionBase;
import daos.IClientesDAO;
import daos.IConexion;
import java.util.Calendar;
import java.util.List;
import java.util.ListIterator;

/**
 * Clase que implementa la interfaz IConsultaClientes para realizar consultas relacionadas con clientes.
 * 
 * @author Gui26
 */
public class ConsultaClientes implements IConsultaClientes{
    /**
     * Cosntructor
     */
    public ConsultaClientes() {
    }
    
    /**
     * Realiza una consulta de clientes en función de los parámetros proporcionados.
     *
     * @param nombre     El nombre del cliente a consultar.
     * @param rfc        El RFC del cliente a consultar.
     * @param nacimiento La fecha de nacimiento del cliente a consultar en formato "yyyy-MM-dd".
     * @return Una matriz de objetos que representa la información de los clientes encontrados.
     */
@Override
public Object[][] consulta(String nombre, String rfc, String nacimiento) {
    ConsultaClienteDTO consulta = new ConsultaClienteDTO(nombre, rfc, nacimiento);
    IConexion conexion = new ConexionBase(); // Aquí puedes considerar inyectar la dependencia.
    IClientesDAO clienteDAO = new ClientesDAO(conexion);
    List<Clientes> clientes = clienteDAO.consultar(consulta);

    Clientes cliente;
    Object[][] listaClientes = new Object[clientes.size()][5];
    ListIterator<Clientes> lista = clientes.listIterator();
    int i = 0;
    while (lista.hasNext()) {
        cliente = lista.next();
        listaClientes[i][0] = cliente.getId();
        listaClientes[i][1] = cliente.getNombreCompleto();
        listaClientes[i][2] = cliente.getRfc();

        Calendar fecha = cliente.getFechaNacimiento();
        listaClientes[i][3] = fecha.get(Calendar.YEAR) + "-"
                + String.format("%02d", fecha.get(Calendar.MONTH) + 1) + "-"
                + String.format("%02d", fecha.get(Calendar.DAY_OF_MONTH));
        listaClientes[i][4] = cliente.getTelefono();
        i++;
    }

    return listaClientes;
}
}
