/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto2_agenciapersistencias;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;

/**
 *
 * @author Oley
 */
public interface IConexion {
    public EntityManager crearConexion() throws PersistenceException;
}