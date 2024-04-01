/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Gui26
 */
public class FormSolicitarConsulta extends javax.swing.JFrame {

    /**
     * Creates new form FormSolicitarConsulta
     */
    public FormSolicitarConsulta() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCancelar = new javax.swing.JButton();
        btnContinuar = new javax.swing.JButton();
        lblTitulo = new javax.swing.JLabel();
        btnNombre = new javax.swing.JRadioButton();
        btnRfc = new javax.swing.JRadioButton();
        btnNacimiento = new javax.swing.JRadioButton();
        txtNombre = new javax.swing.JTextField();
        txtRfc = new javax.swing.JTextField();
        txtNacimiento = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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

        btnNombre.setText("Nombre");
        btnNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNombreActionPerformed(evt);
            }
        });

        btnRfc.setText("RFC");
        btnRfc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRfcActionPerformed(evt);
            }
        });

        btnNacimiento.setText("Año de Nacimiento");
        btnNacimiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNacimientoActionPerformed(evt);
            }
        });

        txtNombre.setEnabled(false);

        txtRfc.setEnabled(false);

        txtNacimiento.setEnabled(false);

        jLabel1.setText("Buscar por:");

        jLabel2.setText("Busqueda de Cliente");

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(155, 155, 155)
                                .addComponent(lblTitulo))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(51, 51, 51)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnNacimiento)
                                    .addComponent(btnRfc)
                                    .addComponent(btnNombre)
                                    .addComponent(jLabel1))
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                                    .addComponent(txtRfc)
                                    .addComponent(txtNombre))))
                        .addGap(0, 61, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(139, 139, 139)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblTitulo)
                .addGap(40, 40, 40)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNombre)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRfc)
                    .addComponent(txtRfc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNacimiento)
                    .addComponent(txtNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnContinuar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        FormInicio formInicio = new FormInicio();
        formInicio.setVisible(true);
        dispose(); 
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        String nombre=null;
        String rfc=null;
        String nacimiento=null;
        Boolean correcto = false;
        if (btnNombre.isSelected()){
            nombre=txtNombre.getText();
            correcto = true;
        }
        if (btnRfc.isSelected()){
            rfc=txtRfc.getText();
            correcto = true;
        }
        if (btnNacimiento.isSelected()){
            nacimiento=txtNacimiento.getText();
            correcto = true;
        }
        if (correcto){
            FormTablaClientes form = new FormTablaClientes(nombre, rfc, nacimiento);
            dispose();
            form.setVisible(true);
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNombreActionPerformed
        if (btnNombre.isSelected()){
            txtNombre.setEnabled(true);
        } else{
            txtNombre.setEnabled(false);
            txtNombre.setText("");
        }
    }//GEN-LAST:event_btnNombreActionPerformed

    private void btnRfcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRfcActionPerformed
        if (btnRfc.isSelected()){
            txtRfc.setEnabled(true);
        } else{
            txtRfc.setEnabled(false);
            txtRfc.setText("");
        }
    }//GEN-LAST:event_btnRfcActionPerformed

    private void btnNacimientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNacimientoActionPerformed
        if (btnNacimiento.isSelected()){
            txtNacimiento.setEnabled(true);
        } else{
            txtNacimiento.setEnabled(false);
            txtNacimiento.setText("");
        }
    }//GEN-LAST:event_btnNacimientoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnContinuar;
    private javax.swing.JRadioButton btnNacimiento;
    private javax.swing.JRadioButton btnNombre;
    private javax.swing.JRadioButton btnRfc;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTextField txtNacimiento;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRfc;
    // End of variables declaration//GEN-END:variables
}