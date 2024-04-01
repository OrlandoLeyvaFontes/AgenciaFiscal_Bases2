/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import INegocios.IConsultaTramites;
import dto.ConsultaTramiteDTO;
import entidades_JPA.Licencia;
import entidades_JPA.Placa;
import entidades_JPA.Tramite;
import daos.ConexionBase;
import daos.IConexion;
import daos.ITramiteDAO;
import daos.TramiteDAO;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.ListIterator;

/**
 * Clase que implementa la interfaz IConsultaTramites para realizar consultas relacionadas con trámites.
 *
 * @author Gui26
 */
public class ConsultaTramites implements IConsultaTramites {
    /**
     * Constructor
     */
    public ConsultaTramites() {
    }
    
  /**
     * Consulta los trámites asociados a un cliente.
     *
     * @param id El ID del cliente para el cual se consultan los trámites.
     * @return Una matriz de objetos con la información de los trámites.
     */
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
            listaTramites[i][0] = tramite.getDecriminatorValue();
            Calendar fecha = tramite.getFechaTramite();
            listaTramites[i][1] = fecha.get(fecha.YEAR) + "-"
                    + String.format("%02d", fecha.get(fecha.MONTH)) + "-"
                    + String.format("%02d", fecha.get(fecha.DAY_OF_MONTH));
            listaTramites[i][2] = tramite.getCliente().getNombreCompleto();
            listaTramites[i][3] = tramite.getCosto();
            i++;
        }

        return listaTramites;
    }

   /**
     * Consulta trámites en función de varios parámetros.
     *
     * @param nombre El nombre del cliente asociado a los trámites a consultar.
     * @param tramite El tipo de trámite a consultar ("licencia" o "placa").
     * @param inicio La fecha de inicio del rango de consulta.
     * @param fin La fecha de fin del rango de consulta.
     * @return Una matriz de objetos con la información de los trámites encontrados.
     */
    @Override
    public Object[][] consulta(String nombre, String tramite, Calendar inicio, Calendar fin) {
        IConexion conexion = new ConexionBase();

        ConsultaTramiteDTO consulta = new ConsultaTramiteDTO(nombre, null, inicio, fin);;
        if (tramite != null) {
            if (tramite.equals("licencia")) {
                consulta = new ConsultaTramiteDTO(nombre, Licencia.class, inicio, fin);
            }
            if (tramite.equals("placa")) {
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
            listaTramites[i][0] = tramitee.getDecriminatorValue();
            Calendar fecha = tramitee.getFechaTramite();
            listaTramites[i][1] = fecha.get(fecha.YEAR) + "-"
                    + String.format("%02d", fecha.get(fecha.MONTH)) + "-"
                    + String.format("%02d", fecha.get(fecha.DAY_OF_MONTH));
            listaTramites[i][2] = tramitee.getCliente().getNombreCompleto();
            listaTramites[i][3] = tramitee.getCosto();
            i++;
        }

        return listaTramites;
    }

}
