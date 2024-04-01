/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

import INegocios.ILicenciaNegocios;
import dto.ClienteNuevoDTO;
import dto.LicenciaNuevaDTO;
import entidades_JPA.Clientes;
import entidades_JPA.Licencia;
import daos.IClientesDAO;
import daos.ILicenciaDAO;
import java.util.List;

/**
 * Clase que implementa la interfaz ILicenciaNegocios para manejar operaciones relacionadas con licencias.
 *
 * @author Oley
 */
public class LicenciaNegocio implements ILicenciaNegocios {

/**
 * DTO que representa la información de un cliente nuevo.
 */
private ClienteNuevoDTO clienteDTO;

/**
 * Objeto que proporciona métodos para acceder a la capa de datos de clientes.
 */
private IClientesDAO clientesDAO;

/**
 * Objeto que proporciona métodos para acceder a la capa de datos de licencias.
 */
private ILicenciaDAO ilicenciaDAO;
    /**
     * Cosntructor
     * @param ilicenciaDAO ILicienciaDAO
     */
    public LicenciaNegocio(ILicenciaDAO ilicenciaDAO) {
        this.ilicenciaDAO = ilicenciaDAO;
    }
//    public LicenciaNegocio(ILicenciaDAO licenciaDAO, IClientesDAO clientesDAO, ClienteNuevoDTO clienteDTO) {
//        this.ilicenciaDAO = licenciaDAO;
//        this.clientesDAO = clientesDAO;
//        this.clienteDTO = clienteDTO;
//    }
//
//    @Override
//    public Licencia agregarLicencia(LicenciaNuevaDTO LicenciaNueva) {
//        return ilicenciaDAO.agregarLicencia(LicenciaNueva);
//    }
//    private Clientes cliente;
//
//    @Override
//   public ClienteNuevoDTO listaClientes() {
//     this.cliente = clientesDAO.Checar(clienteDTO.getRfc());
//    if (cliente == null) {
//        return null;
//    }
//    
//    // Crear un nuevo objeto ClienteNuevoDTO a partir de la información del objeto Clientes
//    ClienteNuevoDTO clienteDTO = new ClienteNuevoDTO(
//        cliente.getRfc(),
//        cliente.getNombreCompleto(),
//        cliente.getFechaNacimiento(),
//        cliente.getTelefono(),
//        cliente.getDiscapacitado()
//    );
//
//    // Aquí puedes realizar cualquier otra operación con el objeto clienteDTO si es necesario
//
//    return clienteDTO;

    /**
     * Devuelve una lista de licencias asociadas a una persona específica.
     *
     * @param id El ID de la persona para la cual se consulta la lista de
     * licencias.
     * @return Una lista de objetos de tipo Licencia.
     */
    @Override
    public List<Licencia> listaLicenciaPersona(int id) {
        return ilicenciaDAO.listaLicenciaPersona(id);
    }

    /**
     * Devuelve una lista de licencias vigentes asociadas a una persona
     * específica.
     *
     * @param id El ID de la persona para la cual se consulta la lista de
     * licencias vigentes.
     * @return Una lista de objetos de tipo Licencia que están vigentes.
     */
    @Override
    public List<Licencia> listaLicenciaPersonaVigentes(int id) {
        return ilicenciaDAO.listaLicenciaPersonaVigentes(id);
    }

    /**
     * Agrega una nueva licencia.
     *
     * @param licencia La licencia a agregar.
     * @return La licencia agregada.
     */
    @Override
    public Licencia agregaLicencia(Licencia licencia) {
        return ilicenciaDAO.agregaLicencia(licencia);
    }
}
