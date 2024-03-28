/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package daos;

import entidades_JPA.Licencia;

/**
 *
 * @author Oley
 */
public interface ILicenciaDAO {

    public Licencia agregarLicencia(Licencia LicenciaNueva);
//obtiene una lista de todas las licencias

    public Licencia ListaLicencia(Long id);
}
