/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.proyecto2_agenciafiscal;

import com.mycompany.proyecto2_agenciafiscalDTO.AutomovilNuevoDTO;
import com.mycompany.proyecto2_agenciafiscalDTO.ClienteNuevoDTO;
import com.mycompany.proyecto2_agenciafiscalDTO.LicenciaNuevaDTO;
import com.mycompany.proyecto2_agenciafiscalDTO.PlacaNuevoDTO;
import com.mycompany.proyecto2_agenciafiscalDTO.TramiteNuevoDTO;
import com.mycompany.proyecto2_agenciafiscaldominio.Automovil;
import com.mycompany.proyecto2_agenciafiscaldominio.Clientes;
import com.mycompany.proyecto2_agenciafiscaldominio.Licencia;
import com.mycompany.proyecto2_agenciafiscaldominio.Placa;
import com.mycompany.proyecto2_agenciafiscaldominio.Tramite;
import com.mycompany.proyecto2_agenciapersistencias.AutomovilDAO;
import com.mycompany.proyecto2_agenciapersistencias.ClientesDAO;
import com.mycompany.proyecto2_agenciapersistencias.LicenciaDAO;
import com.mycompany.proyecto2_agenciapersistencias.PlacaDAO;
import com.mycompany.proyecto2_agenciapersistencias.TramiteDAO;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Oley
 */
public class Proyecto2_AgenciaFiscal {

    public static void main(String[] args) throws ParseException {
        //        //Prueba del cliente
        String fechaString = "2024-03-15";
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        Date fecha = date.parse(fechaString);
        //
        //        
        //        ClientesDAO clienteDAO = new ClientesDAO();
        //        Clientes clien = clienteDAO.agregarCliente( new ClienteNuevoDTO("EOYL040324OJ1","Orlando Leyva Fontes",fecha,"6441566298"));
        // automovilNuevo.getNumeroSerie(),
        //                automovilNuevo.getMarca(),
        //                automovilNuevo.getLinea(),
        //                automovilNuevo.getColor(),
        ////                automovilNuevo.getModelo()
        //        //Prueba del Auto
        //        AutomovilDAO autoDAO = new AutomovilDAO();
        //        Automovil auto = autoDAO.agergarAutomovil(new AutomovilNuevoDTO("1999", "Bocho", "2", "rojo", "1999"));
        //Prueba placas
        //        String fechaEmision = " 2020-03-15";
        //        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");
        //        Date fecha = date1.parse(fechaEmision);
        //        String fechaRecepcion = "2020-04-15";
        //        SimpleDateFormat date2 = new SimpleDateFormat("yyyy-MM-dd");
        //        Date fecha1 = date2.parse(fechaRecepcion);
        //        PlacaDAO placaDAO = new PlacaDAO();
        //       Placa placa=placaDAO.agregarPlacas(new PlacaNuevoDTO("1990",fecha,fecha1,2));
        //Prueba Licencia
        //        LicenciaDAO licenciaDAO = new LicenciaDAO();
        //        Licencia lic = licenciaDAO.agregarLicencia(new LicenciaNuevaDTO(1, 1, 1));
        //Prueba Tramite
        TramiteDAO tramiteDAO = new TramiteDAO();
        Tramite tramite = tramiteDAO.agergarTramite(new TramiteNuevoDTO("Cambio de Propietario", fecha, "Orlando Leyva", 4));
    }
}
