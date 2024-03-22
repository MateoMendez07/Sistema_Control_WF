/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package DIU.Vista;
import DIU.Controlador.ConexionBdd;
import DIU.Controlador.ControladorSaldo;
import DIU.Modelo.Saldo;
import DIU.Modelo.Transaccion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author tutut
 */
public class TabRegistros extends javax.swing.JInternalFrame {
    ArrayList<Transaccion> listaTransacciones = new ArrayList<>();
    private DefaultTableModel modeloTabla;
    

    public TabRegistros() {
        initComponents();
        setModel();
       
    }

 private void setModel() {
        modeloTabla = new DefaultTableModel();
        String[] cabecera = {"Nro", "Fecha", "Descripción", "Monto","Tipo Transacción"};
        modeloTabla.setColumnIdentifiers(cabecera);
        jTable1.setModel(modeloTabla);
    }

   private void obtenerTransacciones() {
    try {
        Connection conn = ConexionBdd.obtenerConexion(); // Obtén la conexión a la base de datos
        String consulta = "SELECT * FROM transacciones";
        PreparedStatement pstmt = conn.prepareStatement(consulta);
        ResultSet resultado = pstmt.executeQuery();

        int nro = 1; // Inicializa el número de fila

        while (resultado.next()) {
            Transaccion transaccion = new Transaccion();
            transaccion.setFecha(resultado.getObject("Fecha", LocalDate.class));
            transaccion.setDescripcion(resultado.getString("Descripcion"));
            transaccion.setMonto(resultado.getDouble("Monto"));
            transaccion.setTipo(resultado.getString("TipoTransaccion"));
            listaTransacciones.add(transaccion);

            // Agrega los datos a la tabla
            Object[] fila = {nro, transaccion.getFecha(), transaccion.getDescripcion(), transaccion.getMonto(), transaccion.getTipo()};
            modeloTabla.addRow(fila);
            nro++;
        }

        resultado.close();
        pstmt.close();
        // No cierres la conexión aquí
    } catch (SQLException e) {
        System.err.println("Error al obtener las transacciones: " + e.getMessage());
    }
}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        btnVerReg = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnVerSaldoT = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameActivated(evt);
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

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

        btnVerReg.setText("Ver registros");
        btnVerReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerRegActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnVerSaldoT.setText("Ver saldo");
        btnVerSaldoT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerSaldoTActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnVerReg)
                        .addGap(29, 29, 29)
                        .addComponent(btnVolver)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnVerSaldoT)
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnVerReg)
                            .addComponent(btnVolver))
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnVerSaldoT)
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameActivated(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameActivated
       // Obtener la lista de datos de transacciones utilizando la instancia existente 


    }//GEN-LAST:event_formInternalFrameActivated

    private void btnVerRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerRegActionPerformed
        // TODO add your handling code here:
        obtenerTransacciones(); 
    }//GEN-LAST:event_btnVerRegActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
      Registro registro = new Registro();
        getParent().add(registro);
        registro.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void btnVerSaldoTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerSaldoTActionPerformed
        // TODO add your handling code here:
      double saldoTotal = ControladorSaldo.obtenerSaldoTotal();

           jTextField1.setText(String.valueOf(saldoTotal));
    }//GEN-LAST:event_btnVerSaldoTActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVerReg;
    private javax.swing.JButton btnVerSaldoT;
    private javax.swing.JButton btnVolver;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
