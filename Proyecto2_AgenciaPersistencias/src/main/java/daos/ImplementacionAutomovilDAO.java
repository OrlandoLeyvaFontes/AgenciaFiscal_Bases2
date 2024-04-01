/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daos;

import entidades_JPA.Automovil;
import java.util.ArrayList;
import java.util.List;

/**
 * Clase ImplementacionAutomovilDAO
 * @author Oley
 */
public class ImplementacionAutomovilDAO implements IAutomovilDAO {

    private List<Automovil> automoviles;
    /**
     * Constructor
     */
    public ImplementacionAutomovilDAO() {
        // Inicializamos la lista de automóviles
        this.automoviles = new ArrayList<>();
    }
    /**
     * Regresa lista de automoviles
     * @return Lista Automoviles
     */
    @Override
    public List<Automovil> listaAutomovil() {
        // Retorna la lista de automóviles
        return automoviles;
    }
    /**
     * Agrega automovil
     * @param automovil Automovil
     * @return Automovil
     */
    @Override
    public Automovil agregaAutomovil(Automovil automovil) {
        // Agrega el automóvil a la lista
        automoviles.add(automovil);
        // Retorna el automóvil agregado
        return automovil;
    }
    /**
     * Obtiene Lista de autos del cliente segun ID
     * @param id ID Cliente
     * @return Lista Automoviles
     */
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
