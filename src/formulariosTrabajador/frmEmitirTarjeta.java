package formulariosTrabajador;

import configuracion.Metropolitano;
import entidades.*;
import enumerados.*;
import javax.swing.JOptionPane;

public class frmEmitirTarjeta extends javax.swing.JInternalFrame {

    public frmEmitirTarjeta() {
        initComponents();
        cargarComboDni();
        cargarComboEstaciones();
    }

    private void cargarComboEstaciones() {
        String[] estaciones = Metropolitano.estaciones.getNombresSinEstVirtual();
        for (String estacion : estaciones) {
            this.cboEstaciones.addItem(estacion);
        }
    }

    private void cargarComboDni() {
        String[] dnis = Metropolitano.personas.getDnis(2);
        for (String dni : dnis) {
            this.cboDni.addItem(dni);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cboDni = new javax.swing.JComboBox<>();
        cboTipoTarjeta = new javax.swing.JComboBox<>();
        btnEmitirTarjeta = new javax.swing.JButton();
        cboEstaciones = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellidoPaterno = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtApellidoMaterno = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cboDni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        cboDni.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        cboDni.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboDniActionPerformed(evt);
            }
        });
        jPanel1.add(cboDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 50, 170, 48));

        cboTipoTarjeta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "GENERAL", "UNIVERSITARIO", "ESCOLAR" }));
        cboTipoTarjeta.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        jPanel1.add(cboTipoTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 390, 170, 40));

        btnEmitirTarjeta.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        btnEmitirTarjeta.setForeground(new java.awt.Color(0, 0, 0));
        btnEmitirTarjeta.setText("EMITIR TARJETA");
        btnEmitirTarjeta.setBorder(javax.swing.BorderFactory.createMatteBorder(3, 3, 3, 3, new java.awt.Color(51, 0, 0)));
        btnEmitirTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmitirTarjetaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmitirTarjeta, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 470, 220, 90));

        cboEstaciones.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        cboEstaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboEstacionesActionPerformed(evt);
            }
        });
        jPanel1.add(cboEstaciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 340, 170, 40));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("TIPO DE TARJETA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 390, 130, 40));

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("NOMBRES:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 130, 150, 40));

        txtNombre.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        txtNombre.setEnabled(false);
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 130, 170, 40));

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("APELLIDO PATERNO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 190, 150, 40));

        txtApellidoPaterno.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtApellidoPaterno.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        txtApellidoPaterno.setEnabled(false);
        jPanel1.add(txtApellidoPaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 190, 170, 40));

        jLabel6.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel6.setText("APELLIDO MATERNO:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 250, 150, 40));

        txtApellidoMaterno.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        txtApellidoMaterno.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), new java.awt.Color(102, 0, 51)));
        txtApellidoMaterno.setEnabled(false);
        jPanel1.add(txtApellidoMaterno, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 250, 170, 40));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel9.setText("DNI:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 50, 80, 50));

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("ESTACIÓN:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 340, 110, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/subway_100px2.png"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 20, 100, 120));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/metropolitanoTaquilla.jpg"))); // NOI18N
        jLabel7.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(102, 0, 0)));
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, 620, 470));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 310, 340, 20));

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cboDniActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboDniActionPerformed
        String dni = this.cboDni.getSelectedItem().toString();
        Metropolitano.clienteActual = Metropolitano.personas.getCliente(dni);
        this.txtNombre.setText(Metropolitano.clienteActual.getNombres());
        this.txtApellidoPaterno.setText(Metropolitano.clienteActual.getApellidoPaterno());
        this.txtApellidoMaterno.setText(Metropolitano.clienteActual.getApellidoMaterno());
    }//GEN-LAST:event_cboDniActionPerformed

    private void btnEmitirTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmitirTarjetaActionPerformed

        String tipoTarjeta = this.cboTipoTarjeta.getSelectedItem().toString();
        EnumTipoTarjeta tipo = null;
        switch (tipoTarjeta) {
            case "ESCOLAR":
                tipo = EnumTipoTarjeta.ESCOlAR;
                break;
            case "UNIVERSITARIO":
                tipo = EnumTipoTarjeta.UNIVERSITARIO;
                break;
            case "GENERAL":
                tipo = EnumTipoTarjeta.GENERAL;
                break;
        }
        String codigo = Metropolitano.personas.validarCodigo();
        double saldoInicial = 0;
        Tarjeta t = Metropolitano.estacionActual.getTaquilla().emitirTarjeta(tipo, saldoInicial, codigo);
        if(Metropolitano.clienteActual.agregarTarjeta(t)){
            JOptionPane.showMessageDialog(this, "Agregado con éxito");
        }
    }//GEN-LAST:event_btnEmitirTarjetaActionPerformed

    private void cboEstacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboEstacionesActionPerformed
        String nombreEstacion = this.cboEstaciones.getSelectedItem().toString();
        Metropolitano.estacionActual = Metropolitano.estaciones.getEstacion(nombreEstacion);
    }//GEN-LAST:event_cboEstacionesActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEmitirTarjeta;
    private javax.swing.JComboBox<String> cboDni;
    private javax.swing.JComboBox<String> cboEstaciones;
    private javax.swing.JComboBox<String> cboTipoTarjeta;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField txtApellidoMaterno;
    private javax.swing.JTextField txtApellidoPaterno;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
