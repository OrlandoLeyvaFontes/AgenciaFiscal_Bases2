/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentacion;

import INegocios.IConsultaTramites;
import com.itextpdf.text.BadElementException;
import negocio.ConsultaTramites;
import java.util.Calendar;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;
//import com.itextpdf.text.pdf.parser.Shape;

import java.awt.Graphics2D;
import java.awt.Shape;
import java.io.FileOutputStream;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author Gui26
 */
public class FormTablaTramites extends javax.swing.JFrame {

    private Object[][] tramites;
    private Object[][] clientes;
    
    /**
     * Creates new form FormTablaClientes
     */
    public FormTablaTramites(Object[][] clientes, Long idCliente) {
        initComponents();
        IConsultaTramites consultas = new ConsultaTramites();
        this.tramites = consultas.consulta(idCliente);
        this.clientes = clientes;
        tabla();
    }
    
    public FormTablaTramites(String nombre, String Tramite, Calendar fechaInicio, Calendar FechaFin) {
        initComponents();
        IConsultaTramites consultas = new ConsultaTramites();
        this.tramites = consultas.consulta(nombre, Tramite, fechaInicio, FechaFin);
        tabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaTramites = new javax.swing.JTable();
        lblTitulo = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        btnReporte = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaTramites.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Tramite", "Fecha", "Persona", "Costo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaTramites);

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnReporte.setText("Generar reporte");
        btnReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteActionPerformed(evt);
            }
        });

        jLabel1.setText("Tramites");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 622, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(btnVolver)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnReporte))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(295, 295, 295)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(lblTitulo))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(lblTitulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver)
                    .addComponent(btnReporte))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        if(clientes!=null){
            FormTablaClientes form = new FormTablaClientes(clientes);
            dispose();
            form.setVisible(true);
        } else{
            FormReporte form = new FormReporte();
            dispose();
            form.setVisible(true);
        }
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteActionPerformed

        try {
            PdfPTable pdfTable = new PdfPTable(tablaTramites.getColumnCount());
            Document document = new Document(PageSize.A4, 30, 30, 30, 30);
            PdfWriter writer = PdfWriter.getInstance(document, new FileOutputStream("Tabla de Tramites.pdf"));
            document.open();
            pdfTable.setHeaderRows(1);
            PdfPCell cell = new PdfPCell(new Paragraph(tablaTramites.getColumnName(0)));
            cell.setBackgroundColor(new GrayColor(0.7f));
            pdfTable.addCell(cell);
            cell = new PdfPCell(new Paragraph(tablaTramites.getColumnName(1)));
            cell.setBackgroundColor(new GrayColor(0.7f));
            pdfTable.addCell(cell);
            cell = new PdfPCell(new Paragraph(tablaTramites.getColumnName(2)));
            cell.setBackgroundColor(new GrayColor(0.7f));
            pdfTable.addCell(cell);
            cell = new PdfPCell(new Paragraph(tablaTramites.getColumnName(3)));
            cell.setBackgroundColor(new GrayColor(0.7f));
            pdfTable.addCell(cell);
            for (int i = 0; i < tablaTramites.getRowCount(); i++) {
                for (int j = 0; j < tablaTramites.getColumnCount(); j++) {
                    pdfTable.addCell(tablaTramites.getModel().getValueAt(i, j).toString());
                }
            }
            document.add(pdfTable);
            document.close();
            JOptionPane.showMessageDialog(null, "Reporte generado con exito");
        } catch (FileNotFoundException | DocumentException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e);
        }
        
        FormInicio formInicio = new FormInicio();
        formInicio.setVisible(true);
        dispose();
        
    }//GEN-LAST:event_btnReporteActionPerformed

    public void tabla(){
            DefaultTableModel modelo = new DefaultTableModel();
            modelo.addColumn("Tramite");
            modelo.addColumn("Fecha");
            modelo.addColumn("Persona");
            modelo.addColumn("Costo");
            for (int i=0; i<tramites.length;i++){
                Object[] fila = {tramites[i][0],tramites[i][1],
                    tramites[i][2], tramites[i][3]};
                modelo.addRow(fila);
            }
            tablaTramites.setModel(modelo);
            TableColumnModel columnModel = tablaTramites.getColumnModel();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnReporte;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JTable tablaTramites;
    // End of variables declaration//GEN-END:variables
}
