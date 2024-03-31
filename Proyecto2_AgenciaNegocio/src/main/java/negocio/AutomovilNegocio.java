/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import INegocios.IAutomovilNegocios;
import entidades_JPA.Automovil;
import entidades_JPA.Clientes;
import entidades_JPA.Placa;
import daos.ConexionBase;
import daos.IAutomovilDAO;
import daos.IConexion;
import daos.PlacaDAO;
import java.util.List;

/**
 *
 * @author Oley
 */
public class AutomovilNegocio implements  IAutomovilNegocios{
    private IAutomovilDAO automovilDAO;

    public AutomovilNegocio(IAutomovilDAO automovilDAO) {
        this.automovilDAO = automovilDAO;
    }


    @Override
    public Automovil registrarAutomovil(Automovil automovil) {
        List<Automovil> lista = automovilDAO.listaAutomovil();
        for (int i = 0; i < lista.size(); i++) {
            if (automovil.getNumeroSerie().equals(lista.get(i).getNumeroSerie())) {
                System.err.println("El número de serie ya existe");
                return null;
            }
        }
        Automovil autoAgregado = automovilDAO.agregaAutomovil(automovil);
        if (autoAgregado == null) {
            System.err.println("No se pudo agregar el automóvil");
            return null;
        } else{
            Placa placa = new Placa("ACTIVA",autoAgregado,1500);
            IConexion conexion = new ConexionBase();
            PlacaDAO placaDAO = new PlacaDAO(conexion);
            placaDAO.agregarPlacas(placa);
        }

        return autoAgregado; 
    }

    @Override
    public List<Automovil> listaAutosClientes(int id) {
        return automovilDAO.listaAutosClientes(id);
    }
}
