/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto2_agencianegocio;

import INegocios.IConsultaTramites;
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
        Object[][] listaTramites = new Object[tramites.size()][5];
        ListIterator<Tramite> lista = tramites.listIterator();
        int i = 0;
        while (lista.hasNext()) {
            tramite = lista.next();
            listaTramites[i][0]=tramite.getDecriminatorValue();
            Calendar fecha = tramite.getFechaTramite();
            listaTramites[i][1]=fecha.get(fecha.YEAR)+"-"+fecha.get(fecha.MONTH)+"-"+fecha.get(fecha.DAY_OF_MONTH);
            listaTramites[i][2]=tramite.getCliente().getNombreCompleto();
            listaTramites[i][3]=tramite.getCosto();
            i++;
        }
        
        return listaTramites;
    }

    @Override
    public Object[][] consulta(String nombre, String tramite, Date inicio, Date fin) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
