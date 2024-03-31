/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INegocios;

import dto.ClienteNuevoDTO;
import dto.TramiteNuevoDTO;
import entidades_JPA.Clientes;
import entidades_JPA.Tramite;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Oley
 */
public interface ITramiteNegocio {
 public List<Tramite> listaTramitePersona(Clientes clientes);

    public List<Tramite> listaTramite(boolean placas, boolean licencia, LocalDate fechaInicio, LocalDate fechaFin,String filtro);}
