/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto2_agenciapersistencias;

import com.mycompany.proyecto2_agenciafiscalDTO.AutomovilNuevoDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Automovil;

/**
 *
 * @author Oley
 */
public interface IAutomovilDAO {
    public Automovil agergarAutomovil(AutomovilNuevoDTO automovilNuevo);
}