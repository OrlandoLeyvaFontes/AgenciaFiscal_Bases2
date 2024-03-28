/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;


import entidades_JPA.Clientes;
import java.util.List;

/**
 *
 * @author Oley
 */
public interface IClientesDAO {
            public Clientes agregarCliente(Clientes clienteNuevo);
//            public Clientes Checar(String rfc);
            public List<Clientes> consultar(Clientes filtrosConsulta);
}
