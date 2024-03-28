/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.proyecto2_agenciapersistencias;

import com.mycompany.proyecto2_agenciafiscalDTO.ClienteNuevoDTO;
import com.mycompany.proyecto2_agenciafiscalDTO.LicenciaNuevaDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Licencia;
import java.util.List;

/**
 *
 * @author Oley
 */
public interface ILicenciaDAO {

    public List<Licencia> listaLicenciaPersona(int id);

    public List<Licencia> listaLicenciaPersonaVigentes(int id);

    public Licencia agregaLicencia(Licencia licencia);
}
