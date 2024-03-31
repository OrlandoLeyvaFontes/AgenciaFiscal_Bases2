/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INegocios;

import entidades_JPA.Automovil;
import entidades_JPA.Clientes;
import java.util.List;

/**
 *
 * @author Oley
 */
public interface IAutomovilNegocios {
        public Automovil registrarAutomovil(Automovil automovil) ;
            public List<Automovil> listaAutosClientes(int id);


}
