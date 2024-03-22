/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agencianegocio;

import INegocios.ILicenciaNegocios;
import INegocios.ITramiteNegocio;
import com.mycompany.proyecto2_agenciafiscalDTO.LicenciaNuevaDTO;
import com.mycompany.proyecto2_agenciafiscalDTO.TramiteNuevoDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Licencia;
import com.mycompany.proyecto2_agenciafiscaldominio.Tramite;
import com.mycompany.proyecto2_agenciapersistencias.ITramiteDAO;

/**
 *
 * @author Oley
 */
public class TramiteNegocio implements ITramiteNegocio{
private ITramiteDAO itramiteDAO;

    @Override
    public Tramite agregarTramite(TramiteNuevoDTO TramiteNuevo) {
        return itramiteDAO.agergarTramite(TramiteNuevo);
    }
   
    
    }
