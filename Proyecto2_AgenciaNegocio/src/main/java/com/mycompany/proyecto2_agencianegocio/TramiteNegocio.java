/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agencianegocio;

import INegocios.ILicenciaNegocios;
import INegocios.ITramiteNegocio;
import com.mycompany.proyecto2_agenciafiscalDTO.LicenciaNuevaDTO;
import com.mycompany.proyecto2_agenciafiscalDTO.TramiteNuevoDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Clientes;
import com.mycompany.proyecto2_agenciafiscaldominio.Licencia;
import com.mycompany.proyecto2_agenciafiscaldominio.Tramite;
import com.mycompany.proyecto2_agenciapersistencias.ITramiteDAO;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Oley
 */
public class TramiteNegocio implements ITramiteNegocio{
private ITramiteDAO itramiteDAO;

//    @Override
//    public Tramite agregarTramite(TramiteNuevoDTO TramiteNuevo) {
//        return itramiteDAO.agergarTramite(TramiteNuevo);
//    }

    @Override
    public List<Tramite> listaTramitePersona(Clientes clientes) {
           return itramiteDAO.listaTramitePersona(clientes);

    }

    @Override
    public List<Tramite> listaTramite(boolean placas, boolean licencia, LocalDate fechaInicio, LocalDate fechaFin, String filtro) {
  List<Tramite> listaTramiteFiltrada = itramiteDAO.listaTramite(placas, licencia, fechaInicio, fechaFin);
    
    if (!filtro.isEmpty()) {
        List<Tramite> listaPorNombre = new ArrayList<>();

        for (Tramite tramite : listaTramiteFiltrada) {
            String nombreCompleto = tramite.getCliente().getNombreCompleto();
            if (nombreCompleto.toLowerCase().contains(filtro.toLowerCase())) {
                listaPorNombre.add(tramite);
            }
        }
        
        listaTramiteFiltrada = listaPorNombre;
    }
    
    return listaTramiteFiltrada;
    
    }
   
    
    }
