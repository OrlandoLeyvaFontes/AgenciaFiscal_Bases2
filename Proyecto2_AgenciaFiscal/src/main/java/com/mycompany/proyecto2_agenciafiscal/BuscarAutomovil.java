/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package com.mycompany.proyecto2_agenciafiscal;

import com.mycompany.proyecto2_agenciafiscaldominio.Automovil;
import com.mycompany.proyecto2_agenciafiscaldominio.Placa;
import com.mycompany.proyecto2_agenciapersistencias.ConexionBase;
import com.mycompany.proyecto2_agenciapersistencias.IConexion;
import com.mycompany.proyecto2_agenciapersistencias.PlacaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oley
 */
public class BuscarAutomovil extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;

    /**
     * Creates new customizer BuscarAutomovil
     */
    public BuscarAutomovil() {
        initComponents();
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }
  private void mostrarAutosEnTabla(List<Automovil> listaAutos) {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Marca");
        model.addColumn("Modelo");
        
        for (Automovil auto : listaAutos) {
            Object[] row = new Object[3];
            row[0] = auto.getId();
            row[1] = auto.getMarca();
            row[2] = auto.getModelo();
            model.addRow(row);
        }

        jTable1.setModel(model);
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

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("ID");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 170, -1));

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 40, 380, 200));

        jButton1.setText("Continuar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 260, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      int idCliente = Integer.parseInt(jTextField1.getText());
        IConexion conexion = new ConexionBase(); // Suponiendo que tengas una implementación de IConexion
        PlacaDAO placasDAO = new PlacaDAO(conexion);
        
        // Obtener la lista de placas asociadas con el cliente
        List<Placa> listaPlacas = placasDAO.AutoEspecifico(idCliente);
        
        // Crear una lista de automóviles a partir de la lista de placas
        List<Automovil> listaAutos = new ArrayList<>();
        for (Placa placa : listaPlacas) {
            listaAutos.add(placa.getAutomovil());
        }
        
        // Mostrar los automóviles en la tabla
        mostrarAutosEnTabla(listaAutos);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
