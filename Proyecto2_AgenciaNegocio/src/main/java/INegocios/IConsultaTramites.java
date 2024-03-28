/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package INegocios;

import java.util.Date;

/**
 *
 * @author Gui26
 */
public interface IConsultaTramites {
    public Object[][] consulta(Long id);
    public Object[][] consulta(String nombre, String tramite, Date inicio, Date fin);
}
