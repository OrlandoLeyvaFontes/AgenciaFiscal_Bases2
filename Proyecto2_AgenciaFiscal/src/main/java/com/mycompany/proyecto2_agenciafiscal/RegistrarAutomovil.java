/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.proyecto2_agenciafiscal;

import com.mycompany.proyecto2_agenciafiscaldominio.Automovil;
import com.mycompany.proyecto2_agenciafiscaldominio.Clientes;
import com.mycompany.proyecto2_agencianegocio.AutomovilNegocio;
import com.mycompany.proyecto2_agencianegocio.PlacasNegcoio;
import com.mycompany.proyecto2_agenciapersistencias.ConexionBase;
import com.mycompany.proyecto2_agenciapersistencias.IConexion;
import com.mycompany.proyecto2_agenciapersistencias.IPlacasDAO;
import com.mycompany.proyecto2_agenciapersistencias.PlacaDAO;
import javax.swing.JOptionPane;

/**
 *
 * @author oley
 */
public class RegistrarAutomovil extends javax.swing.JFrame {
    private AutomovilNegocio automovilNegocio;
    private PlacasNegcoio placasNegocio;
    private Clientes cliente;

    public RegistrarAutomovil(AutomovilNegocio automovilNegocio, PlacasNegcoio placasNegocio, Clientes cliente) {
        this.automovilNegocio = automovilNegocio;
        this.placasNegocio = placasNegocio;
        this.cliente= cliente;
        initComponents();
    }
    /**
     * Creates new form FormConfirmarCliente
     */
  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtNumeroSerie = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();
        txtLinea = new javax.swing.JTextField();
        txtColor = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Datos del automovil");

        jLabel3.setText("No. Serie:");

        jLabel4.setText("Marca:");

        jLabel5.setText("Linea:");

        jLabel6.setText("Color:");

        jLabel7.setText("Modelo:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnContinuar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtNumeroSerie)
                            .addComponent(txtMarca)
                            .addComponent(txtLinea)
                            .addComponent(txtColor)
                            .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 17, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNumeroSerie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtLinea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnContinuar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
    // Obtener los valores de los campos de texto
    String numeroSerie = txtNumeroSerie.getText();
    String marca = txtMarca.getText();
    String linea = txtLinea.getText();
    String modelo = txtModelo.getText();
    String color = txtColor.getText();

//    // Crear una nueva instancia de Cliente (asumiendo que tienes una clase Cliente)
//    Clientes cliente = new Clientes();

    // Crear una instancia de Automovil con los datos proporcionados
    Automovil automovil = new Automovil(numeroSerie, marca, linea, color, modelo, cliente);

    // Registrar el automóvil utilizando AutomovilNegocio
    Automovil automovilRegistrado = automovilNegocio.registrarAutomovil(automovil);
    if (automovilRegistrado != null) {
        JOptionPane.showMessageDialog(this, "Automóvil registrado exitosamente");
    } else {
        JOptionPane.showMessageDialog(this, "No se pudo registrar el automóvil", "Error", JOptionPane.ERROR_MESSAGE);
    }
            }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        FormTipoAutomovil form = new FormTipoAutomovil(cliente);
        form.setVisible(true);
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtColor;
    private javax.swing.JTextField txtLinea;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNumeroSerie;
    // End of variables declaration//GEN-END:variables
}
