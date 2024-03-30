/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package com.mycompany.proyecto2_agenciafiscal;

import INegocios.ILicenciaNegocios;
import com.mycompany.proyecto2_agenciafiscaldominio.Clientes;
import com.mycompany.proyecto2_agencianegocio.LicenciaNegocio;
import com.mycompany.proyecto2_agenciapersistencias.ClientesDAO;
import com.mycompany.proyecto2_agenciapersistencias.ConexionBase;
import com.mycompany.proyecto2_agenciapersistencias.IClientesDAO;
import com.mycompany.proyecto2_agenciapersistencias.IConexion;
import com.mycompany.proyecto2_agenciapersistencias.ILicenciaDAO;
import com.mycompany.proyecto2_agenciapersistencias.LicenciaDAO;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oley
 */
public class Tramites extends javax.swing.JPanel implements java.beans.Customizer {
        private Object bean;
    private int selectedRow = -1;
private ILicenciaDAO licenciaDAO;

    /**
     * Creates new customizer Tramites
     */
    public Tramites() {
        initComponents();
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }
private Clientes Checar(String rfc) {
    System.out.println("Buscando cliente con RFC: " + rfc); 

    ConexionBase conexionBD = new ConexionBase();
    EntityManager entity = conexionBD.crearConexion();
    Query query = entity.createNativeQuery("SELECT * FROM Clientes WHERE rfc = ?", Clientes.class);
    query.setParameter(1, rfc);

    Clientes cli = null;
    try {
        cli = (Clientes) query.getSingleResult();
    } catch (NoResultException e) {
        cli = null;
    }

    if (cli != null) {
        System.out.println("Cliente encontrado: " + cli.toString());
    } else {
        System.out.println("Cliente no encontrado.");
    }

    return cli;
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the FormEditor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("RFC:");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 40, 160, 20));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 370, 200));

        jButton1.setText("Regresar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, -1, -1));

        jButton2.setText("Continuar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    FormInicio form = new FormInicio();
        form.setVisible(true);
            }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
   String rfc = jTextField1.getText();
        System.out.println("RFC ingresado: " + rfc); 

        Clientes cliente = Checar(rfc);

        if (cliente != null) {
            DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
            model.setRowCount(0); 
            Object[] rowData = { cliente.getNombreCompleto(), cliente.getTelefono(), cliente.getFechaNacimiento(),cliente.getDiscapacitado()};
            model.addRow(rowData);
        } else {
            JOptionPane.showMessageDialog(this, "Cliente no encontrado para el RFC ingresado.", "Error", JOptionPane.ERROR_MESSAGE);
        }    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String rfc = jTextField1.getText();

    IConexion conexionBD = new ConexionBase(); 

    IClientesDAO clientesDAO = new ClientesDAO(conexionBD);

    Clientes cliente = clientesDAO.Checar(rfc);

    if (cliente != null) {
        try {
            // Cerrar la ventana actual (Tramites)
            JFrame currentFrame = (JFrame) SwingUtilities.getWindowAncestor(this);
            currentFrame.dispose();

            // Redirigir a la ventana FormTipoAutomovil
            FormTipoAutomovil formTipoAutomovil = new FormTipoAutomovil(cliente);
            formTipoAutomovil.setVisible(true);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
