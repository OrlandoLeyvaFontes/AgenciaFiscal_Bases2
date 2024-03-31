/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import dto.AutomovilNuevoDTO;
import entidades_JPA.Automovil;
import java.util.List;

/**
 *
 * @author Oley
 */
public interface IAutomovilDAO {
//    public Automovil agergarAutomovil(AutomovilNuevoDTO automovilNuevo);

    public List<Automovil> listaAutosClientes(int id);

    public Automovil agregaAutomovil(Automovil Automovil);

    public List<Automovil> listaAutomovil();

}
