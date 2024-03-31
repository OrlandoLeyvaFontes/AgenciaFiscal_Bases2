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
 *
 * @author Oley
 */
public class LicenciaNegocio implements ILicenciaNegocios {

   private ClienteNuevoDTO clienteDTO;
    private IClientesDAO clientesDAO;
    private ILicenciaDAO ilicenciaDAO;
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



    @Override
    public List<Licencia> listaLicenciaPersona(int id) {
        return ilicenciaDAO.listaLicenciaPersona(id);
    }

    @Override
    public List<Licencia> listaLicenciaPersonaVigentes(int id) {
        return ilicenciaDAO.listaLicenciaPersonaVigentes(id);
    }

    @Override
    public Licencia agregaLicencia(Licencia licencia) {
        return ilicenciaDAO.agregaLicencia(licencia);
    }
}
