/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Beans/Customizer.java to edit this template
 */
package presentacion;

import entidades_JPA.Automovil;
import entidades_JPA.Clientes;
import entidades_JPA.Placa;
import daos.ConexionBase;
import daos.IConexion;
import daos.PlacaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Oley
 */
public class BuscarAutomovil extends javax.swing.JPanel implements java.beans.Customizer {
    
    private Object bean;
    private Clientes cliente;
    private Automovil auto;
    /**
     * Creates new customizer BuscarAutomovil
     */
    public BuscarAutomovil(Clientes cliente) {
        this.cliente=cliente;
        initComponents();
    }
    
    public void setObject(Object bean) {
        this.bean = bean;
    }
    
    private void mostrarAutoEnTabla() {
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("No. Serie");
        model.addColumn("Marca");
        model.addColumn("Linea");
        model.addColumn("Color");
        model.addColumn("Modelo");
        model.addColumn("Placa");
        
        //for (Automovil automovil : listaAutos) {
            Object[] row = new Object[6];
            row[0] = auto.getNumeroSerie();
            row[1] = auto.getMarca();
            row[2] = auto.getLinea();
            row[3] = auto.getColor();
            row[4] = auto.getModelo();
            row[5] = txtPlaca.getText();
            model.addRow(row);
        //}

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
        txtPlaca = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnContinuar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("No. placa");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 60, -1, -1));

        txtPlaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlacaActionPerformed(evt);
            }
        });
        add(txtPlaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 170, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No. serie", "Marca", "Linea", "Color", "Modelo", "Placa"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 620, 200));

        btnContinuar.setText("Continuar");
        btnContinuar.setEnabled(false);
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 310, -1, -1));

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 310, -1, -1));

        jLabel2.setText("Buscar automovil por numero de placa");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 20, -1, -1));

        jLabel3.setText("Presione Enter");
        jLabel3.setEnabled(false);
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 60, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        if (cliente.getId().equals(auto.getCliente().getId())){
            if(auto!=null){
                Placa placa = new Placa("ACTIVA",auto,1000);
                IConexion conexion = new ConexionBase();
                PlacaDAO placaDAO = new PlacaDAO(conexion);
                placaDAO.agregarPlacas(placa);
                JOptionPane.showMessageDialog(this, "Placa generada");
                FormInicio form = new FormInicio();
                form.setVisible(true);
                JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
                frame.dispose();
            } else{
                JOptionPane.showMessageDialog(this, "No se busco el automovil", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else{
            JOptionPane.showMessageDialog(this, "Este auto no esta registrado a nombre del cliente", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void txtPlacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlacaActionPerformed
        String numPlaca = txtPlaca.getText();
        IConexion conexion = new ConexionBase(); // Suponiendo que tengas una implementación de IConexion
        PlacaDAO placasDAO = new PlacaDAO(conexion);
        
//        // Obtener la lista de placas asociadas con el cliente
//        List<Placa> listaPlacas = placasDAO.AutoEspecifico(idCliente);
        
        Placa placa = placasDAO.autoPlaca(numPlaca);
        if (placa!=null){
            
            auto=placa.getAutomovil();
            
//        // Crear una lista de automóviles a partir de la lista de placas
            //List<Automovil> listaAutos = new ArrayList<>();
    //        for (Placa placa : listaPlacas) {
            //listaAutos.add(placa.getAutomovil());
            btnContinuar.setEnabled(true);
    //        }
    
            // Mostrar los automóviles en la tabla
            
            mostrarAutoEnTabla();
            
        } else{
            
        }
        
    }//GEN-LAST:event_txtPlacaActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        FormTipoAutomovil form = new FormTipoAutomovil(cliente);
        form.setVisible(true);
        JFrame frame = (JFrame) SwingUtilities.getWindowAncestor(this);
        frame.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtPlaca;
    // End of variables declaration//GEN-END:variables
}
