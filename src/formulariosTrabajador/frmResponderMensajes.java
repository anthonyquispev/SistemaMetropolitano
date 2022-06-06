package formulariosTrabajador;

import configuracion.Metropolitano;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class frmResponderMensajes extends javax.swing.JInternalFrame {

    public frmResponderMensajes() {
        initComponents();
        this.btnResponder.setEnabled(true);
        this.cargarTabla();
    }

    private void cargarTabla() {
        String[] titulos = {"DNI", "Fecha", "Nombres"};
        String[][] datos = Metropolitano.personas.getMensajes();
        DefaultTableModel modelo = new DefaultTableModel(datos, titulos);
        this.tblMensajes.setModel(modelo);
    }

    private void cargarMensajeCliente() {
        String mensaje = Metropolitano.mensajeActual.getMensajeCliente();
        this.txtMensajeCliente.setText(mensaje);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblMensajes = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtMensajeCliente = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtMensajeTrabajador = new javax.swing.JTextArea();
        btnResponder = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblMensajes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "", "", "", ""
            }
        ));
        tblMensajes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblMensajesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblMensajes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 550, 370));

        txtMensajeCliente.setColumns(20);
        txtMensajeCliente.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtMensajeCliente.setForeground(new java.awt.Color(0, 0, 0));
        txtMensajeCliente.setRows(5);
        txtMensajeCliente.setEnabled(false);
        jScrollPane2.setViewportView(txtMensajeCliente);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 80, 500, 130));

        txtMensajeTrabajador.setColumns(20);
        txtMensajeTrabajador.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txtMensajeTrabajador.setForeground(new java.awt.Color(0, 0, 0));
        txtMensajeTrabajador.setRows(5);
        jScrollPane3.setViewportView(txtMensajeTrabajador);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 260, 500, 120));

        btnResponder.setBackground(new java.awt.Color(204, 0, 51));
        btnResponder.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnResponder.setForeground(new java.awt.Color(0, 0, 0));
        btnResponder.setText("RESPONDER");
        btnResponder.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        btnResponder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResponderActionPerformed(evt);
            }
        });
        jPanel1.add(btnResponder, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 400, 240, 50));

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel1.setText("Respuesta:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 240, -1, -1));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("Mensaje:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 60, -1, -1));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblMensajesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblMensajesMouseClicked
        this.btnResponder.setEnabled(true);
        int sel = this.tblMensajes.rowAtPoint(evt.getPoint());
        String dni = String.valueOf(this.tblMensajes.getValueAt(sel, 0));
        Metropolitano.clienteActual = Metropolitano.personas.getCliente(dni);
        String fecha = String.valueOf(this.tblMensajes.getValueAt(sel, 1));
        Metropolitano.mensajeActual = Metropolitano.clienteActual.getMensaje(fecha);
        cargarMensajeCliente();
    }//GEN-LAST:event_tblMensajesMouseClicked

    private void btnResponderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResponderActionPerformed
        String mensajeTrabajador = this.txtMensajeTrabajador.getText();
        Metropolitano.mensajeActual.setMensajeTrabajador(mensajeTrabajador);
        JOptionPane.showMessageDialog(this, "Respuesta registrada con éxito");
        Metropolitano.mensajeActual.setbRespondido(true);
        this.txtMensajeCliente.setText("");
        this.txtMensajeTrabajador.setText("");
        this.cargarTabla();
        this.btnResponder.setEnabled(false);
    }//GEN-LAST:event_btnResponderActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnResponder;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable tblMensajes;
    private javax.swing.JTextArea txtMensajeCliente;
    private javax.swing.JTextArea txtMensajeTrabajador;
    // End of variables declaration//GEN-END:variables
}
