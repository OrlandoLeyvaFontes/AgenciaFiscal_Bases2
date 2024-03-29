/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agencianegocio;

import INegocios.IAutomovilNegocios;
import com.mycompany.proyecto2_agenciafiscaldominio.Automovil;
import com.mycompany.proyecto2_agenciapersistencias.IAutomovilDAO;
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
        }

        return autoAgregado; 
    }

    @Override
    public List<Automovil> listaAutosClientes(int id) {
        return automovilDAO.listaAutosClientes(id);
    }
}
