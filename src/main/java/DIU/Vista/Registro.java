/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.Vista;

import DIU.Controlador.ControladorTransaccion;
import static DIU.Controlador.ControladorTransaccion.agregarTransaccion;
import DIU.Modelo.Transaccion;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import javax.swing.JOptionPane;



/**
 *
 * @author tutut
 */
public class Registro extends javax.swing.JInternalFrame {

    /**
     * Creates new form Registro
     */
    public Registro() {
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

        jPanel1 = new javax.swing.JPanel();
        btnVerReg = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblDescripcion = new javax.swing.JLabel();
        lblEoI = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        txtDescripcion = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        cbxEoI = new javax.swing.JComboBox<>();
        btnLimpiar = new javax.swing.JButton();
        txtValor = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        btnVerReg.setBackground(new java.awt.Color(255, 255, 255));
        btnVerReg.setForeground(new java.awt.Color(0, 0, 0));
        btnVerReg.setText("Ver registros");
        btnVerReg.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVerReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRegActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Registrar ingresos o egresos");

        lblFecha.setForeground(new java.awt.Color(0, 0, 0));
        lblFecha.setText("Fecha y hora (yyyy-MM-dd):");

        lblDescripcion.setForeground(new java.awt.Color(0, 0, 0));
        lblDescripcion.setText("Descripcion:");

        lblEoI.setForeground(new java.awt.Color(0, 0, 0));
        lblEoI.setText("Que desea ingresar?:");

        lblValor.setForeground(new java.awt.Color(0, 0, 0));
        lblValor.setText("Valor a ingresar:");

        txtFecha.setBackground(new java.awt.Color(255, 255, 255));
        txtFecha.setForeground(new java.awt.Color(0, 0, 0));

        txtDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        txtDescripcion.setForeground(new java.awt.Color(0, 0, 0));

        btnRegistrar.setBackground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setForeground(new java.awt.Color(0, 0, 0));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        cbxEoI.setBackground(new java.awt.Color(204, 204, 204));
        cbxEoI.setForeground(new java.awt.Color(0, 0, 0));
        cbxEoI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ingreso", "Egreso" }));
        cbxEoI.setToolTipText("");
        cbxEoI.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btnLimpiar.setBackground(new java.awt.Color(255, 255, 255));
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        txtValor.setBackground(new java.awt.Color(255, 255, 255));
        txtValor.setForeground(new java.awt.Color(0, 0, 0));

        btnEliminar.setBackground(new java.awt.Color(255, 255, 255));
        btnEliminar.setForeground(new java.awt.Color(0, 0, 0));
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lblDescripcion)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(btnVerReg)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(lblFecha)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(102, 102, 102)
                                    .addComponent(btnRegistrar)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblEoI)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxEoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(182, 182, 182)
                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblValor)
                                .addGap(18, 18, 18)
                                .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDescripcion)
                    .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVerReg))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblEoI)
                    .addComponent(cbxEoI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLimpiar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEliminar)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblValor)
                        .addComponent(txtValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        // TODO add your handling code here:
    String tipoTransaccion = cbxEoI.getSelectedItem().toString();
    String descripcion = txtDescripcion.getText();
    String fecha = txtFecha.getText();
    
   
    LocalDate fechaTransaccion = null;
    try {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd"); 
        fechaTransaccion = LocalDate.parse(fecha, formatter);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Error al convertir la fecha.", "Error", JOptionPane.ERROR_MESSAGE);
        return; 
    }
    
   double valor = 0.0;
        try {
            valor = Double.parseDouble(txtValor.getText().replace(",", ""));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "El valor ingresado no es válido.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

    
    Transaccion transaccion = new Transaccion();
    transaccion.setTipo(tipoTransaccion);
    transaccion.setDescripcion(descripcion);
    transaccion.setFecha(fechaTransaccion);
    transaccion.setMonto(valor);
    
     boolean exito = agregarTransaccion(transaccion);
    
    if (exito) {
        JOptionPane.showMessageDialog(this, "La transacción se registró correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "Error al registrar la transacción.", "Error", JOptionPane.ERROR_MESSAGE);
    }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        // TODO add your handling code here:
         txtDescripcion.setText("");
    txtFecha.setText("");
    txtValor.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnVerRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegActionPerformed
        // TODO add your handling code here:
        TabRegistros reg1 = new TabRegistros();
        Menu.escritorio.add(reg1);
        reg1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVerRegActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
          java.sql.Date fecha = java.sql.Date.valueOf(txtFecha.getText());
    String descripcion = txtDescripcion.getText();
        boolean exito = ControladorTransaccion.eliminarTransacciones(fecha, descripcion);
    if (exito) {
        JOptionPane.showMessageDialog(this, "Transacciones eliminadas correctamente.");
    } else {
        JOptionPane.showMessageDialog(this, "Error al eliminar transacciones.");
    }     
    }//GEN-LAST:event_btnEliminarActionPerformed

   
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVerReg;
    private javax.swing.JComboBox<String> cbxEoI;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblEoI;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtDescripcion;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
