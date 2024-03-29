/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agencianegocio;

import INegocios.IConsultaTramites;
import com.mycompany.proyecto2_agenciafiscalDTO.ConsultaTramiteDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Licencia;
import com.mycompany.proyecto2_agenciafiscaldominio.Placa;
import com.mycompany.proyecto2_agenciafiscaldominio.Tramite;
import com.mycompany.proyecto2_agenciapersistencias.ConexionBase;
import com.mycompany.proyecto2_agenciapersistencias.IConexion;
import com.mycompany.proyecto2_agenciapersistencias.ITramiteDAO;
import com.mycompany.proyecto2_agenciapersistencias.TramiteDAO;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

/**
 *
 * @author Gui26
 */
public class ConsultaTramites implements IConsultaTramites{

    @Override
    public Object[][] consulta(Long id) {
        IConexion conexion = new ConexionBase();
        ITramiteDAO tramiteDAO = new TramiteDAO(conexion);
        List<Tramite> tramites = tramiteDAO.listaTramitePersona(id);
        
        ///////////////
        
        Tramite tramite;
        Object[][] listaTramites = new Object[tramites.size()][4];
        ListIterator<Tramite> lista = tramites.listIterator();
        int i = 0;
        while (lista.hasNext()) {
            tramite = lista.next();
            listaTramites[i][0]=tramite.getDecriminatorValue();
            Calendar fecha = tramite.getFechaTramite();
            listaTramites[i][1]=fecha.get(fecha.YEAR)+"-"
                    +String.format("%02d", fecha.get(fecha.MONTH))+"-"
                    +String.format("%02d", fecha.get(fecha.DAY_OF_MONTH));
            listaTramites[i][2]=tramite.getCliente().getNombreCompleto();
            listaTramites[i][3]=tramite.getCosto();
            i++;
        }
        
        return listaTramites;
    }

    @Override
    public Object[][] consulta(String nombre, String tramite, Calendar inicio, Calendar fin) {
        IConexion conexion = new ConexionBase();
        
        ConsultaTramiteDTO consulta= new ConsultaTramiteDTO(nombre, null, inicio, fin);;
        if(tramite!=null){
            if(tramite.equals("licencia")){
                consulta = new ConsultaTramiteDTO(nombre, Licencia.class, inicio, fin);
            }
            if(tramite.equals("placa")){
                consulta = new ConsultaTramiteDTO(nombre, Placa.class, inicio, fin);
            }
        }
        ITramiteDAO tramiteDAO = new TramiteDAO(conexion);
        List<Tramite> tramites = tramiteDAO.listaTramiteReporte(consulta);
        
        ///////////////

        Tramite tramitee;
        Object[][] listaTramites = new Object[tramites.size()][4];
        ListIterator<Tramite> lista = tramites.listIterator();
        int i = 0;
        while (lista.hasNext()) {
            tramitee = lista.next();
            listaTramites[i][0]=tramitee.getDecriminatorValue();
            Calendar fecha = tramitee.getFechaTramite();
            listaTramites[i][1]=fecha.get(fecha.YEAR)+"-"
                    +String.format("%02d", fecha.get(fecha.MONTH))+"-"
                    +String.format("%02d", fecha.get(fecha.DAY_OF_MONTH));
            listaTramites[i][2]=tramitee.getCliente().getNombreCompleto();
            listaTramites[i][3]=tramitee.getCosto();
            i++;
        }
        
        return listaTramites;
    }
    
}
