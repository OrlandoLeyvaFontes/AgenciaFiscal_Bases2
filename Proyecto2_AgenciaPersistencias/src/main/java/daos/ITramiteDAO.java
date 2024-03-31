/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import dto.ConsultaTramiteDTO;
import dto.TramiteNuevoDTO;
import entidades_JPA.Clientes;
import entidades_JPA.Tramite;
import java.time.LocalDate;
import java.util.List;

/**
 *
 * @author Oley
 */
public interface ITramiteDAO {

    public List<Tramite> listaTramite(boolean placas, boolean licencia, LocalDate fechaInicio, LocalDate fechaFin);

    public List<Tramite> listaTramitePersona(Clientes clientes);
    
    public List<Tramite> listaTramitePersona(Long id);
    
    public List<Tramite> listaTramiteReporte(ConsultaTramiteDTO consulta);
    
}
