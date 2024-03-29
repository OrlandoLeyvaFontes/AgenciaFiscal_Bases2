/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agenciapersistencias;

import com.mycompany.proyecto2_agenciafiscaldominio.Automovil;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oley
 */
public class ImplementacionAutomovilDAO implements IAutomovilDAO {
  
    private List<Automovil> automoviles;

    public ImplementacionAutomovilDAO() {
        // Inicializamos la lista de automóviles
        this.automoviles = new ArrayList<>();
    }

    @Override
    public List<Automovil> listaAutomovil() {
        // Retorna la lista de automóviles
        return automoviles;
    }

    @Override
    public Automovil agregaAutomovil(Automovil automovil) {
        // Agrega el automóvil a la lista
        automoviles.add(automovil);
        // Retorna el automóvil agregado
        return automovil;
    }

    @Override
    public List<Automovil> listaAutosClientes(int id) {
 List<Automovil> autosCliente = new ArrayList<>();

    for (Automovil auto : automoviles) {
        if (auto.getCliente().getId() == id) {
            autosCliente.add(auto); 
        }
    }
    return autosCliente;
    }
}
